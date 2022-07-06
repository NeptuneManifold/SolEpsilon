package fr.neptunemanifold.solepsilon.utils.compat;

import fr.neptunemanifold.solepsilon.init.BlockInit;
import fr.neptunemanifold.solepsilon.init.ItemInit;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryCompat {
    public static void registerOres(){
        OreDictionary.registerOre("oreCopper", BlockInit.COPPER_ORE);
        OreDictionary.registerOre("ingotCopper", ItemInit.COPPER_INGOT);
        OreDictionary.registerOre("ingotCopper", ItemInit.TIN_INGOT);
    }
}
