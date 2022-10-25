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
        UWBlockItemModel(UWBlocks.GNEISS_STONE.get().asItem());
        UWBlockItemModel(UWBlocks.HORNFELS_STONE.get().asItem());
    }
    private ItemModelBuilder UWBlockItemModel(Item item){
        return withExistingParent(item.getRegistryName().getPath(), new ResourceLocation("block/" + item.getRegistryName().getPath()));
    }
    private ItemModelBuilder UWHandheldItemModel(Item item){
        return withExistingParent(item.getRegistryName().getPath(), new ResourceLocation("item/handheld")).texture("layer0", new ResourceLocation(UnderWorldMod.MODID, "item/" + item.getRegistryName().getPath()));
    }
}
