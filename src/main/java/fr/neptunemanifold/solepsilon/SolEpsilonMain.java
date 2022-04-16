package fr.neptunemanifold.solepsilon;

import fr.neptunemanifold.solepsilon.proxy.CommonProxy;
import fr.neptunemanifold.solepsilon.utils.Refs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Refs.MODID, name = Refs.NAME, version = Refs.VERSION)
public class SolEpsilonMain {
    @Mod.Instance
    public static SolEpsilonMain instance;

    @SidedProxy(clientSide = Refs.CLIENT, serverSide = Refs.COMMON)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent e){

    }
    public static void Init(FMLInitializationEvent e){

    }
    public static void postInit(FMLPostInitializationEvent e){

    }
}
