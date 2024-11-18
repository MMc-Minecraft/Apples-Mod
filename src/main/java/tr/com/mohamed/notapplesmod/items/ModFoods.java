package tr.com.mohamed.notapplesmod.items;


import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;
import net.minecraft.item.consume.ClearAllEffectsConsumeEffect;
import net.minecraft.item.consume.TeleportRandomlyConsumeEffect;
import net.minecraft.registry.entry.RegistryEntry;

public class ModFoods {
    //    Components
    public static final FoodComponent WOOD_APPLE = new FoodComponent.Builder().nutrition(1).saturationModifier(1.1F).alwaysEdible().build();
    public static final FoodComponent CAT_APPLE = new FoodComponent.Builder().nutrition(6).saturationModifier(2.2F).alwaysEdible().build();
    public static final FoodComponent BONES_APPLE = new FoodComponent.Builder().nutrition(3).saturationModifier(1.4F).alwaysEdible().build();
    public static final FoodComponent COAL_APPLE = new FoodComponent.Builder().nutrition(1).saturationModifier(1.1F).alwaysEdible().build();
    public static final FoodComponent COPPER_APPLE = new FoodComponent.Builder().nutrition(1).saturationModifier(1.2F).alwaysEdible().build();
    public static final FoodComponent DIAMOND_APPLE = new FoodComponent.Builder().nutrition(4).saturationModifier(1.6F).alwaysEdible().build();
    public static final FoodComponent IRON_APPLE = new FoodComponent.Builder().nutrition(1).saturationModifier(1.2F).alwaysEdible().build();
    public static final FoodComponent EMERALD_APPLE = new FoodComponent.Builder().nutrition(3).saturationModifier(1.5F).alwaysEdible().build();
    public static final FoodComponent LAPIS_APPLE = new FoodComponent.Builder().nutrition(1).saturationModifier(1.1F).alwaysEdible().build();
    public static final FoodComponent LEATHER_APPLE = new FoodComponent.Builder().nutrition(1).saturationModifier(0.6F).alwaysEdible().build();
    public static final FoodComponent NETHERITE_APPLE = new FoodComponent.Builder().nutrition(4).saturationModifier(1.8F).alwaysEdible().build();
    public static final FoodComponent REDSTONE_APPLE = new FoodComponent.Builder().nutrition(1).saturationModifier(1.1F).alwaysEdible().build();
    public static final FoodComponent DIRT_APPLE = new FoodComponent.Builder().nutrition(1).saturationModifier(0.4F).alwaysEdible().build();
    public static final FoodComponent GRAVEL_APPLE = new FoodComponent.Builder().nutrition(1).saturationModifier(0.2F).alwaysEdible().build();
    public static final FoodComponent LEAVES_APPLE = new FoodComponent.Builder().nutrition(1).saturationModifier(1.1F).alwaysEdible().build();
    public static final FoodComponent WOOL_APPLE = new FoodComponent.Builder().nutrition(1).saturationModifier(1.1F).alwaysEdible().build();
    public static final FoodComponent WATER_APPLE = new FoodComponent.Builder().nutrition(1).saturationModifier(1.1F).alwaysEdible().build();
    public static final FoodComponent TNT_APPLE = new FoodComponent.Builder().nutrition(1).saturationModifier(0.4F).alwaysEdible().build();
    public static final FoodComponent STONE_APPLE = new FoodComponent.Builder().nutrition(1).saturationModifier(0.2F).alwaysEdible().build();
    public static final FoodComponent STARS_APPLE = new FoodComponent.Builder().nutrition(1).saturationModifier(1.1F).alwaysEdible().build();
    public static final FoodComponent SPONGE_APPLE = new FoodComponent.Builder().nutrition(4).saturationModifier(0.6F).alwaysEdible().build();
    public static final FoodComponent SNOW_APPLE = new FoodComponent.Builder().nutrition(1).saturationModifier(0.4F).alwaysEdible().build();
    public static final FoodComponent SLIME_APPLE = new FoodComponent.Builder().nutrition(1).saturationModifier(1.1F).alwaysEdible().build();
    public static final FoodComponent SAND_APPLE = new FoodComponent.Builder().nutrition(1).saturationModifier(0.2F).alwaysEdible().build();
    public static final FoodComponent MILK_APPLE = new FoodComponent.Builder().nutrition(4).saturationModifier(1.8F).alwaysEdible().build();
    public static final FoodComponent LAVA_APPLE = new FoodComponent.Builder().nutrition(1).saturationModifier(1.1F).alwaysEdible().build();
    public static final FoodComponent HONEY_APPLE = new FoodComponent.Builder().nutrition(1).saturationModifier(1.1F).alwaysEdible().build();
    public static final FoodComponent ENDER_APPLE = new FoodComponent.Builder().nutrition(1).saturationModifier(1.1F).alwaysEdible().build();
    public static final FoodComponent ENCHANTED_SPONGE_APPLE = new FoodComponent.Builder().nutrition(4).saturationModifier(1.4F).alwaysEdible().build();


