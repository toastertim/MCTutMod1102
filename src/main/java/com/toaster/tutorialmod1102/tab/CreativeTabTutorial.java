package com.toaster.tutorialmod1102.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * Created by Tim on 10/3/2016.
 */
public class CreativeTabTutorial extends CreativeTabs {
    public CreativeTabTutorial(int index, String label) {
        super(index, label);
    }

    @Override
    public Item getTabIconItem() {
        return Items.DARK_OAK_BOAT;
    }
}
