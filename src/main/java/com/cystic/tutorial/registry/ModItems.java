package com.cystic.tutorial.registry;

import com.cystic.tutorial.Tutorial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item LOST_FEATHER = new Item(new Item.Settings().group(ItemGroup.MISC));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Tutorial.MOD_ID, "lost_feather"), LOST_FEATHER);
    }
}
