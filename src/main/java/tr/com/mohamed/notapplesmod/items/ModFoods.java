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

    public static final FoodComponent WOOD_APPLE = createAppleFoodComponent(1, 1.1F).build();
    public static final FoodComponent CAT_APPLE = createAppleFoodComponent(6, 2.2F).build();
    public static final FoodComponent BONES_APPLE = createAppleFoodComponent(3, 1.4F).build();
    public static final FoodComponent COAL_APPLE = createAppleFoodComponent(1, 1.1F).build();
    public static final FoodComponent COPPER_APPLE = createAppleFoodComponent(1, 1.2F).build();
    public static final FoodComponent DIAMOND_APPLE = createAppleFoodComponent(4, 1.6F).build();
    public static final FoodComponent IRON_APPLE = createAppleFoodComponent(1, 1.2F).build();
    public static final FoodComponent EMERALD_APPLE = createAppleFoodComponent(3, 1.5F).build();
    public static final FoodComponent LAPIS_APPLE = createAppleFoodComponent(1, 1.1F).build();
    public static final FoodComponent LEATHER_APPLE = createAppleFoodComponent(1, 0.6F).build();
    public static final FoodComponent NETHERITE_APPLE = createAppleFoodComponent(4, 1.8F).build();
    public static final FoodComponent REDSTONE_APPLE = createAppleFoodComponent(1, 1.1F).build();
    public static final FoodComponent DIRT_APPLE = createAppleFoodComponent(1, 0.6F).build();
    public static final FoodComponent GRAVEL_APPLE = createAppleFoodComponent(1, 0.4F).build();
    public static final FoodComponent LEAVES_APPLE = createAppleFoodComponent(1, 1.1F).build();
    public static final FoodComponent WOOL_APPLE = createAppleFoodComponent(1, 0.4F).build();
    public static final FoodComponent WATER_APPLE = createAppleFoodComponent(1, 1.2F).build();
    public static final FoodComponent TNT_APPLE = createAppleFoodComponent(1, 0.4F).build();
    public static final FoodComponent STONE_APPLE = createAppleFoodComponent(1, 0.2F).build();
    public static final FoodComponent STARS_APPLE = createAppleFoodComponent(1, 2.8F).build();
    public static final FoodComponent SPONGE_APPLE = createAppleFoodComponent(4, 0.6F).build();
    public static final FoodComponent SNOW_APPLE = createAppleFoodComponent(1, 0.4F).build();
    public static final FoodComponent SLIME_APPLE = createAppleFoodComponent(1, 1.4F).build();
    public static final FoodComponent SAND_APPLE = createAppleFoodComponent(1, 0.4F).build();
    public static final FoodComponent MILK_APPLE = createAppleFoodComponent(4, 1.8F).build();
    public static final FoodComponent LAVA_APPLE = createAppleFoodComponent(1, 1.2F).build();
    public static final FoodComponent HONEY_APPLE = createAppleFoodComponent(1, 1.1F).build();
    public static final FoodComponent ENDER_APPLE = createAppleFoodComponent(1, 1.8F).build();
    public static final FoodComponent ENCHANTED_SPONGE_APPLE = createAppleFoodComponent(4, 2.0F).build();

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
            new EffectData(StatusEffects.HERO_OF_THE_VILLAGE, 20 * 100, 2, 1F)
    );
    public static final ConsumableComponent BONES_APPLE_EFFECT = createConsumableEffect(
            new EffectData(StatusEffects.ABSORPTION, 20 * 60, 3, 1F),
            new EffectData(StatusEffects.SPEED, 20 * 60, 0, 0.8F),
            new EffectData(StatusEffects.JUMP_BOOST, 20 * 60, 0, 0.8F)
    );
    public static final ConsumableComponent COAL_APPLE_EFFECT = createConsumableEffect(
            new EffectData(StatusEffects.HASTE, 20 * 60, 3, 1F),
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
            new EffectData(StatusEffects.REGENERATION, 20 * 8, 1, 0.8F),
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
            new EffectData(StatusEffects.REGENERATION, 20 * 10, 2, 1F)
    );
    public static final ConsumableComponent LAPIS_APPLE_EFFECT = createConsumableEffect(
            new EffectData(StatusEffects.ABSORPTION, 20 * 60, 1, 1F),
            new EffectData(StatusEffects.HASTE, 20 * 60, 2, 1F)
    );
    public static final ConsumableComponent LEATHER_APPLE_EFFECT = createConsumableEffect(
            new EffectData(StatusEffects.SATURATION, 20 * 20, 0, 1F)
    );
    public static final ConsumableComponent NETHERITE_APPLE_EFFECT = createConsumableEffect(
            new EffectData(StatusEffects.ABSORPTION, 20 * 30, 4, 1F),
            new EffectData(StatusEffects.HEALTH_BOOST, 20 * 40, 3, 1F),
            new EffectData(StatusEffects.HASTE, 20 * 60, 1, 1F),
            new EffectData(StatusEffects.STRENGTH, 20 * 30, 1, 1F),
            new EffectData(StatusEffects.FIRE_RESISTANCE, 20 * 30, 1, 1F),
            new EffectData(StatusEffects.REGENERATION, 20 * 15, 2, 1F)
    );
    public static final ConsumableComponent REDSTONE_APPLE_EFFECT = createConsumableEffect(
            new EffectData(StatusEffects.SPEED, 20 * 60, 3, 1F),
            new EffectData(StatusEffects.POISON, 20 * 60, 0, 0.6F)
    );
    public static final ConsumableComponent DIRT_APPLE_EFFECT = createConsumableEffect(
            new EffectData(StatusEffects.REGENERATION, 20 * 3, 0, 0.9F),
            new EffectData(StatusEffects.POISON, 20 * 30, 0, 0.4F),
            new EffectData(StatusEffects.NAUSEA, 20 * 30, 2, 0.6F)
    );
    public static final ConsumableComponent GRAVEL_APPLE_EFFECT = createConsumableEffect(
            new EffectData(StatusEffects.INFESTED, 20 * 20, 2, 1F),
            new EffectData(StatusEffects.INSTANT_HEALTH, 20 * 10, 2, 1F)
    );
    public static final ConsumableComponent LEAVES_APPLE_EFFECT = createConsumableEffect(
            new EffectData(StatusEffects.REGENERATION, 20 * 3, 0, 0.9F),
            new EffectData(StatusEffects.NAUSEA, 20 * 30, 2, 0.5F)
    );
    public static final ConsumableComponent WOOL_APPLE_EFFECT = createConsumableEffect(
            new EffectData(StatusEffects.REGENERATION, 20 * 3, 0, 0.9F),
            new EffectData(StatusEffects.NAUSEA, 20 * 30, 2, 0.2F)
    );
    public static final ConsumableComponent WATER_APPLE_EFFECT = createConsumableEffect(
            new EffectData(StatusEffects.REGENERATION, 20 * 8, 0, 0.9F),
            new EffectData(StatusEffects.WATER_BREATHING, 20 * 40, 1, 1F),
            new EffectData(StatusEffects.FIRE_RESISTANCE, 20 * 40, 4, 1F)
    );
    public static final ConsumableComponent TNT_APPLE_EFFECT = createConsumableEffect(
            new EffectData(StatusEffects.INFESTED, 20 * 60, 1, 1F),
            new EffectData(StatusEffects.WEAVING, 20 * 60, 2, 1F),
            new EffectData(StatusEffects.OOZING, 20 * 60, 2, 1F),
            new EffectData(StatusEffects.WIND_CHARGED, 20 * 60, 10, 1F)
    );
    public static final ConsumableComponent STONE_APPLE_EFFECT = createConsumableEffect(
            new EffectData(StatusEffects.REGENERATION, 20 * 3, 0, 0.9F),
            new EffectData(StatusEffects.SLOWNESS, 20 * 60, 4, 1F),
            new EffectData(StatusEffects.MINING_FATIGUE, 20 * 60, 3, 1F)
    );
    public static final ConsumableComponent STARS_APPLE_EFFECT = createConsumableEffect(
            new EffectData(StatusEffects.ABSORPTION, 20 * 100, 4, 1F),
            new EffectData(StatusEffects.FIRE_RESISTANCE, 20 * 100, 4, 1F),
            new EffectData(StatusEffects.HEALTH_BOOST, 20 * 100, 3, 1F),
            new EffectData(StatusEffects.HASTE, 20 * 120, 1, 1F),
            new EffectData(StatusEffects.STRENGTH, 20 * 60, 3, 1F),
            new EffectData(StatusEffects.INSTANT_HEALTH, 20 * 60, 2, 1F),
            new EffectData(StatusEffects.REGENERATION, 20 * 25, 4, 1F),
            new EffectData(StatusEffects.GLOWING, 20 * 120, 3, 1F)
    );
    public static final ConsumableComponent SPONGE_APPLE_EFFECT = createConsumableEffect(
            new EffectData(StatusEffects.SPEED, 20 * 40, 1, 1F),
            new EffectData(StatusEffects.HASTE, 20 * 60, 0, 1F),
            new EffectData(StatusEffects.DOLPHINS_GRACE, 20 * 15, 0, 1F),
            new EffectData(StatusEffects.WATER_BREATHING, 20 * 60, 1, 1F),
            new EffectData(StatusEffects.NIGHT_VISION, 20 * 40, 1, 1F)
    );
    public static final ConsumableComponent SNOW_APPLE_EFFECT = createConsumableEffect(
            new EffectData(StatusEffects.REGENERATION, 20 * 4, 0, 0.9F),
            new EffectData(StatusEffects.NIGHT_VISION, 20 * 20, 3, 1F),
            new EffectData(StatusEffects.FIRE_RESISTANCE, 20 * 30, 5, 1F)
    );
    public static final ConsumableComponent SLIME_APPLE_EFFECT = createConsumableEffect(
            new EffectData(StatusEffects.REGENERATION, 20 * 5, 0, 0.9F),
            new EffectData(StatusEffects.JUMP_BOOST, 20 * 60, 5, 1F),
            new EffectData(StatusEffects.SLOWNESS, 20 * 60, 0, 1F),
            new EffectData(StatusEffects.OOZING, 20 * 60, 3, 1F)
    );
    public static final ConsumableComponent SAND_APPLE_EFFECT = createConsumableEffect(
            new EffectData(StatusEffects.INFESTED, 20 * 3, 2, 1F),
            new EffectData(StatusEffects.INSTANT_HEALTH, 20 * 10, 2, 1F)
    );
    public static final ConsumableComponent MILK_APPLE_EFFECT = ConsumableComponents.food()
            .consumeEffect(ClearAllEffectsConsumeEffect.INSTANCE)
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20 * 20, 3), 1F))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 20 * 10, 2), 1F))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20 * 50, 5), 1F))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 20 * 20, 3), 1F))
            .build();
    public static final ConsumableComponent LAVA_APPLE_EFFECT = createConsumableEffect(
            new EffectData(StatusEffects.REGENERATION, 20 * 4, 0, 0.9F),
            new EffectData(StatusEffects.WATER_BREATHING, 20 * 60, 1, 1F),
            new EffectData(StatusEffects.FIRE_RESISTANCE, 20 * 60, 2, 1F),
            new EffectData(StatusEffects.INSTANT_DAMAGE, 20 / 2, 0, 1F)
    );
    public static final ConsumableComponent HONEY_APPLE_EFFECT = createConsumableEffect(
            new EffectData(StatusEffects.REGENERATION, 20 * 4, 0, 0.9F),
            new EffectData(StatusEffects.SPEED, 20 * 60, 5, 1F),
            new EffectData(StatusEffects.SLOWNESS, 20 * 60, 0, 1F),
            new EffectData(StatusEffects.HASTE, 20 * 60, 3, 1F)
    );
    public static final ConsumableComponent ENDER_APPLE_EFFECT = ConsumableComponents.food()
            .consumeEffect(new TeleportRandomlyConsumeEffect())
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 20 * 10, 5), 1F))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20 * 10, 5), 1F))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 20 * 10, 5), 1F))
            .build();
    public static final ConsumableComponent ENCHANTED_SPONGE_APPLE_EFFECT = createConsumableEffect(
            new EffectData(StatusEffects.SPEED, 20 * 80, 2, 1F),
            new EffectData(StatusEffects.HASTE, 20 * 80, 1, 1F),
            new EffectData(StatusEffects.DOLPHINS_GRACE, 20 * 40, 4, 1F),
            new EffectData(StatusEffects.CONDUIT_POWER, 20 * 100, 5, 1F),
            new EffectData(StatusEffects.RESISTANCE, 20 * 120, 2, 1F),
            new EffectData(StatusEffects.REGENERATION, 20 * 25, 2, 1F),
            new EffectData(StatusEffects.HEALTH_BOOST, 20 * 120, 1, 1F),
            new EffectData(StatusEffects.WATER_BREATHING, 20 * 120, 5, 1F),
            new EffectData(StatusEffects.NIGHT_VISION, 20 * 100, 4, 1F)
    );


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

    private static FoodComponent.Builder createAppleFoodComponent(int nutrition, float saturationModifier) {
        return new FoodComponent.Builder()
                .nutrition(nutrition)
                .saturationModifier(saturationModifier)
                .alwaysEdible();
    }

}
