package teamwu.underworld;

import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import software.bernie.geckolib3.GeckoLib;
import teamwu.underworld.client.GragronRenderer;
import teamwu.underworld.client.models.GragronModel;
import teamwu.underworld.entities.GragronEntity;
import teamwu.underworld.init.UWEntityInit;
import teamwu.underworld.init.UWBlocks;
import teamwu.underworld.init.UWDimensions;
import teamwu.underworld.init.UWItems;

@Mod(UnderWorldMod.MODID)
public class UnderWorldMod {
    private static final Logger LOGGER = LogUtils.getLogger();

    public static final String MODID = "underworld";

    public UnderWorldMod() {
        IEventBus EVENT_BUS = FMLJavaModLoadingContext.get().getModEventBus();
        EVENT_BUS.addListener(this::setup);
        MinecraftForge.EVENT_BUS.register(this);

        UWBlocks.register(EVENT_BUS);
        UWItems.register(EVENT_BUS);
        UWDimensions.register();
        UWEntityInit.register(EVENT_BUS);

        GeckoLib.initialize();

        //EntityRenderers.register(EntityInit.EAGLE.get(), EagleRenderer::new);
        EntityRenderers.register(UWEntityInit.GRAGRON.get(), GragronRenderer::new);
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("Hello from CommonSetup");

    }

    @Mod.EventBusSubscriber(modid = UnderWorldMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class Events{
        /*@SubscribeEvent
        public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
            event.put(EntityInit.EAGLE.get(), EagleEntity.createAttributes().build());
        }*/
        @SubscribeEvent
        public static void entityAttributes(EntityAttributeCreationEvent event){
            event.put(UWEntityInit.GRAGRON.get(), GragronEntity.attributes());
        }
        @SubscribeEvent
        public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event){
            event.registerLayerDefinition(GragronModel.LAYER_LOCATION, GragronModel::createBodyLayer);
        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("HELLO from server starting");
    }
}
