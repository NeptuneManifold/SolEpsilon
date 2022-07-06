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
    public static final Item.ToolMaterial TOOL_COPPER = EnumHelper.addToolMaterial("tool_copper", 1, 200,1.0F, 1.2F, 2);
    public static final Item.ToolMaterial TOOL_TIN = EnumHelper.addToolMaterial("tool_tin", 1, 180,0.8F, 1.0F, 2);
    public static final ItemArmor.ArmorMaterial ARMOUR_NEPTUNITE = EnumHelper.addArmorMaterial("armour_neptunite", Refs.MODID + ":neptunite", 40, new int[]{10, 10, 10, 10}, 13, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.1F);
    public static final ItemArmor.ArmorMaterial ARMOUR_COPPER = EnumHelper.addArmorMaterial("armour_copper", Refs.MODID + ":copper", 6, new int[]{2, 1, 2, 1}, 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static final ItemArmor.ArmorMaterial ARMOUR_TIN = EnumHelper.addArmorMaterial("armour_tin", Refs.MODID + ":tin", 5, new int[]{2, 1, 1, 1}, 25, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

    //ores items
    public static final Item NEPTUNITE = new ItemBase("neptunite", SolEpsilonMain.solEpsilonItemTab);
    public static final Item COPPER_INGOT = new ItemBase("copper_ingot", SolEpsilonMain.solEpsilonItemTab);
    public static final Item COPPER_NUGGET = new ItemBase("copper_nugget", SolEpsilonMain.solEpsilonItemTab);

    //tools
    public static final Item NEPTUNITE_PICKAXE = new ToolPickaxe("neptunite_pickaxe",TOOL_NEPTUNITE, SolEpsilonMain.solEpsilonItemTab);
    public static final Item NEPTUNITE_SHOVEL = new ToolShovel("neptunite_shovel",TOOL_NEPTUNITE, SolEpsilonMain.solEpsilonItemTab);
    public static final Item NEPTUNITE_HOE = new ToolHoe("neptunite_hoe",TOOL_NEPTUNITE, SolEpsilonMain.solEpsilonItemTab);
    public static final Item NEPTUNITE_AXE = new ToolAxe("neptunite_axe",TOOL_NEPTUNITE,10.0F,-3.205F, SolEpsilonMain.solEpsilonItemTab);
    public static final Item COPPER_PICKAXE = new ToolPickaxe("copper_pickaxe",TOOL_COPPER, SolEpsilonMain.solEpsilonItemTab);
    public static final Item COPPER_SHOVEL = new ToolShovel("copper_shovel",TOOL_COPPER, SolEpsilonMain.solEpsilonItemTab);
    public static final Item COPPER_HOE = new ToolHoe("copper_hoe",TOOL_COPPER, SolEpsilonMain.solEpsilonItemTab);
    public static final Item COPPER_AXE = new ToolAxe("copper_axe",TOOL_COPPER,3.0F,-3.205F, SolEpsilonMain.solEpsilonItemTab);
    public static final Item TIN_PICKAXE = new ToolPickaxe("tin_pickaxe",TOOL_TIN, SolEpsilonMain.solEpsilonItemTab);
    public static final Item TIN_SHOVEL = new ToolShovel("tin_shovel",TOOL_TIN, SolEpsilonMain.solEpsilonItemTab);
    public static final Item TIN_HOE = new ToolHoe("tin_hoe",TOOL_TIN, SolEpsilonMain.solEpsilonItemTab);
    public static final Item TIN_AXE = new ToolAxe("tin_axe",TOOL_TIN,2.6F,-3.205F, SolEpsilonMain.solEpsilonItemTab);
    public static final Item NEPTUNITE_SWORD = new ToolSword("neptunite_sword",TOOL_NEPTUNITE, SolEpsilonMain.solEpsilonCombatTab);
    public static final Item COPPER_SWORD = new ToolSword("copper_sword",TOOL_COPPER, SolEpsilonMain.solEpsilonCombatTab);
    public static final Item TIN_SWORD = new ToolSword("tin_sword",TOOL_TIN, SolEpsilonMain.solEpsilonCombatTab);

    //armors
    public static final Item NEPTUNITE_BOOTS = new ArmourBase("neptunite_boots",ARMOUR_NEPTUNITE,1,EntityEquipmentSlot.FEET, SolEpsilonMain.solEpsilonCombatTab);
    public static final Item NEPTUNITE_LEGGINGS = new ArmourBase("neptunite_leggings",ARMOUR_NEPTUNITE,2, EntityEquipmentSlot.LEGS, SolEpsilonMain.solEpsilonCombatTab);
    public static final Item NEPTUNITE_CHESTPLATE = new ArmourBase("neptunite_chestplate",ARMOUR_NEPTUNITE,1,EntityEquipmentSlot.CHEST, SolEpsilonMain.solEpsilonCombatTab);
    public static final Item NEPTUNITE_HELMET = new ArmourBase("neptunite_helmet",ARMOUR_NEPTUNITE,1,EntityEquipmentSlot.HEAD, SolEpsilonMain.solEpsilonCombatTab);
    public static final Item COPPER_BOOTS = new ArmourBase("copper_boots",ARMOUR_COPPER,1,EntityEquipmentSlot.FEET, SolEpsilonMain.solEpsilonCombatTab);
    public static final Item COPPER_LEGGINGS = new ArmourBase("copper_leggings",ARMOUR_COPPER,2, EntityEquipmentSlot.LEGS, SolEpsilonMain.solEpsilonCombatTab);
    public static final Item COPPER_CHESTPLATE = new ArmourBase("copper_chestplate",ARMOUR_COPPER,1,EntityEquipmentSlot.CHEST, SolEpsilonMain.solEpsilonCombatTab);
    public static final Item COPPER_HELMET = new ArmourBase("copper_helmet",ARMOUR_COPPER,1,EntityEquipmentSlot.HEAD, SolEpsilonMain.solEpsilonCombatTab);
    public static final Item TIN_BOOTS = new ArmourBase("tin_boots",ARMOUR_TIN,1,EntityEquipmentSlot.FEET, SolEpsilonMain.solEpsilonCombatTab);
    public static final Item TIN_LEGGINGS = new ArmourBase("tin_leggings",ARMOUR_TIN,2, EntityEquipmentSlot.LEGS, SolEpsilonMain.solEpsilonCombatTab);
    public static final Item TIN_CHESTPLATE = new ArmourBase("tin_chestplate",ARMOUR_TIN,1,EntityEquipmentSlot.CHEST, SolEpsilonMain.solEpsilonCombatTab);
    public static final Item TIN_HELMET = new ArmourBase("tin_helmet",ARMOUR_TIN,1,EntityEquipmentSlot.HEAD, SolEpsilonMain.solEpsilonCombatTab);

    public static final Item TIN_INGOT = new ItemBase("tin_ingot", SolEpsilonMain.solEpsilonItemTab);
    public static final Item TIN_NUGGET = new ItemBase("tin_nugget", SolEpsilonMain.solEpsilonItemTab);
}
