package fr.neptunemanifold.solepsilon.tabs;

import fr.neptunemanifold.solepsilon.init.BlockInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SolEpsilonBlockTab extends CreativeTabs {
    public SolEpsilonBlockTab(String label){ super("solepsilonblocktab"); this.setBackgroundImageName("solepsilonblock.png");}

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(Item.getItemFromBlock(BlockInit.BLOCK_NEPTUNITE));
    }
}