    // EFFECTS
    public static final ConsumableComponent WOOD_APPLE_EFFECT = createConsumableEffect(
            new EffectData(StatusEffects.ABSORPTION, 20 * 10, 1, 0.8F),
            new EffectData(StatusEffects.HUNGER, 20 * 10, 0, 0.2F),
            new EffectData(StatusEffects.POISON, 20 * 15, 0, 0.5F)
    );
    public static final ConsumableComponent CAT_APPLE_EFFECT = createConsumableEffect(
            new EffectData(StatusEffects.ABSORPTION, 20 * 60, 1, 1F),
            new EffectData(StatusEffects.WEAKNESS, 20 * 120, 2, 1F),
            new EffectData(StatusEffects.SPEED, 20 * 120, 1, 1F),
            new EffectData(StatusEffects.JUMP_BOOST, 20 * 120, 2, 1F),
            new EffectData(StatusEffects.WIND_CHARGED, 20 * 120, 2, 1F),
            new EffectData(StatusEffects.HERO_OF_THE_VILLAGE, 20 * 100, 2, 1F),
            new EffectData(StatusEffects.LEVITATION, 20 * 100, 1, 1F)
    );
    public static final ConsumableComponent BONES_APPLE_EFFECT = createConsumableEffect(
            new EffectData(StatusEffects.ABSORPTION, 20 * 60, 3, 1F),
            new EffectData(StatusEffects.SPEED, 20 * 60, 0, 0.8F),
            new EffectData(StatusEffects.JUMP_BOOST, 20 * 60, 0, 0.8F)
    );
    public static final ConsumableComponent COAL_APPLE_EFFECT = createConsumableEffect(
            new EffectData(StatusEffects.SPEED, 20 * 60, 3, 1F),
            new EffectData(StatusEffects.POISON, 20 * 30, 0, 0.6F)
    );
    public static final ConsumableComponent COPPER_APPLE_EFFECT = createConsumableEffect(
            new EffectData(StatusEffects.WEAKNESS, 20 * 60, 1, 1F),
            new EffectData(StatusEffects.HASTE, 20 * 60, 3, 1F)
    );
    public static final ConsumableComponent DIAMOND_APPLE_EFFECT = createConsumableEffect(
            new EffectData(StatusEffects.SPEED, 20 * 60, 1, 0.8F),
            new EffectData(StatusEffects.HEALTH_BOOST, 20 * 60, 2, 0.8F),
            new EffectData(StatusEffects.REGENERATION, 20 * 30, 1, 0.8F),
            new EffectData(StatusEffects.ABSORPTION, 20 * 60, 1, 0.8F)
    );
    public static final ConsumableComponent IRON_APPLE_EFFECT = createConsumableEffect(
            new EffectData(StatusEffects.ABSORPTION, 20 * 40, 0, 1F),
            new EffectData(StatusEffects.INFESTED, 20 * 60, 1, 1F)
    );
    public static final ConsumableComponent EMERALD_APPLE_EFFECT = createConsumableEffect(
            new EffectData(StatusEffects.ABSORPTION, 20 * 60, 2, 1F),
            new EffectData(StatusEffects.HEALTH_BOOST, 20 * 60, 2, 1F),
            new EffectData(StatusEffects.LUCK, 20 * 20, 0, 0.1F),
            new EffectData(StatusEffects.REGENERATION, 20 * 15, 2, 1F)
    );
    public static final ConsumableComponent LAPIS_APPLE_EFFECT = createConsumableEffect(
            new EffectData(StatusEffects.ABSORPTION, 20 * 60, 1, 1F),
            new EffectData(StatusEffects.HASTE, 20 * 60, 2, 1F)
    );
    public static final ConsumableComponent LEATHER_APPLE_EFFECT = createConsumableEffect(
            new EffectData(StatusEffects.SATURATION, 20 * 20, 0, 1F)
    );
    public static final ConsumableComponent NETHERITE_APPLE_EFFECT = createConsumableEffect(
            new EffectData(StatusEffects.ABSORPTION, 20 * 60, 4, 1F),
            new EffectData(StatusEffects.HEALTH_BOOST, 20 * 60, 3, 1F),
            new EffectData(StatusEffects.HASTE, 20 * 60, 1, 1F),
            new EffectData(StatusEffects.STRENGTH, 20 * 30, 1, 1F),
            new EffectData(StatusEffects.REGENERATION, 20 * 30, 2, 1F)
    );
    public static final ConsumableComponent REDSTONE_APPLE_EFFECT = createConsumableEffect(
            new EffectData(StatusEffects.SPEED, 20 * 60, 3, 1F),
            new EffectData(StatusEffects.POISON, 20 * 60, 0, 0.6F)
    );
    public static final ConsumableComponent DIRT_APPLE_EFFECT = createConsumableEffect(
            new EffectData(StatusEffects.HASTE, 20 * 60, 3, 1F),
            new EffectData(StatusEffects.POISON, 20 * 30, 0, 0.6F),
            new EffectData(StatusEffects.NAUSEA, 20 * 30, 2, 0.6F)
    );



    public static final ConsumableComponent MILK_APPLE_EFFECT = ConsumableComponents.food()
            .consumeEffect(ClearAllEffectsConsumeEffect.INSTANCE)
            .build();
    public static final ConsumableComponent ENDER_APPLE_EFFECT = ConsumableComponents.food()
            .consumeEffect(new TeleportRandomlyConsumeEffect())
            .build();


    // Helper methods
    private static ConsumableComponent createConsumableEffect(EffectData... effects) {
        ConsumableComponent.Builder builder = ConsumableComponents.food();
        for (EffectData effect : effects) {
            builder.consumeEffect(new ApplyEffectsConsumeEffect(
                    new StatusEffectInstance(effect.effect, effect.duration, effect.amplifier),
                    effect.chance
            ));
        }
        return builder.build();
    }

    private record EffectData(RegistryEntry<StatusEffect> effect, int duration, int amplifier, float chance) {
    }

}
