package fr.neptunemanifold.solepsilon.world.gen;

import fr.neptunemanifold.solepsilon.init.BlockInit;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class WorldGenCustomOres implements IWorldGenerator {
    private WorldGenerator ore_overworld_neptunite;
    private WorldGenerator ore_overworld_copper;
    private WorldGenerator ore_overworld_tin;
    public WorldGenCustomOres(){
        ore_overworld_neptunite = new WorldGenMinable(BlockInit.NEPTUNITE_ORE.getDefaultState(), 3, BlockMatcher.forBlock(Blocks.STONE));
        ore_overworld_copper = new WorldGenMinable(BlockInit.COPPER_ORE.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.STONE));
        ore_overworld_tin = new WorldGenMinable(BlockInit.TIN_ORE.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.STONE));
    }
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider){
        switch (world.provider.getDimension()){
            case -1:
                break;
            case 0:
                runGenerator(ore_overworld_neptunite,world,random,chunkX,chunkZ,10,0,30);
                runGenerator(ore_overworld_copper,world,random,chunkX,chunkZ,75,0,100);
                runGenerator(ore_overworld_tin,world,random,chunkX,chunkZ,70,0,100);
                break;
            case 1:
                break;
        }
    }
    private void runGenerator(WorldGenerator gen, World world,Random ran,int chunkX, int chunkZ, int chance, int minHeight, int maxHeight){
        if(minHeight > maxHeight || minHeight <0 || maxHeight > 256) throw new IllegalArgumentException("Ore generator is out of bounds");

        int heightDiff = maxHeight - minHeight + 1;
        for(int i = 0; i < chance; i++){
            int x = chunkX * 16 + ran.nextInt(16);
            int y = minHeight + ran.nextInt(heightDiff);
            int z = chunkZ * 16 + ran.nextInt(16);

            gen.generate(world,ran, new BlockPos(x,y,z));
        }
    }
}
