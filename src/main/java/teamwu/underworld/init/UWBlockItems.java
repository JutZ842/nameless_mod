package teamwu.underworld.init;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import teamwu.underworld.UnderWorldMod;

public class UWBlockItems {
    private static final DeferredRegister<Item> BLOCKITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, UnderWorldMod.MODID);

    public static void register(IEventBus eventBus) {
        BLOCKITEMS.register(eventBus);
    }

    public static void registerBlockItems() {
        //registerBlockItems(...);
    }

    @SafeVarargs
    private static void registerBlockItems(RegistryObject<Block>... blocks) {
        for (var block : blocks) {
            BLOCKITEMS.register(block.getId().getPath(), () ->
                    new BlockItem(block.get(),
                            new Item.Properties()
                                    .tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        }
    }
}
