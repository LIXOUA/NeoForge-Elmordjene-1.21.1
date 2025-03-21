package net.nazlet.elmordjenemod.item;

import net.minecraft.world.item.Item;
import net.nazlet.elmordjenemod.ElMordjeneMod;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ElMordjeneMod.MODID);

    public static final DeferredItem<Item> ELMordjene = ITEMS.register("elmordjene",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ELMordjene)));

    public static final DeferredItem<Item> TARTINE = ITEMS.register("tartine",
            () -> new Item(new Item.Properties().food(ModFoodProperties.TARTINE)));

    public static final DeferredItem<Item> KEBAB = ITEMS.register("kebab",
            () -> new Item(new Item.Properties().food(ModFoodProperties.KEBAB)));

    public static final DeferredItem<Item> VBUCKS = ITEMS.register("vbucks",
            () -> new Item(new Item.Properties().food(ModFoodProperties.VBUCKS)));







    public static void register (IEventBus eventbus) {
        ITEMS.register(eventbus);

    }
}
