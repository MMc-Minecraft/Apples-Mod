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
            .effect(new MobEffectInstance(MobEffects.CONFUSION, 200, 1), 0.4F)
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
            .nutrition(1).saturationModifier(0.2F).alwaysEdible()
            .build();
    public static final FoodProperties CAT_APPLE = new FoodProperties.Builder()
            .nutrition(1).saturationModifier(0.2F).alwaysEdible()
            .build();
    public static final FoodProperties SWORDS_APPLE = new FoodProperties.Builder()
            .nutrition(1).saturationModifier(0.2F).alwaysEdible()
            .build();
    public static final FoodProperties DIRT_APPLE = new FoodProperties.Builder()
            .nutrition(1).saturationModifier(0.2F).alwaysEdible()
            .build();
    public static final FoodProperties SAND_APPLE = new FoodProperties.Builder()
            .nutrition(1).saturationModifier(0.2F).alwaysEdible()
            .build();
    public static final FoodProperties GRAVEL_APPLE = new FoodProperties.Builder()
            .nutrition(1).saturationModifier(0.2F).alwaysEdible()
            .build();
    public static final FoodProperties SNOW_APPLE = new FoodProperties.Builder()
            .nutrition(1).saturationModifier(0.2F).alwaysEdible()
            .build();
    public static final FoodProperties TNT_APPLE = new FoodProperties.Builder()
            .nutrition(1).saturationModifier(0.2F).alwaysEdible()
            .build();
    public static final FoodProperties MILK_APPLE = new FoodProperties.Builder()
            .nutrition(1).saturationModifier(0.2F).alwaysEdible()
            .build();
    //    ING
    public static final FoodProperties QUARTZ_APPLE = new FoodProperties.Builder()
            .nutrition(1).saturationModifier(0.2F).alwaysEdible()
            .build();
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
