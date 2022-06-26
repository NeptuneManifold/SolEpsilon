package fr.neptunemanifold.solepsilon.objects.blocks;

import fr.neptunemanifold.solepsilon.SolEpsilonMain;
import fr.neptunemanifold.solepsilon.init.BlockInit;
import fr.neptunemanifold.solepsilon.init.ItemInit;
import fr.neptunemanifold.solepsilon.utils.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import java.util.Random;

public class BlockOre extends net.minecraft.block.BlockOre implements IHasModel{

    private Item droppedItem;
    private int min;
    private int max;
    public BlockOre(String name, String toolClass, int harvestLevel, float res, float hardness, CreativeTabs tab, int maxdrop, int mindrop, Item dropItem){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
        setHarvestLevel(toolClass, harvestLevel);
        setResistance(res);
        setHardness(hardness);
        droppedItem = dropItem;

        this.min = mindrop;
        this.max = maxdrop;

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return ItemInit.NEPTUNITE;
    }

    @Override
    public void registerModels() {
        SolEpsilonMain.proxy.registerModel(Item.getItemFromBlock(this),0);
    }

    @Override
    public int quantityDropped(Random rand) {
        int maxDrop = max;
        int minDrop = min;
        return rand.nextInt(maxDrop)+minDrop;
    }
}
