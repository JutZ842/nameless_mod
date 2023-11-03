package teamwu.underworld.init;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import teamwu.underworld.UnderWorldMod;
import teamwu.underworld.entities.EagleEntity;
import teamwu.underworld.entities.Gragron;

public class UWEntityInit {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, UnderWorldMod.MODID);

    public static final RegistryObject<EntityType<Gragron>> GRAGRON = ENTITIES.register("gragron",
            () -> EntityType.Builder.of(Gragron::new, MobCategory.CREATURE)
                    .build(new ResourceLocation(UnderWorldMod.MODID, "gragron").toString()));

    public static final RegistryObject<EntityType<EagleEntity>> EAGLE = ENTITIES.register("eagle",
            () -> EntityType.Builder.of(EagleEntity::new, MobCategory.MONSTER)
                    .sized(1, 1)
                    .build(new ResourceLocation(UnderWorldMod.MODID, "eagle").toString()));

    public static void register(IEventBus eventBus){
        ENTITIES.register(eventBus);
    }
}
