package teamwu.underworld.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import teamwu.underworld.UnderWorldMod;

public class UWBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, UnderWorldMod.MODID);

    public static final RegistryObject<Block> TESTBLOCK = BLOCKS.register("testblock", () -> new Block(
            BlockBehaviour.Properties.of(Material.STONE)
                    .sound(SoundType.WET_GRASS)
                    .friction(-1.0f)));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
