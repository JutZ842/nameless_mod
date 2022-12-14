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

    public static final RegistryObject<Block> HORNFELS_STONE = BLOCKS.register("stone_hornfels", () ->
            new Block(
                    BlockBehaviour.Properties.of(Material.STONE)
                            .explosionResistance(10.0f)
                            .strength(2.0f)
                            .sound(SoundType.DEEPSLATE)
                            .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GNEISS_STONE = BLOCKS.register("stone_gneiss", () ->
            new Block(
                    BlockBehaviour.Properties.of(Material.STONE)
                            .explosionResistance(5.5f)
                            .strength(1.25f)
                            .sound(SoundType.DEEPSLATE)
                            .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GREENSCHIST_STONE = BLOCKS.register("stone_greenschist", () ->
            new Block(
                    BlockBehaviour.Properties.of(Material.STONE)
                            .explosionResistance(5.5f)
                            .strength(1.25f)
                            .sound(SoundType.DEEPSLATE)
                            .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> HORNFELS_STONE_WHITE = BLOCKS.register("stone_white_hornfels", () ->
            new Block(
                    BlockBehaviour.Properties.of(Material.STONE)
                            .explosionResistance(10.0f)
                            .strength(2.0f)
                            .sound(SoundType.DEEPSLATE)
                            .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> HORNFELS_STONE_GRAY = BLOCKS.register("stone_gray_hornfels", () ->
            new Block(
                    BlockBehaviour.Properties.of(Material.STONE)
                            .explosionResistance(10.0f)
                            .strength(2.0f)
                            .sound(SoundType.DEEPSLATE)
                            .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> HORNFELS_COBBLE = BLOCKS.register("cobble_hornfels", () ->
            new Block(
                    BlockBehaviour.Properties.of(Material.STONE)
                            .explosionResistance(10.0f)
                            .strength(2.0f)
                            .sound(SoundType.DEEPSLATE)
                            .requiresCorrectToolForDrops()));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
