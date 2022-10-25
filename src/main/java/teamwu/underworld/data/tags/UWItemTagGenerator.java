package teamwu.underworld.data.tags;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;
import teamwu.underworld.UnderWorldMod;

public class UWItemTagGenerator extends ItemTagsProvider {
    public UWItemTagGenerator(DataGenerator pGenerator, BlockTagsProvider pBlockTagsProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(pGenerator, pBlockTagsProvider, UnderWorldMod.MODID, existingFileHelper);
    }
    //create tags here
    //exam public static final TagKey<Item>NAME = ItemTags.create(new ResourceLocation(modid or forge, path))
    //BlockTags need an Itemtag too! use the "copy()" method


    //generate tags and add members here
    @Override
    protected void addTags() {

    }
}
