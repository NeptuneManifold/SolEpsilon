package fr.neptunemanifold.solepsilon.tabs;

import fr.neptunemanifold.solepsilon.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class SolEpsilonCombatTab extends CreativeTabs {

    public SolEpsilonCombatTab(String label){ super("combattab"); this.setBackgroundImageName("solepsiloncombat.png");}

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemInit.NEPTUNITE_SWORD);
    }

}
