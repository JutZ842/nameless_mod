package teamwu.underworld.init;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import teamwu.underworld.UnderWorldMod;

@Mod.EventBusSubscriber(modid = UnderWorldMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class UWBlockItems {
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                );
    }

    private static Item bi(Block block) {
        return new BlockItem(block, new Item.Properties()).setRegistryName(block.getRegistryName());
    }
}
