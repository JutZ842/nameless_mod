package teamwu.underworld.data.loot;

import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;
import teamwu.underworld.init.UWBlocks;

public class UWBlockLootTables extends BlockLoot {
    @Override
    protected void addTables() {
        dropSelf(UWBlocks.GNEISS_STONE.get());
        dropSelf(UWBlocks.HORNFELS_STONE.get());
        dropSelf(UWBlocks.GREENSCHIST_STONE.get());
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return UWBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
