package net.nazlet.elmordjenemod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties ELMordjene = new FoodProperties.Builder().nutrition(10).saturationModifier(0.25f)
            .effect(new MobEffectInstance(MobEffects.CONFUSION, 600, 0), 1.0F)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 400, 1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3000, 0), 1.0F)
            .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 3000, 0), 1.0F)
            .effect(new MobEffectInstance(MobEffects.ABSORPTION, 2400, 3), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 2), 1f)
            .effect(new MobEffectInstance(MobEffects.POISON, 140, 3), 0.5F)
            .alwaysEdible()
            .build();

    public static final FoodProperties TARTINE = new FoodProperties.Builder().nutrition(20).saturationModifier(0.25f)
            .effect(new MobEffectInstance(MobEffects.POISON, 100, 0), 0.035F)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 1), 0.5f)
            .alwaysEdible()
            .build();
}