package fr.neptunemanifold.solepsilon.objects.tools;

import com.google.common.collect.Sets;
import fr.neptunemanifold.solepsilon.SolEpsilonMain;
import fr.neptunemanifold.solepsilon.init.ItemInit;
import fr.neptunemanifold.solepsilon.utils.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

import java.util.Set;

public class ToolAxe extends ItemAxe implements IHasModel {

    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE);
    public ToolAxe(String name,ToolMaterial material, CreativeTabs tab) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);

        ItemInit.ITEMS.add(this);
    }

    public float getStrVsBlock(ItemStack stack, IBlockState state)
    {
        Material material = state.getMaterial();
        return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE ? 1 : this.toolMaterial.getEfficiency();
    }

    @Override
    public void registerModels() {
        SolEpsilonMain.proxy.registerModel(this, 0);
    }
}
