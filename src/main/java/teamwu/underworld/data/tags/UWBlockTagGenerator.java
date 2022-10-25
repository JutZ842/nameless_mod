package teamwu.underworld.data.tags;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;
import teamwu.underworld.UnderWorldMod;

public class UWBlockTagGenerator extends BlockTagsProvider {
    public UWBlockTagGenerator(DataGenerator pGenerator, @Nullable ExistingFileHelper existingFileHelper) {
        super(pGenerator, UnderWorldMod.MODID, existingFileHelper);
    }
    //create tags here
    //exam public static final TagKey<Block>NAME = BlockTags.create(new ResourceLocation(modid/forge, path))


    //generate tags and add members here
    @Override
    protected void addTags() {

    }
}
