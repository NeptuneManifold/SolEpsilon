package fr.neptunemanifold.solepsilon.objects.items;

import fr.neptunemanifold.solepsilon.SolEpsilonMain;
import fr.neptunemanifold.solepsilon.init.ItemInit;
import fr.neptunemanifold.solepsilon.utils.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
    public ItemBase(String name, CreativeTabs tabs) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tabs);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        SolEpsilonMain.proxy.registerModel(this, 0);
    }
}
