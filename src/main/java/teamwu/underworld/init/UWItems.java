package teamwu.underworld.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import teamwu.underworld.UnderWorldMod;

public class UWItems {
    public static final CreativeModeTab TAB = new CreativeModeTab("uw_creative_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(UWBlocks.GNEISS_STONE.get());
        }
    };

    private static final Item.Properties PROPERTIES = new Item.Properties()
            .tab(UWItems.TAB);

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, UnderWorldMod.MODID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
