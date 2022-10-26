package teamwu.underworld.data;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import teamwu.underworld.UnderWorldMod;
import teamwu.underworld.init.UWBlocks;

public class UWBlockStateGenerator extends BlockStateProvider {
    public UWBlockStateGenerator(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, UnderWorldMod.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(UWBlocks.HORNFELS_STONE.get());
        simpleBlock(UWBlocks.GNEISS_STONE.get());
        simpleBlock(UWBlocks.GREENSCHIST_STONE.get());
        simpleBlock(UWBlocks.HORNFELS_STONE_WHITE.get());
        simpleBlock(UWBlocks.HORNFELS_STONE_GRAY.get());
        simpleBlock(UWBlocks.HORNFELS_COBBLE.get());
    }
}
