package fr.neptunemanifold.solepsilon.objects.tools;

import fr.neptunemanifold.solepsilon.SolEpsilonMain;
import fr.neptunemanifold.solepsilon.init.ItemInit;
import fr.neptunemanifold.solepsilon.utils.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel {
    public ToolSword(String name,ToolMaterial material, CreativeTabs tab) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
//
        ItemInit.ITEMS.add(this);
    }
    @Override
    public void registerModels() {
        SolEpsilonMain.proxy.registerModel(this, 0);
    }
}
