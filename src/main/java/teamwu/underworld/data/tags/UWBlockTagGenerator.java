package teamwu.underworld.data.tags;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeBlockTagsProvider;
import org.jetbrains.annotations.Nullable;
import teamwu.underworld.UnderWorldMod;
import teamwu.underworld.init.UWBlocks;

public class UWBlockTagGenerator extends BlockTagsProvider {
    public UWBlockTagGenerator(DataGenerator pGenerator, @Nullable ExistingFileHelper existingFileHelper) {
        super(pGenerator, UnderWorldMod.MODID, existingFileHelper);
    }
    //create tags here
    //exam public static final TagKey<Block>NAME = BlockTags.create(new ResourceLocation(modid/forge, path))

    //generate tags and add members here
    @Override
    protected void addTags() {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(
                        UWBlocks.HORNFELS_STONE.get(),
                        UWBlocks.GNEISS_STONE.get(),
                        UWBlocks.GREENSCHIST_STONE.get(),
                        UWBlocks.HORNFELS_STONE_WHITE.get(),
                        UWBlocks.HORNFELS_STONE_GRAY.get(),
                        UWBlocks.HORNFELS_COBBLE.get()
                );
    }
}
