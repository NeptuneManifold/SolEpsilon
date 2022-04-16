package fr.neptunemanifold.solepsilon.init;

import fr.neptunemanifold.solepsilon.objects.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block BLOCK_NEPTUNITE = new BlockBase("block_neptunite", Material.IRON, CreativeTabs.BUILDING_BLOCKS);
}
