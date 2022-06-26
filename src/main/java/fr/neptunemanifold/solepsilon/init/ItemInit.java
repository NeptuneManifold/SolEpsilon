package fr.neptunemanifold.solepsilon.init;

import fr.neptunemanifold.solepsilon.SolEpsilonMain;
import fr.neptunemanifold.solepsilon.objects.armour.ArmourBase;
import fr.neptunemanifold.solepsilon.objects.items.ItemBase;
import fr.neptunemanifold.solepsilon.objects.tools.*;
import fr.neptunemanifold.solepsilon.utils.Refs;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {
    public static final List<Item> ITEMS = new ArrayList<Item>();

    //material
    public static final Item.ToolMaterial TOOL_NEPTUNITE = EnumHelper.addToolMaterial("tool_neptunite", 3, 2000,10.0F, 3.5F, 13);
    public static final ItemArmor.ArmorMaterial ARMOUR_NEPTUNITE = EnumHelper.addArmorMaterial("armour_neptunite", Refs.MODID + ":neptunite", 40, new int[]{10, 10, 10, 10}, 13, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.1F);

    //ores items
    public static final Item NEPTUNITE = new ItemBase("neptunite", SolEpsilonMain.solEpsilonItemTab);
    public static final Item COPPER_INGOT = new ItemBase("copper_ingot", SolEpsilonMain.solEpsilonItemTab);

    //tools
    public static final Item NEPTUNITE_PICKAXE = new ToolPickaxe("neptunite_pickaxe",TOOL_NEPTUNITE, SolEpsilonMain.solEpsilonItemTab);
    public static final Item NEPTUNITE_SHOVEL = new ToolShovel("neptunite_shovel",TOOL_NEPTUNITE, SolEpsilonMain.solEpsilonItemTab);
    public static final Item NEPTUNITE_HOE = new ToolHoe("neptunite_hoe",TOOL_NEPTUNITE, SolEpsilonMain.solEpsilonItemTab);
    public static final Item NEPTUNITE_AXE = new ToolAxe("neptunite_axe",TOOL_NEPTUNITE,10.0F,-3.205F, SolEpsilonMain.solEpsilonItemTab);
    public static final Item NEPTUNITE_SWORD = new ToolSword("neptunite_sword",TOOL_NEPTUNITE, SolEpsilonMain.solEpsilonCombatTab);

    //armors
    public static final Item NEPTUNITE_BOOTS = new ArmourBase("neptunite_boots",ARMOUR_NEPTUNITE,1,EntityEquipmentSlot.FEET, SolEpsilonMain.solEpsilonCombatTab);
    public static final Item NEPTUNITE_LEGGINGS = new ArmourBase("neptunite_leggings",ARMOUR_NEPTUNITE,2, EntityEquipmentSlot.LEGS, SolEpsilonMain.solEpsilonCombatTab);
    public static final Item NEPTUNITE_CHESTPLATE = new ArmourBase("neptunite_chestplate",ARMOUR_NEPTUNITE,1,EntityEquipmentSlot.CHEST, SolEpsilonMain.solEpsilonCombatTab);
    public static final Item NEPTUNITE_HELMET = new ArmourBase("neptunite_helmet",ARMOUR_NEPTUNITE,1,EntityEquipmentSlot.HEAD, SolEpsilonMain.solEpsilonCombatTab);
}
