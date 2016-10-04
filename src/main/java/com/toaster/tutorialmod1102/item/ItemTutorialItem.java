package com.toaster.tutorialmod1102.item;

import com.toaster.tutorialmod1102.TutorialMod1102;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

import java.util.List;

/**
 * Created by Tim on 10/3/2016.
 */
public class ItemTutorialItem extends Item {
    public ItemTutorialItem(String name){
        setUnlocalizedName(name);
        setCreativeTab(TutorialMod1102.tabTutorial);
        setMaxStackSize(16);

    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand) {
        if(!worldIn.isRemote) playerIn.addChatComponentMessage(new TextComponentString("I wonder what this does to shelves..."));
        return super.onItemRightClick(itemStackIn, worldIn, playerIn, hand);
    }

    @Override
    public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if(worldIn.getBlockState(pos).getBlock() == Blocks.BOOKSHELF){
            worldIn.setBlockState(pos, Blocks.DIAMOND_BLOCK.getDefaultState());

            return EnumActionResult.SUCCESS;
        } else if(worldIn.getBlockState(pos).getBlock() == Blocks.DIAMOND_BLOCK){
            worldIn.setBlockState(pos, Blocks.BOOKSHELF.getDefaultState());
            return EnumActionResult.SUCCESS;
        }
        return EnumActionResult.PASS;
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        tooltip.add("Item tooltip, heyo");
        super.addInformation(stack, playerIn, tooltip, advanced);
    }

    @Override
    public EnumRarity getRarity(ItemStack stack) {

        return EnumRarity.EPIC;
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }
}
