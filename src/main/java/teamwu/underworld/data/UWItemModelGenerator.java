package teamwu.underworld.data;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import teamwu.underworld.UnderWorldMod;
import teamwu.underworld.init.UWBlocks;

public class UWItemModelGenerator extends ItemModelProvider {
    public UWItemModelGenerator(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, UnderWorldMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //block below this line
        blockItemModel(UWBlocks.GNEISS_STONE.get().asItem());
        blockItemModel(UWBlocks.HORNFELS_STONE.get().asItem());
        blockItemModel(UWBlocks.GREENSCHIST_STONE.get().asItem());
        blockItemModel(UWBlocks.HORNFELS_STONE_WHITE.get().asItem());
        blockItemModel(UWBlocks.HORNFELS_STONE_GRAY.get().asItem());
        blockItemModel(UWBlocks.HORNFELS_COBBLE.get().asItem());

        //items below this line

    }
    private ItemModelBuilder blockItemModel(Item item){
        return withExistingParent(item.getRegistryName().getPath(), new ResourceLocation(UnderWorldMod.MODID, "block/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder handheldItemModel(Item item){
        return withExistingParent(item.getRegistryName().getPath(), new ResourceLocation("item/handheld")).texture("layer0", new ResourceLocation(UnderWorldMod.MODID, "item/" + item.getRegistryName().getPath()));
    }
}
