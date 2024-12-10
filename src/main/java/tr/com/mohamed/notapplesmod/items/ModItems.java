package tr.com.mohamed.notapplesmod.items;

import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import tr.com.mohamed.notapplesmod.NotApples;

import java.util.List;

public class ModItems {
    public static final Item WOOD_APPLE = registerApple("woodapple", ModFoods.WOOD_APPLE, ModFoods.WOOD_APPLE_EFFECT);
    public static final Item CAT_APPLE = registerApple("catapple", ModFoods.CAT_APPLE, ModFoods.CAT_APPLE_EFFECT);
    public static final Item BONES_APPLE = registerApple("bonesapple", ModFoods.BONES_APPLE, ModFoods.BONES_APPLE_EFFECT);
    public static final Item COAL_APPLE = registerApple("coalapple", ModFoods.COAL_APPLE, ModFoods.COAL_APPLE_EFFECT);
    public static final Item COPPER_APPLE = registerApple("copperapple", ModFoods.COPPER_APPLE, ModFoods.COPPER_APPLE_EFFECT);
    public static final Item DIAMOND_APPLE = registerApple("diamondapple", ModFoods.DIAMOND_APPLE, ModFoods.DIAMOND_APPLE_EFFECT);
    public static final Item IRON_APPLE = registerApple("ironapple", ModFoods.IRON_APPLE, ModFoods.IRON_APPLE_EFFECT);
    public static final Item EMERALD_APPLE = registerApple("emeraldapple", ModFoods.EMERALD_APPLE, ModFoods.EMERALD_APPLE_EFFECT);
    public static final Item LAPIS_APPLE = registerApple("lapisapple", ModFoods.LAPIS_APPLE, ModFoods.LAPIS_APPLE_EFFECT);
    public static final Item LEATHER_APPLE = registerApple("leatherapple", ModFoods.LEATHER_APPLE, ModFoods.LEATHER_APPLE_EFFECT);
    public static final Item NETHERITE_APPLE = registerApple("netheriteapple", ModFoods.NETHERITE_APPLE, ModFoods.NETHERITE_APPLE_EFFECT);
    public static final Item REDSTONE_APPLE = registerApple("redstoneapple", ModFoods.REDSTONE_APPLE, ModFoods.REDSTONE_APPLE_EFFECT);
    public static final Item DIRT_APPLE = registerApple("dirtapple", ModFoods.DIRT_APPLE, ModFoods.DIRT_APPLE_EFFECT);
    public static final Item GRAVEL_APPLE = registerApple("gravelapple", ModFoods.GRAVEL_APPLE, ModFoods.GRAVEL_APPLE_EFFECT);
    public static final Item LEAVES_APPLE = registerApple("leavesapple", ModFoods.LEAVES_APPLE, ModFoods.LEAVES_APPLE_EFFECT);
    public static final Item WOOL_APPLE = registerApple("woolapple", ModFoods.WOOL_APPLE, ModFoods.WOOL_APPLE_EFFECT);
    public static final Item WATER_APPLE = registerApple("waterapple", ModFoods.WATER_APPLE, ModFoods.WATER_APPLE_EFFECT);
    public static final Item TNT_APPLE = registerApple("tntapple", ModFoods.TNT_APPLE, ModFoods.TNT_APPLE_EFFECT);
    public static final Item STONE_APPLE = registerApple("stoneapple", ModFoods.STONE_APPLE, ModFoods.STONE_APPLE_EFFECT);
    public static final Item STARS_APPLE = registerApple("starsapple", ModFoods.STARS_APPLE, ModFoods.STARS_APPLE_EFFECT);
    public static final Item SPONGE_APPLE = registerApple("spongeapple", ModFoods.SPONGE_APPLE, ModFoods.SPONGE_APPLE_EFFECT);
    public static final Item SNOW_APPLE = registerApple("snowapple", ModFoods.SNOW_APPLE, ModFoods.SNOW_APPLE_EFFECT);
    public static final Item SLIME_APPLE = registerApple("slimeapple", ModFoods.SLIME_APPLE, ModFoods.SLIME_APPLE_EFFECT);
    public static final Item SAND_APPLE = registerApple("sandapple", ModFoods.SAND_APPLE, ModFoods.SAND_APPLE_EFFECT);
    public static final Item MILK_APPLE = registerApple("milkapple", ModFoods.MILK_APPLE, ModFoods.MILK_APPLE_EFFECT);
    public static final Item LAVA_APPLE = registerApple("lavaapple", ModFoods.LAVA_APPLE, ModFoods.LAVA_APPLE_EFFECT);
    public static final Item HONEY_APPLE = registerApple("honeyapple", ModFoods.HONEY_APPLE, ModFoods.HONEY_APPLE_EFFECT);
    public static final Item ENDER_APPLE = registerApple("enderapple", ModFoods.ENDER_APPLE, ModFoods.ENDER_APPLE_EFFECT);
    public static final Item ENCHANTED_SPONGE_APPLE = registerApple("enchantedspongeapple", ModFoods.ENCHANTED_SPONGE_APPLE, ModFoods.ENCHANTED_SPONGE_APPLE_EFFECT);

    private static Item registerApple(String name, FoodComponent foodComponent, ConsumableComponent foodEffect) {
        return registerItem(name,
                new Item(new Item.Settings().registryKey(
                        RegistryKey.of(RegistryKeys.ITEM, Identifier.of(NotApples.MOD_ID, name))
                ).food(foodComponent, foodEffect)) {
                    @Override
                    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
                        tooltip.add(Text.translatable("item." + NotApples.MOD_ID + "." + name + ".tooltip"));
                        super.appendTooltip(stack, context, tooltip, type);
                    }
                }
        );
    }

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(NotApples.MOD_ID, name), item);
    }

    public static void registerModItems() {
        NotApples.LOGGER.info("Registering Mod items for: " + NotApples.MOD_ID);
    }
}
