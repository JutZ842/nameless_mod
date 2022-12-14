package teamwu.underworld.data;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.LootTables;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSet;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import org.jetbrains.annotations.NotNull;
import teamwu.underworld.data.loot.UWBlockLootTables;
import teamwu.underworld.data.loot.UWChestLootTables;
import teamwu.underworld.data.loot.UWEntityLootTables;
import teamwu.underworld.data.loot.UWGiftLootTables;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class UWLootTableProvider extends LootTableProvider {


    public UWLootTableProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected @NotNull List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootContextParamSet>> getTables() {
        return ImmutableList.of(
                Pair.of(UWBlockLootTables::new, LootContextParamSets.BLOCK),
                Pair.of(UWChestLootTables::new, LootContextParamSets.CHEST)
                //Pair.of(UWEntityLootTables::new, LootContextParamSets.ENTITY),
                //Pair.of(UWGiftLootTables::new, LootContextParamSets.GIFT)
        );
    }

    @Override
    protected void validate(Map<ResourceLocation, LootTable> map, @NotNull ValidationContext validationtracker) {
        map.forEach((id, table) -> LootTables.validate(validationtracker, id, table));
    }
}
