package tr.com.mohamed.applesmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties WOOD_APPLE = new FoodProperties.Builder()
            .nutrition(1).saturationModifier(0.1F).alwaysEdible()
            .effect(new MobEffectInstance(MobEffects.POISON, 400, 1), 0.4F)
            .effect(new MobEffectInstance(MobEffects.HUNGER, 200), 0.6F)
            .effect(new MobEffectInstance(MobEffects.CONFUSION, 200, 0), 0.8F)
            .build();
    public static final FoodProperties LEAVES_APPLE = new FoodProperties.Builder()
            .nutrition(1).saturationModifier(0.2F).alwaysEdible()
            .effect(new MobEffectInstance(MobEffects.POISON, 400, 1), 0.3F)
            .effect(new MobEffectInstance(MobEffects.CONFUSION, 300, 1), 0.4F)
            .build();
    public static final FoodProperties WOOL_APPLE = new FoodProperties.Builder()
            .nutrition(1).saturationModifier(0F).alwaysEdible()
            .effect(new MobEffectInstance(MobEffects.POISON, 400, 1), 0.2F)
            .build();
    public static final FoodProperties STONE_APPLE = new FoodProperties.Builder()
            .nutrition(1).saturationModifier(0.2F).alwaysEdible()
            .effect(new MobEffectInstance(MobEffects.POISON, 400, 0), 0.2F)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 400, 2), 0.9F)
            .build();
    public static final FoodProperties SPONGE_APPLE = new FoodProperties.Builder()
            .nutrition(4).saturationModifier(0.6F).alwaysEdible()
            .effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 20 * 60, 1), 0.9F)
            .effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 20 * 60, 1), 0.9F)
            .build();
    public static final FoodProperties ENCHANTED_SPONGE_APPLE = new FoodProperties.Builder()
            .nutrition(4).saturationModifier(1.4F).alwaysEdible()
            .effect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 20 * 60, 2), 0.9F)
            .effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 20 * 90, 2), 0.9F)
            .effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 20 * 90, 2), 0.9F)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 20 * 30, 1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20 * 60, 0), 1.0F)
            .effect(new MobEffectInstance(MobEffects.ABSORPTION, 20 * 30, 3), 1.0F)
            .build();
    public static final FoodProperties CAT_APPLE = new FoodProperties.Builder()
            .nutrition(2).saturationModifier(0.6F).alwaysEdible()
            .effect(new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 20 * 10, 0), 0.5F)
            .effect(new MobEffectInstance(MobEffects.WEAKNESS, 20 * 60, 1), 1F)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20 * 60, 1), 1F)
            .effect(new MobEffectInstance(MobEffects.JUMP, 20 * 60, 1), 1F)
            .build();
    public static final FoodProperties DIRT_APPLE = new FoodProperties.Builder()
            .nutrition(1).saturationModifier(0.4F).alwaysEdible()
            .effect(new MobEffectInstance(MobEffects.CONFUSION, 20 * 20, 1), 0.6F)
            .effect(new MobEffectInstance(MobEffects.POISON, 20 * 20, 0), 0.2F)
            .build();
    public static final FoodProperties SAND_APPLE = new FoodProperties.Builder()
            .nutrition(1).saturationModifier(0.2F).alwaysEdible()
            .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20 * 20, 0), 0.6F)
            .effect(new MobEffectInstance(MobEffects.POISON, 20 * 20, 0), 0.4F)
            .build();
    public static final FoodProperties GRAVEL_APPLE = new FoodProperties.Builder()
            .nutrition(1).saturationModifier(0.2F).alwaysEdible()
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20 * 20, 0), 0.7F)
            .effect(new MobEffectInstance(MobEffects.POISON, 20 * 20, 0), 0.2F)
            .build();
    public static final FoodProperties SNOW_APPLE = new FoodProperties.Builder()
            .nutrition(2).saturationModifier(0.4F).alwaysEdible()
            .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20 * 60, 2), 1F)
            .effect(new MobEffectInstance(MobEffects.HARM, 20 * 60, 0), 0.6F)
            .build();
    public static final FoodProperties TNT_APPLE = new FoodProperties.Builder()
            .nutrition(1).saturationModifier(0.4F).alwaysEdible()
            .effect(new MobEffectInstance(MobEffects.INFESTED, 20 * 30, 2), 1F)
            .effect(new MobEffectInstance(MobEffects.WIND_CHARGED, 20 * 30, 2), 1F)
            .build();
    public static final FoodProperties MILK_APPLE = new FoodProperties.Builder()
            .nutrition(4).saturationModifier(1.8F).alwaysEdible()
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 100, 1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.ABSORPTION, 2400, 0), 1.0F)
            .build();
    //    ING
    public static final FoodProperties IRON_APPLE = new FoodProperties.Builder()
            .nutrition(1).saturationModifier(0.2F).alwaysEdible()
            .build();
    public static final FoodProperties COPPER_APPLE = new FoodProperties.Builder()
            .nutrition(1).saturationModifier(0.2F).alwaysEdible()
            .build();
    public static final FoodProperties NETHERIET_APPLE = new FoodProperties.Builder()
            .nutrition(1).saturationModifier(0.2F).alwaysEdible()
            .build();
    public static final FoodProperties DIAMOND_APPLE = new FoodProperties.Builder()
            .nutrition(1).saturationModifier(0.2F).alwaysEdible()
            .build();
    public static final FoodProperties LAPIS_APPLE = new FoodProperties.Builder()
            .nutrition(1).saturationModifier(0.2F).alwaysEdible()
            .build();
    public static final FoodProperties EMERALD_APPLE = new FoodProperties.Builder()
            .nutrition(1).saturationModifier(0.2F).alwaysEdible()
            .build();
    public static final FoodProperties REDSTONE_APPLE = new FoodProperties.Builder()
            .nutrition(1).saturationModifier(0.2F).alwaysEdible()
            .build();
    public static final FoodProperties COAL_APPLE = new FoodProperties.Builder()
            .nutrition(1).saturationModifier(0.2F).alwaysEdible()
            .build();
    public static final FoodProperties BONES_APPLE = new FoodProperties.Builder()
            .nutrition(1).saturationModifier(0.2F).alwaysEdible()
            .build();
    public static final FoodProperties LEATHER_APPLE = new FoodProperties.Builder()
            .nutrition(1).saturationModifier(0.2F).alwaysEdible()
            .build();
    public static final FoodProperties EGG_APPLE = new FoodProperties.Builder()
            .nutrition(1).saturationModifier(0.2F).alwaysEdible()
            .build();
    public static final FoodProperties SLIME_APPLE = new FoodProperties.Builder()
            .nutrition(1).saturationModifier(0.2F).alwaysEdible()
            .build();
    public static final FoodProperties HONEY_APPLE = new FoodProperties.Builder()
            .nutrition(1).saturationModifier(0.2F).alwaysEdible()
            .build();
    public static final FoodProperties LAVA_APPLE = new FoodProperties.Builder()
            .nutrition(1).saturationModifier(0.2F).alwaysEdible()
            .build();
    public static final FoodProperties WATER_APPLE = new FoodProperties.Builder()
            .nutrition(1).saturationModifier(0.2F).alwaysEdible()
            .build();
    public static final FoodProperties STARTS_APPLE = new FoodProperties.Builder()
            .nutrition(1).saturationModifier(0.2F).alwaysEdible()
            .build();
    public static final FoodProperties ENDER_APPLE = new FoodProperties.Builder()
            .nutrition(1).saturationModifier(0.2F).alwaysEdible()
            .build();
}
