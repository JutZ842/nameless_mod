package teamwu.underworld.init;

import net.minecraft.core.Registry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;
import teamwu.underworld.UnderWorldMod;

@Mod.EventBusSubscriber(modid = UnderWorldMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class UWBlockItems {
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> r = event.getRegistry();
        r.register(blockItem(UWBlocks.HORNFELS_STONE.get()));
        r.register(blockItem(UWBlocks.GNEISS_STONE.get()));
    }

    private static Item blockItem(Block block) {
        return new BlockItem(block, new Item.Properties()).setRegistryName(block.getRegistryName());
    }
}
