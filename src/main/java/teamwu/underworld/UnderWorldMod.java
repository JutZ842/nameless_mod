package teamwu.underworld;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import teamwu.underworld.init.UWBlockItems;
import teamwu.underworld.init.UWBlocks;

@Mod(UnderWorldMod.MODID)
public class UnderWorldMod {
    private static final Logger LOGGER = LogUtils.getLogger();

    public static final String MODID = "underworld";

    public UnderWorldMod() {
        IEventBus EVENT_BUS = FMLJavaModLoadingContext.get().getModEventBus();
        EVENT_BUS.addListener(this::setup);
        MinecraftForge.EVENT_BUS.register(this);

        UWBlocks.register(EVENT_BUS);
        UWBlockItems.register(EVENT_BUS);
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("Hello from CommonSetup");
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("HELLO from server starting");
    }
}
