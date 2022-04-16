package fr.neptunemanifold.solepsilon.objects.armour;

import fr.neptunemanifold.solepsilon.SolEpsilonMain;
import fr.neptunemanifold.solepsilon.init.ItemInit;
import fr.neptunemanifold.solepsilon.utils.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmourBase extends ItemArmor implements IHasModel {
    public ArmourBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot entityEquipmentSlotIn, CreativeTabs tabs) {

        super(materialIn, renderIndexIn, entityEquipmentSlotIn);
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
