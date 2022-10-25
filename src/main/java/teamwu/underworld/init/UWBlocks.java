package teamwu.underworld.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import teamwu.underworld.UnderWorldMod;

public class UWBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, UnderWorldMod.MODID);

    public static final RegistryObject<Block> HORNFELS_STONE = BLOCKS.register("stone_hornfels", () ->
            new Block(
                    BlockBehaviour.Properties.of(Material.STONE)
                            .explosionResistance(10.0f)
                            .strength(2.0f)));
    public static final RegistryObject<Block> GNEISS_STONE = BLOCKS.register("stone_gneiss", () ->
            new Block(
                    BlockBehaviour.Properties.of(Material.STONE)
                        .explosionResistance(5.5f)
                        .strength(1.25f)));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
