package fr.neptunemanifold.solepsilon.utils.handlers;

import fr.neptunemanifold.solepsilon.init.BlockInit;
import fr.neptunemanifold.solepsilon.init.ItemInit;
import fr.neptunemanifold.solepsilon.utils.IHasModel;
import fr.neptunemanifold.solepsilon.utils.compat.OreDictionaryCompat;
import fr.neptunemanifold.solepsilon.world.gen.WorldGenCustomOres;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod.EventBusSubscriber
public class RegistryHandlers {
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> e){
        e.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
    }
    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> e){
        e.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
    }
    public static void  initRegistries(){
        OreDictionaryCompat.registerOres();
    }
    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent e){
        for(Item item : ItemInit.ITEMS){
            if(item instanceof IHasModel){
                ((IHasModel)item).registerModels();
            }
        }
        for(Block block : BlockInit.BLOCKS){
            if(block instanceof IHasModel){
                ((IHasModel)block).registerModels();
            }
        }
    }
    public static void otherRegistries(){
        GameRegistry.registerWorldGenerator(new WorldGenCustomOres(), 0);
    }
}
