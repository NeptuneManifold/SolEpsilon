package fr.neptunemanifold.solepsilon.tabs;

import fr.neptunemanifold.solepsilon.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class SolEpsilonItemTab extends CreativeTabs {
    public SolEpsilonItemTab(String label){ super("itemtab"); this.setBackgroundImageName("solepsilonitem.png");}

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemInit.NEPTUNITE);
    }
}
