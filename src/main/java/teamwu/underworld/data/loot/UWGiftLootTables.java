package teamwu.underworld.data.loot;

import net.minecraft.data.loot.GiftLoot;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootTable;
import org.jetbrains.annotations.NotNull;

import java.util.function.BiConsumer;

public class UWGiftLootTables extends GiftLoot {
    @Override
    public void accept(@NotNull BiConsumer<ResourceLocation, LootTable.Builder> resourceLocationBuilderBiConsumer) {
        super.accept(resourceLocationBuilderBiConsumer);
    }
}
