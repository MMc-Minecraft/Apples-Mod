package tr.com.mohamed.notapplesmod;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import tr.com.mohamed.notapplesmod.items.ModItems;

public class ModTabs {
    public static final ItemGroup NotApplesTab = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(NotApples.MOD_ID, "notapples_tab"),
            FabricItemGroup.builder()
                    .icon(()->new ItemStack(ModItems.CAT_APPLE))
                    .displayName(Text.translatable("tab.notapplesmod.notapples_tab"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.WOOD_APPLE);
                        entries.add(ModItems.CAT_APPLE);
                        entries.add(ModItems.BONES_APPLE);
//                        entries.add(ModItems.COAL_APPLE);
//                        entries.add(ModItems.COPPER_APPLE);
//                        entries.add(ModItems.DIAMOND_APPLE);
//                        entries.add(ModItems.IRON_APPLE);
//                        entries.add(ModItems.EMERALD_APPLE);
//                        entries.add(ModItems.LAPIS_APPLE);
//                        entries.add(ModItems.LEATHER_APPLE);
//                        entries.add(ModItems.NETHERITE_APPLE);
//                        entries.add(ModItems.REDSTONE_APPLE);
//                        entries.add(ModItems.DIRT_APPLE);
//                        entries.add(ModItems.GRAVEL_APPLE);
//                        entries.add(ModItems.LEAVES_APPLE);
//                        entries.add(ModItems.WOOL_APPLE);
//                        entries.add(ModItems.WATER_APPLE);
//                        entries.add(ModItems.TNT_APPLE);
//                        entries.add(ModItems.STONE_APPLE);
//                        entries.add(ModItems.STARS_APPLE);
//                        entries.add(ModItems.SPONGE_APPLE);
//                        entries.add(ModItems.SNOW_APPLE);
//                        entries.add(ModItems.SLIME_APPLE);
//                        entries.add(ModItems.SAND_APPLE);
//                        entries.add(ModItems.MILK_APPLE);
//                        entries.add(ModItems.LAVA_APPLE);
//                        entries.add(ModItems.HONEY_APPLE);
//                        entries.add(ModItems.ENDER_APPLE);
//                        entries.add(ModItems.ENCHANTED_SPONGE_APPLE);
                    }).build()
    );

    public static void registerModTabs() {
        NotApples.LOGGER.info("Registering Mod Tabs for: " + NotApples.MOD_ID);
    }
}
