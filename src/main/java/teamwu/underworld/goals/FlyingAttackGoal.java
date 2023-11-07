package teamwu.underworld.goals;

import net.minecraft.world.entity.ai.goal.Goal;

public class FlyingAttackGoal extends Goal {

    float range;
    float damage;
    float velocity;
    float acceleration;

    @Override
    public boolean canUse() {
        return true;
    }

    @Override
    public void start() {

    }

    @Override
    public void tick() {

    }
}
