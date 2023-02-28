package teamwu.underworld.entity;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import teamwu.underworld.UnderWorldMod;

public class EagleModel extends AnimatedGeoModel<EagleEntity> {

    @Override
    public ResourceLocation getModelLocation(EagleEntity object) {
        return new ResourceLocation(UnderWorldMod.MODID, "geo/eagle.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(EagleEntity object) {
        return new ResourceLocation(UnderWorldMod.MODID, "textures/entity/eagle.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(EagleEntity animatable) {
        return new ResourceLocation(UnderWorldMod.MODID, "animations/eagle.animation.json");
    }
}
