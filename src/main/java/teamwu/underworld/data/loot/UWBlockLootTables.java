package teamwu.underworld.data.loot;

import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;
import teamwu.underworld.init.UWBlocks;

public class UWBlockLootTables extends BlockLoot {
    @Override
    protected void addTables() {
        dropSelf(UWBlocks.TESTBLOCK.get());
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return UWBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
