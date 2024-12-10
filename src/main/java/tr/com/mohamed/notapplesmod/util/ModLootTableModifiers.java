package tr.com.mohamed.notapplesmod.util;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.item.ItemConvertible;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import tr.com.mohamed.notapplesmod.items.ModItems;

import java.util.Collections;

public class ModLootTableModifiers {
    private static final Identifier igloo_chest_ID = Identifier.of("minecraft", "chests/igloo_chest");
    private static final Identifier buried_treasure_ID = Identifier.of("minecraft", "chests/buried_treasure");
    private static final Identifier desert_pyramid_ID = Identifier.of("minecraft", "chests/desert_pyramid");
    private static final Identifier abandoned_mineshaft_ID = Identifier.of("minecraft", "chests/abandoned_mineshaft");
    private static final Identifier stronghold_library_ID = Identifier.of("minecraft", "chests/stronghold_library");
    private static final Identifier spawn_bonus_chest_ID = Identifier.of("minecraft", "chests/spawn_bonus_chest");
    private static final Identifier shipwreck_treasure_ID = Identifier.of("minecraft", "chests/shipwreck_treasure");
    private static final Identifier ruined_portal_ID = Identifier.of("minecraft", "chests/ruined_portal");
    private static final Identifier nether_bridge_ID = Identifier.of("minecraft", "chests/nether_bridge");
    private static final Identifier end_city_treasure_ID = Identifier.of("minecraft", "chests/end_city_treasure");
    private static final Identifier underwater_ruin_small_ID = Identifier.of("minecraft", "chests/buried_treasure");
    private static final Identifier underwater_ruin_big_ID = Identifier.of("minecraft", "chests/buried_treasure");
    private static final Identifier jungle_temple_dispenser_ID = Identifier.of("minecraft", "chests/jungle_temple_dispenser");
    private static final Identifier village_weaponsmith_ID = Identifier.of("minecraft", "chests/village/village_weaponsmith");
    private static final Identifier village_toolsmith_ID = Identifier.of("minecraft", "chests/village/village_toolsmith");


    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((registryKey, builder, lootTableSource, wrapperLookup) -> {
            if (igloo_chest_ID.equals(registryKey.getValue())) {
                builder.pool(easyPoolBuilder(ModItems.STARS_APPLE, 0.05f));
                builder.pool(easyPoolBuilder(ModItems.EMERALD_APPLE, 0.2f));
                builder.pool(easyPoolBuilder(ModItems.MILK_APPLE, 0.5f));
                builder.pool(easyPoolBuilder(ModItems.SNOW_APPLE, 1f, 3f));
            }
            if (buried_treasure_ID.equals(registryKey.getValue()) || shipwreck_treasure_ID.equals(registryKey.getValue())) {
                builder.pool(easyPoolBuilder(ModItems.STARS_APPLE, 0.05f));
                builder.pool(easyPoolBuilder(ModItems.EMERALD_APPLE, 0.5f));
                builder.pool(easyPoolBuilder(ModItems.SPONGE_APPLE, 0.2f));
            }
            if (desert_pyramid_ID.equals(registryKey.getValue()) || abandoned_mineshaft_ID.equals(registryKey.getValue())) {
                builder.pool(easyPoolBuilder(ModItems.STARS_APPLE, 0.01f));
                builder.pool(easyPoolBuilder(ModItems.TNT_APPLE, 0.2f));
                builder.pool(easyPoolBuilder(ModItems.DIAMOND_APPLE, 0.2f));
                builder.pool(easyPoolBuilder(ModItems.REDSTONE_APPLE, 0.2f,2f));
                builder.pool(easyPoolBuilder(ModItems.GRAVEL_APPLE, 0.4f,2f));
                builder.pool(easyPoolBuilder(ModItems.SAND_APPLE, 0.4f, 2f));
            }
            if (stronghold_library_ID.equals(registryKey.getValue())) {
                builder.pool(easyPoolBuilder(ModItems.STARS_APPLE, 0.1f));
                builder.pool(easyPoolBuilder(ModItems.NETHERITE_APPLE, 0.2f));
                builder.pool(easyPoolBuilder(ModItems.COAL_APPLE, 0.8f, 2f));
            }
            if (spawn_bonus_chest_ID.equals(registryKey.getValue())) {
                builder.pool(easyPoolBuilder(ModItems.STARS_APPLE, 0.01f));
                builder.pool(easyPoolBuilder(ModItems.DIAMOND_APPLE, 0.2f));
                builder.pool(easyPoolBuilder(ModItems.DIRT_APPLE, 0.8f, 3f));
                builder.pool(easyPoolBuilder(ModItems.LEAVES_APPLE, 0.8f));
            }
            if (ruined_portal_ID.equals(registryKey.getValue()) || nether_bridge_ID.equals(registryKey.getValue())) {
                builder.pool(easyPoolBuilder(ModItems.STARS_APPLE, 0.01f));
                builder.pool(easyPoolBuilder(ModItems.NETHERITE_APPLE, 0.2f));
                builder.pool(easyPoolBuilder(ModItems.LAVA_APPLE, 0.4f, 3f));
                builder.pool(easyPoolBuilder(ModItems.IRON_APPLE, 0.5f, 2f));
                builder.pool(easyPoolBuilder(ModItems.ENDER_APPLE, 0.6f, 2f));
            }
            if (end_city_treasure_ID.equals(registryKey.getValue())) {
                builder.pool(easyPoolBuilder(ModItems.SAND_APPLE, 0.4f, 5f));
                builder.pool(easyPoolBuilder(ModItems.NETHERITE_APPLE, 0.6f));
                builder.pool(easyPoolBuilder(ModItems.DIAMOND_APPLE, 0.6f, 3f));
                builder.pool(easyPoolBuilder(ModItems.STARS_APPLE, 0.7f, 2f));
            }
            if (underwater_ruin_small_ID.equals(registryKey.getValue()) || underwater_ruin_big_ID.equals(registryKey.getValue())) {
                builder.pool(easyPoolBuilder(ModItems.CAT_APPLE, 0.1f));
                builder.pool(easyPoolBuilder(ModItems.SAND_APPLE, 0.4f, 2f));
                builder.pool(easyPoolBuilder(ModItems.GRAVEL_APPLE, 0.4f, 2f));
                builder.pool(easyPoolBuilder(ModItems.WATER_APPLE, 0.6f, 2f));
                builder.pool(easyPoolBuilder(ModItems.SPONGE_APPLE, 0.7f, 3f));
                builder.pool(easyPoolBuilder(ModItems.ENCHANTED_SPONGE_APPLE, 0.8f));
            }
            if (jungle_temple_dispenser_ID.equals(registryKey.getValue())) {
                builder.pool(easyPoolBuilder(ModItems.ENCHANTED_SPONGE_APPLE, 0.05f));
                builder.pool(easyPoolBuilder(ModItems.STARS_APPLE, 0.06f));
                builder.pool(easyPoolBuilder(ModItems.CAT_APPLE, 0.1f));
                builder.pool(easyPoolBuilder(ModItems.TNT_APPLE, 0.2f));
                builder.pool(easyPoolBuilder(ModItems.DIAMOND_APPLE, 0.2f));
                builder.pool(easyPoolBuilder(ModItems.REDSTONE_APPLE, 0.2f,2f));
                builder.pool(easyPoolBuilder(ModItems.GRAVEL_APPLE, 0.4f,2f));
                builder.pool(easyPoolBuilder(ModItems.SAND_APPLE, 0.4f, 2f));
                builder.pool(easyPoolBuilder(ModItems.LEAVES_APPLE, 0.9f, 2f));
                builder.pool(easyPoolBuilder(ModItems.SLIME_APPLE, 1f));
            }
            if (village_weaponsmith_ID.equals(registryKey.getValue()) || village_toolsmith_ID.equals(registryKey.getValue())) {
                builder.pool(easyPoolBuilder(ModItems.STARS_APPLE, 0.01f));
                builder.pool(easyPoolBuilder(ModItems.CAT_APPLE, 0.1f));
                builder.pool(easyPoolBuilder(ModItems.NETHERITE_APPLE, 0.2f));
                builder.pool(easyPoolBuilder(ModItems.DIAMOND_APPLE, 0.3f));
                builder.pool(easyPoolBuilder(ModItems.BONES_APPLE, 0.4f));
                builder.pool(easyPoolBuilder(ModItems.WOOD_APPLE, 0.6f, 2f));
                builder.pool(easyPoolBuilder(ModItems.LEATHER_APPLE, 0.6f));
                builder.pool(easyPoolBuilder(ModItems.IRON_APPLE, 0.7f, 2f));
                builder.pool(easyPoolBuilder(ModItems.COAL_APPLE, 0.8f));
                builder.pool(easyPoolBuilder(ModItems.EMERALD_APPLE, 0.8f));
            }
        });
    }
    // I don't know a lot how to use Collections with it :) (sry :'D)
    private static LootPool.Builder easyPoolBuilder(ItemConvertible item, float chance) {
        return easyPoolBuilder(item, chance, 1F);
    }

    private static LootPool.Builder easyPoolBuilder(ItemConvertible item, float chance, float max) {
        return new LootPool.Builder()
                .rolls(ConstantLootNumberProvider.create(1))
                .conditionally(RandomChanceLootCondition.builder(chance))
                .with(ItemEntry.builder(item))
                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, max)).build());
    }
}
