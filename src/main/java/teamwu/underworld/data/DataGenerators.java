package teamwu.underworld.data;


import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import teamwu.underworld.UnderWorldMod;
import teamwu.underworld.data.tags.UWBlockTagGenerator;
import teamwu.underworld.data.tags.UWItemTagGenerator;

@Mod.EventBusSubscriber(modid = UnderWorldMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        if(event.includeServer()){
            generator.addProvider(new UWLootTableProvider(generator));
            generator.addProvider(new UWRecipeGenerator(generator));

            BlockTagsProvider blockTagsProvider = new UWBlockTagGenerator(generator, existingFileHelper);
            generator.addProvider(new UWItemTagGenerator(generator, blockTagsProvider, existingFileHelper));
        }
        if(event.includeClient()){
            generator.addProvider(new UWBlockStateGenerator(generator, existingFileHelper));
            generator.addProvider(new UWItemModelGenerator(generator, existingFileHelper));
        }

    }
}
