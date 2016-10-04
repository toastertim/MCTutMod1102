package com.toaster.tutorialmod1102.crafting;

import com.toaster.tutorialmod1102.TutorialMod1102;
import com.toaster.tutorialmod1102.item.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Tim on 10/3/2016.
 */
public class ModRecipes {

    public static void addRecipes(){
        //shaped crafting recipes
        GameRegistry.addRecipe(new ItemStack(ModItems.tutorialItem), "OBO", "BDB", "OBO", 'O', Blocks.OBSIDIAN, 'B', Items.BOOK, 'D', Blocks.DIAMOND_BLOCK);

        //shapeless crafting recipes
        //GameRegistry.addShapelessRecipe(new ItemStack(ModItems.cornSeed), new ItemStack(ModItems.corn));

        //smelting recipes
        //GameRegistry.addSmelting(ModBlocks.oreCopper, new ItemStack(ModItems.ingotCopper), 1.0f);
    }
}
