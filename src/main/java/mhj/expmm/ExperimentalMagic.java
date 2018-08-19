package mhj.expmm;

import mhj.expmm.common.CommonProxy;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.research.ResearchCategories;

import static mhj.expmm.ExperimentalMagic.*;

/**
 * @Author: ManualHuaJi
 */
@Mod(modid = MODID, name = NAME, version = VERSION, dependencies = "required-after:thaumcraft@[6.1.BETA20,);", acceptedMinecraftVersions = "1.12.2")
public class ExperimentalMagic {
    @SidedProxy(clientSide = "mhj.expmm.client.ClientProxy", serverSide = "mhj.expmm.common.CommonProxy")
    public static CommonProxy proxy;
    public static final String MODID = "expmm", NAME = "ExperimentalMagic", VERSION = "0.0.1";


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event) {
        ResearchCategories.registerCategory("EXPMM", null, new AspectList()
                .add(Aspect.PLANT, 5).add(Aspect.ORDER, 5).add(Aspect.ENTROPY, 5).add(Aspect.AIR, 5).add(Aspect.FIRE, 5).add(Aspect.EARTH, 3).add(Aspect.WATER, 5), new ResourceLocation("thaumcraft", "textures/items/thaumonomicon_cheat.png"), new ResourceLocation("thaumcraft", "textures/gui/gui_research_back_1.jpg"), null);
        proxy.Init(event);

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
