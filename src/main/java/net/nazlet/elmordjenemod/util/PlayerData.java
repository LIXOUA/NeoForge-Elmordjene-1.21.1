package net.nazlet.elmordjenemod.util;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.player.Player;

public class PlayerData {
    private static final String CRAFT_COUNT_TAG = "CraftedItemCount";

    // Sauvegarde le nombre d'objets craftés dans les données persistantes du joueur
    public static void saveCraftCount(Player player, int count) {
        CompoundTag data = player.getPersistentData();
        data.putInt(CRAFT_COUNT_TAG, count);
    }

    // Charge le nombre d'objets craftés depuis les données persistantes du joueur
    public static int loadCraftCount(Player player) {
        CompoundTag data = player.getPersistentData();
        return data.getInt(CRAFT_COUNT_TAG);
    }
}