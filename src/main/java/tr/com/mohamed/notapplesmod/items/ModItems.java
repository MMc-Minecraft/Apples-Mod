package tr.com.mohamed.notapplesmod.items;

import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import tr.com.mohamed.notapplesmod.NotApples;

public class ModItems {
    public static final Item WOOD_APPLE = registerApple("woodapple", ModFoods.WOOD_APPLE, ModFoods.WOOD_APPLE_EFFECT);
    public static final Item CAT_APPLE = registerApple("catapple", ModFoods.CAT_APPLE, ModFoods.CAT_APPLE_EFFECT);
    public static final Item BONES_APPLE = registerApple("bonesapple", ModFoods.BONES_APPLE, ModFoods.BONES_APPLE_EFFECT);
//    public static final Item COAL_APPLE = registerApple("bonesapple", ModFoods.BONES_APPLE, ModFoods.BONES_APPLE_EFFECT);
//    public static final Item COPPER_APPLE = registerApple("bonesapple", ModFoods.BONES_APPLE, ModFoods.BONES_APPLE_EFFECT);
//    public static final Item DIAMOND_APPLE = registerApple("bonesapple", ModFoods.BONES_APPLE, ModFoods.BONES_APPLE_EFFECT);
//    public static final Item IRON_APPLE = registerApple("bonesapple", ModFoods.BONES_APPLE, ModFoods.BONES_APPLE_EFFECT);
//    public static final Item EMERALD_APPLE = registerApple("bonesapple", ModFoods.BONES_APPLE, ModFoods.BONES_APPLE_EFFECT);
//    public static final Item LAPIS_APPLE = registerApple("bonesapple", ModFoods.BONES_APPLE, ModFoods.BONES_APPLE_EFFECT);
//    public static final Item LEATHER_APPLE = registerApple("bonesapple", ModFoods.BONES_APPLE, ModFoods.BONES_APPLE_EFFECT);
//    public static final Item NETHERITE_APPLE = registerApple("bonesapple", ModFoods.BONES_APPLE, ModFoods.BONES_APPLE_EFFECT);
//    public static final Item REDSTONE_APPLE = registerApple("bonesapple", ModFoods.BONES_APPLE, ModFoods.BONES_APPLE_EFFECT);
//    public static final Item DIRT_APPLE = registerApple("bonesapple", ModFoods.BONES_APPLE, ModFoods.BONES_APPLE_EFFECT);
//    public static final Item GRAVEL_APPLE = registerApple("bonesapple", ModFoods.BONES_APPLE, ModFoods.BONES_APPLE_EFFECT);
//    public static final Item LEAVES_APPLE = registerApple("bonesapple", ModFoods.BONES_APPLE, ModFoods.BONES_APPLE_EFFECT);
//    public static final Item WOOL_APPLE = registerApple("bonesapple", ModFoods.BONES_APPLE, ModFoods.BONES_APPLE_EFFECT);
//    public static final Item WATER_APPLE = registerApple("bonesapple", ModFoods.BONES_APPLE, ModFoods.BONES_APPLE_EFFECT);
//    public static final Item TNT_APPLE = registerApple("bonesapple", ModFoods.BONES_APPLE, ModFoods.BONES_APPLE_EFFECT);
//    public static final Item STONE_APPLE = registerApple("bonesapple", ModFoods.BONES_APPLE, ModFoods.BONES_APPLE_EFFECT);
//    public static final Item STARS_APPLE = registerApple("bonesapple", ModFoods.BONES_APPLE, ModFoods.BONES_APPLE_EFFECT);
//    public static final Item SPONGE_APPLE = registerApple("bonesapple", ModFoods.BONES_APPLE, ModFoods.BONES_APPLE_EFFECT);
//    public static final Item SNOW_APPLE = registerApple("bonesapple", ModFoods.BONES_APPLE, ModFoods.BONES_APPLE_EFFECT);
//    public static final Item SLIME_APPLE = registerApple("bonesapple", ModFoods.BONES_APPLE, ModFoods.BONES_APPLE_EFFECT);
//    public static final Item SAND_APPLE = registerApple("bonesapple", ModFoods.BONES_APPLE, ModFoods.BONES_APPLE_EFFECT);
//    public static final Item MILK_APPLE = registerApple("bonesapple", ModFoods.BONES_APPLE, ModFoods.BONES_APPLE_EFFECT);
//    public static final Item LAVA_APPLE = registerApple("bonesapple", ModFoods.BONES_APPLE, ModFoods.BONES_APPLE_EFFECT);
//    public static final Item HONEY_APPLE = registerApple("bonesapple", ModFoods.BONES_APPLE, ModFoods.BONES_APPLE_EFFECT);
//    public static final Item ENDER_APPLE = registerApple("bonesapple", ModFoods.BONES_APPLE, ModFoods.BONES_APPLE_EFFECT);
//    public static final Item ENCHANTED_SPONGE_APPLE = registerApple("enchantedspongeapple", ModFoods.BONES_APPLE, ModFoods.BONES_APPLE_EFFECT);

    private static Item registerApple(String name, FoodComponent foodComponent, ConsumableComponent foodEffect) {
        return registerItem(name,
                new Item(new Item.Settings().registryKey(
                        RegistryKey.of(RegistryKeys.ITEM, Identifier.of(NotApples.MOD_ID, name))
                ).food(foodComponent, foodEffect))
        );
    }

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(NotApples.MOD_ID, name), item);
    }

    public static void registerModItems() {
        NotApples.LOGGER.info("Registering Mod items for: " + NotApples.MOD_ID);
    }
}
