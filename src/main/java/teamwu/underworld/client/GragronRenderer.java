package teamwu.underworld.client;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import teamwu.underworld.UnderWorldMod;
import teamwu.underworld.client.models.GragronModel;
import teamwu.underworld.entities.Gragron;

public class GragronRenderer extends MobRenderer<Gragron, GragronModel> {

    public GragronRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new GragronModel(pContext.bakeLayer(GragronModel.LAYER_LOCATION)), .5f);
    }

    @Override
    public ResourceLocation getTextureLocation(Gragron pEntity) {
        return new ResourceLocation(UnderWorldMod.MODID, "textures/block/entity/gragron.png)");
    }
}
