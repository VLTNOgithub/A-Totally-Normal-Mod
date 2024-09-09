package com.atotallynormalmod.item;

import com.atotallynormalmod.ATotallyNormalMod;
import com.atotallynormalmod.CustomItem;
import eu.pb4.polymer.core.api.item.SimplePolymerItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final SimplePolymerItem STICK_SWORD = registerItem("stick_sword", new SimplePolymerItem(new Item.Settings(), new Item(new Item.Settings())));
    
    
    private static <T extends Item> T registerItem(String name, T item) {
        return Registry.register(Registries.ITEM, Identifier.of(ATotallyNormalMod.MOD_ID, name), item);
    }
    
    public static void registerModItems() {
        ATotallyNormalMod.LOGGER.info("Registering Mod Items for " + ATotallyNormalMod.MOD_ID);
        
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(STICK_SWORD);
        });
    }
}
