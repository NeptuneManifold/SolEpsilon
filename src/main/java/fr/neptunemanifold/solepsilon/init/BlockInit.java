package fr.neptunemanifold.solepsilon.init;

import fr.neptunemanifold.solepsilon.SolEpsilonMain;
import fr.neptunemanifold.solepsilon.objects.blocks.BlockBase;
import fr.neptunemanifold.solepsilon.objects.blocks.BlockOre;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    //ores
    public static final Block BLOCK_NEPTUNITE = new BlockBase("block_neptunite", Material.IRON, SolEpsilonMain.solEpsilonBlockTab,6.0F, 7.0F, 2, "pickaxe");
    public static final Block NEPTUNITE_ORE = new BlockOre("neptunite_ore","pickaxe",2,5.4F,5.5F, SolEpsilonMain.solEpsilonBlockTab,1,1, ItemInit.NEPTUNITE);
    //copper
    public static final Block COPPER_BLOCK = new BlockBase("copper_block", Material.IRON, SolEpsilonMain.solEpsilonBlockTab, 2.5F, 1.5F,1, "pickaxe");
    public static final Block COPPER_ORE = new BlockOre("copper_ore", "pickaxe", 1, 1.8F, 2.4F, SolEpsilonMain.solEpsilonBlockTab, 1,1, ItemInit.COPPER_INGOT);
    public static final Block TIN_BLOCK = new BlockBase("tin_block", Material.IRON, SolEpsilonMain.solEpsilonBlockTab, 2.5F,1.5F, 1, "pickaxe");
    public static final Block TIN_ORE = new BlockOre("tin_ore", "pickaxe", 1, 1.8F, 2.4F, SolEpsilonMain.solEpsilonBlockTab, 1, 1, ItemInit.TIN_INGOT);
    public static final Block MACHINE_FRAME = new BlockBase("machine_frame", Material.IRON, SolEpsilonMain.solEpsilonBlockTab, 2.5F, 1.5F, 1, "pickaxe");
}
