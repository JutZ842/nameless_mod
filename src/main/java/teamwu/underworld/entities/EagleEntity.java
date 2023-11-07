package teamwu.underworld.entities;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.FlyingAnimal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.util.GeckoLibUtil;
import teamwu.underworld.goals.FlyingAttackGoal;

public class EagleEntity extends Animal implements IAnimatable, FlyingAnimal {
    private AnimationFactory factory = GeckoLibUtil.createFactory(this);

    public EagleEntity(EntityType<? extends Animal> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event){
        if(event.isMoving() && !isFlying()) {
            //temp solution have to look in animations!
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.eagle.walk"));
        } else if(event.isMoving() && isFlying()){
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.eagle.fly"));
        } else {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("aimation.eagle.idle"));
        }
        return PlayState.CONTINUE;
    }

    public static AttributeSupplier.Builder createAttributes(){
        return Animal.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 30d)
                .add(Attributes.ATTACK_DAMAGE, 5.0f)
                .add(Attributes.ARMOR, 10.0f)
                .add(Attributes.ATTACK_KNOCKBACK, 10.f)
                .add(Attributes.ATTACK_SPEED, 3.0f)
                .add(Attributes.FOLLOW_RANGE, 160)
                .add(Attributes.LUCK, 560)
                .add(Attributes.MOVEMENT_SPEED, .05f);
    }

    protected void registerGoals(){
        this.goalSelector.addGoal(0, new FlyingAttackGoal());

        this.targetSelector.addGoal(0, new NearestAttackableTargetGoal<>(this, Player.class, false));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, Animal.class, false));
    }

    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController<>(this, "controller", 0, this::predicate));
    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel pLevel, AgeableMob pOtherParent) {
        return null;
    }
    @Override
    public boolean shouldRiderSit() {
        return true;
    }

    @Override
    public boolean canRiderInteract() {
        return true;
    }

    @Override
    public boolean isFlying() {
        return !this.onGround;
    }

    @Override
    protected void playStepSound(BlockPos pPos, BlockState pState) {
        this.playSound(SoundEvents.BEACON_ACTIVATE, 1f, 1);
    }

    @Override
    protected void playHurtSound(DamageSource pSource) {
        this.playSound(SoundEvents.GHAST_HURT, 1f, 0);
    }

    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.ENDER_DRAGON_DEATH;
    }

    @Override
    protected float getSoundVolume() {
        return .5f;
    }
}
