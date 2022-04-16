package fr.neptunemanifold.solepsilon.objects.tools;

import fr.neptunemanifold.solepsilon.SolEpsilonMain;
import fr.neptunemanifold.solepsilon.init.ItemInit;
import fr.neptunemanifold.solepsilon.utils.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class ToolShovel extends ItemSpade implements IHasModel {
    public ToolShovel(String name,ToolMaterial material, CreativeTabs tab) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);

        ItemInit.ITEMS.add(this);
    }
    @Override
    public void registerModels() {
        SolEpsilonMain.proxy.registerModel(this, 0);
    }
}
