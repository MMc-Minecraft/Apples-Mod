package tr.com.mohamed.notapplesmod.items;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import tr.com.mohamed.notapplesmod.NotApples;

public class ModItems {
    public static final Item WOOD_APPLE = registerItem("woodapple", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(NotApples.MOD_ID, "woodapple"))).food(ModFoods.WOOD_APPLE, ModFoods.WOOD_APPLE_EFFECT)));
    public static final Item CAT_APPLE = registerItem("catapple", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(NotApples.MOD_ID, "catapple"))).food(ModFoods.CAT_APPLE, ModFoods.CAT_APPLE_EFFECT)));
    public static final Item BONES_APPLE = registerItem("bonesapple", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(NotApples.MOD_ID, "bonesapple"))).food(ModFoods.BONES_APPLE, ModFoods.BONES_APPLE_EFFECT)));
//    public static final Item COAL_APPLE = registerItem("coalapple", new Item(new Item.Settings()));
//    public static final Item COPPER_APPLE = registerItem("copperapple", new Item(new Item.Settings()));
//    public static final Item DIAMOND_APPLE = registerItem("diamondapple", new Item(new Item.Settings()));
//    public static final Item IRON_APPLE = registerItem("ironapple", new Item(new Item.Settings()));
//    public static final Item EMERALD_APPLE = registerItem("emeraldapple", new Item(new Item.Settings()));
//    public static final Item LAPIS_APPLE = registerItem("lapisapple", new Item(new Item.Settings()));
//    public static final Item LEATHER_APPLE = registerItem("leatherapple", new Item(new Item.Settings()));
//    public static final Item NETHERITE_APPLE = registerItem("netheriteapple", new Item(new Item.Settings()));
//    public static final Item REDSTONE_APPLE = registerItem("redstoneapple", new Item(new Item.Settings()));
//    public static final Item DIRT_APPLE = registerItem("dirtapple", new Item(new Item.Settings()));
//    public static final Item GRAVEL_APPLE = registerItem("gravelapple", new Item(new Item.Settings()));
//    public static final Item LEAVES_APPLE = registerItem("leavesapple", new Item(new Item.Settings()));
//    public static final Item WOOL_APPLE = registerItem("woolapple", new Item(new Item.Settings()));
//    public static final Item WATER_APPLE = registerItem("waterapple", new Item(new Item.Settings()));
//    public static final Item TNT_APPLE = registerItem("tntapple", new Item(new Item.Settings()));
//    public static final Item STONE_APPLE = registerItem("stoneapple", new Item(new Item.Settings()));
//    public static final Item STARS_APPLE = registerItem("starsapple", new Item(new Item.Settings()));
//    public static final Item SPONGE_APPLE = registerItem("spongeapple", new Item(new Item.Settings()));
//    public static final Item SNOW_APPLE = registerItem("snowapple", new Item(new Item.Settings()));
//    public static final Item SLIME_APPLE = registerItem("slimeapple", new Item(new Item.Settings()));
//    public static final Item SAND_APPLE = registerItem("sandapple", new Item(new Item.Settings()));
//    public static final Item MILK_APPLE = registerItem("milkapple", new Item(new Item.Settings()));
//    public static final Item LAVA_APPLE = registerItem("lavaapple", new Item(new Item.Settings()));
//    public static final Item HONEY_APPLE = registerItem("honeyapple", new Item(new Item.Settings()));
//    public static final Item ENDER_APPLE = registerItem("enderapple", new Item(new Item.Settings()));
//    public static final Item ENCHANTED_SPONGE_APPLE = registerItem("enchantedspongeapple", new Item(new Item.Settings()));


    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(NotApples.MOD_ID, name), item);
    }

    public static void registerModItems() {
        NotApples.LOGGER.info("Registering Mod items for: " + NotApples.MOD_ID);
    }
}
