package teamwu.underworld.entities;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;
import teamwu.underworld.UnderWorldMod;

public class EagleRenderer extends GeoEntityRenderer<EagleEntity> {
    public EagleRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new EagleModel());
        this.shadowRadius = .5f;
        this.shadowStrength = 1.0f;
    }

    @Override
    public ResourceLocation getTextureLocation(EagleEntity instance) {
        return new ResourceLocation(UnderWorldMod.MODID, "textures/block/entity/eagle.png)");
    }

    @Override
    public RenderType getRenderType(EagleEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.8F, 0.8F, 0.8F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
