package net.nazlet.elmordjenemod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties ELMordjene = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f)
            .effect(new MobEffectInstance(MobEffects.CONFUSION, 600, 0), 1.0F)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 400, 1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3000, 0), 1.0F)
            .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 3000, 0), 1.0F)
            .effect(new MobEffectInstance(MobEffects.ABSORPTION, 2400, 3), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 2), 1f)
            .effect(new MobEffectInstance(MobEffects.POISON, 140, 3), 0.5F)
            .alwaysEdible()
            .build();

    public static final FoodProperties TARTINE = new FoodProperties.Builder().nutrition(10).saturationModifier(0.25f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 1), 1f)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3000, 0), 1.0F)
            .alwaysEdible()
            .build();

    public static final FoodProperties KEBAB = new FoodProperties.Builder().nutrition(20).saturationModifier(1f)
            .effect(new MobEffectInstance(MobEffects.SATURATION, 6000, 0), 1.0F)
            .build();

    public static final FoodProperties VBUCKS = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f)
            .effect(new MobEffectInstance(MobEffects.GLOWING, 6000, 3), 1.0F)
            .effect(new MobEffectInstance(MobEffects.LUCK, 6000, 4), 1.0F)
            .alwaysEdible()
            .build();

}
