package teamwu.underworld.init;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import teamwu.underworld.UnderWorldMod;
import teamwu.underworld.entity.EagleEntity;

public class EntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, UnderWorldMod.MODID);

    public static final RegistryObject<EntityType<EagleEntity>> EAGLE = ENTITIES.register("eagle",
            () -> EntityType.Builder.of(EagleEntity::new, MobCategory.MONSTER)
                    .sized(1, 1)
                    .build(new ResourceLocation(UnderWorldMod.MODID, "eagle").toString()));

    public static void register(IEventBus eventBus){
        ENTITIES.register(eventBus);
    }
}
