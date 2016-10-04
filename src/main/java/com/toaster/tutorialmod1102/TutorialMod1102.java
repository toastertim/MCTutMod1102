package com.toaster.tutorialmod1102;

import com.toaster.tutorialmod1102.crafting.ModRecipes;
import com.toaster.tutorialmod1102.item.ModItems;
import com.toaster.tutorialmod1102.proxy.CommonProxy;
import com.toaster.tutorialmod1102.tab.CreativeTabTutorial;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = TutorialMod1102.MODID, version = TutorialMod1102.VERSION, name = TutorialMod1102.NAME)
public class TutorialMod1102
{
    public static final String MODID = "tutorialmod1102";
    public static final String VERSION = "1.0";
    public static final String NAME = "Tutorial Mod 1.10.2";

    @SidedProxy(clientSide = "com.toaster.tutorialmod1102.proxy.ClientProxy", serverSide = "com.toaster.tutorialmod1102.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static TutorialMod1102 instance;

    public static CreativeTabTutorial tabTutorial;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        tabTutorial = new CreativeTabTutorial(CreativeTabs.getNextID(), "tab_tutorial");
        ModItems.preInit();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        ModRecipes.addRecipes();
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
        proxy.postInit(event);
    }
}
