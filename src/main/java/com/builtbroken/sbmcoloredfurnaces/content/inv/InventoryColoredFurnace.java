package com.builtbroken.sbmcoloredfurnaces.content.inv;

import javax.annotation.Nonnull;

import net.minecraft.init.Items;
import net.minecraft.inventory.SlotFurnaceFuel;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraftforge.items.ItemStackHandler;

/**
 * Created by Dark(DarkGuardsman, Robert) on 6/9/2019.
 */
public class InventoryColoredFurnace extends ItemStackHandler
{
    public InventoryColoredFurnace()
    {
        super(3);
    }

    @Override
    public boolean isItemValid(int index, @Nonnull ItemStack stack)
    {
        if (index == 2)
        {
            return false;
        }
        else if (index == 0)
        {
            return true;
        }
        else if (index == 1)
        {
            ItemStack itemstack = getStackInSlot(1);
            return TileEntityFurnace.isItemFuel(stack) || SlotFurnaceFuel.isBucket(stack) && itemstack.getItem() != Items.BUCKET;
        }
        return false;
    }


}
