package mhj.expmm;

import mhj.expmm.event.EventLoader;
import mhj.expmm.register.ResearchLoader;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.research.ResearchCategories;
import thaumcraft.api.research.ResearchCategory;

import static mhj.expmm.ExperimentalMagic.*;

/**
 * @Author: ManualHuaJi
 */
@Mod(modid = MODID, name = NAME, version = VERSION, dependencies = "required-after:thaumcraft@[6.1.BETA20,);", acceptedMinecraftVersions = "1.12.2")
public class ExperimentalMagic {
    @SidedProxy(clientSide = "mhj.expmm.ClientProxy", serverSide = "mhj.expmm.CommonProxy")
    public static CommonProxy proxy;
    public static final String MODID = "expmm", NAME = "ExperimentalMagic", VERSION = "0.0.1";
    public static ResearchCategory EXPMM;

    @Mod.Instance(MODID)
    public static ExperimentalMagic instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        OBJLoader.INSTANCE.addDomain(MODID);
        MinecraftForge.EVENT_BUS.register(new ResearchLoader());

        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event) {
        new EventLoader();
        EXPMM = ResearchCategories.registerCategory(MODID.toUpperCase(), (String) null, (AspectList) null, new ResourceLocation("expmm", "textures/misc/cat.png"), new ResourceLocation("thaumcraft", "textures/gui/gui_research_back_1.jpg"), null);

        proxy.Init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
