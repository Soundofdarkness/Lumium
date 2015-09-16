package com.soundoflight.Lumium;

import com.soundoflight.Lumium.proxy.IProxy;
import com.soundoflight.Lumium.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid= Reference.MOD_ID, name= Reference.MOD_NAME, version= Reference.VERSION)

public class Lumium {

    @Mod.Instance(Reference.MOD_ID)
    public static Lumium instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){



    }

    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event) {



    }



}
