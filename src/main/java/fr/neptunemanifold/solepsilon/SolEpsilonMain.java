package fr.neptunemanifold.solepsilon;

import fr.neptunemanifold.solepsilon.proxy.CommonProxy;
import fr.neptunemanifold.solepsilon.tabs.SolEpsilonBlockTab;
import fr.neptunemanifold.solepsilon.tabs.SolEpsilonCombatTab;
import fr.neptunemanifold.solepsilon.tabs.SolEpsilonItemTab;
import fr.neptunemanifold.solepsilon.utils.Refs;
import fr.neptunemanifold.solepsilon.utils.handlers.RegistryHandlers;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Refs.MODID, name = Refs.NAME, version = Refs.VERSION)
public class SolEpsilonMain {

    public static final CreativeTabs solEpsilonCombatTab = new SolEpsilonCombatTab("combattab");
    public static final CreativeTabs solEpsilonItemTab = new SolEpsilonItemTab("itemtab");
    public static final CreativeTabs solEpsilonBlockTab = new SolEpsilonBlockTab("solepsilonblocktab");

    @Mod.Instance
    public static SolEpsilonMain instance;

    @SidedProxy(clientSide = Refs.CLIENT, serverSide = Refs.COMMON)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent e){
        RegistryHandlers.otherRegistries();
    }
    public static void Init(FMLInitializationEvent e){
        RegistryHandlers.initRegistries();
    }
    public static void postInit(FMLPostInitializationEvent e){

    }
}
