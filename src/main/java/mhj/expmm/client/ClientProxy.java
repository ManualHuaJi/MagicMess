package mhj.expmm.client;

import mhj.expmm.common.CommonProxy;
import mhj.expmm.common.block.BlockLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * @Author: ManualHuaJi
 */
public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
        BlockLoader.registerRender();
    }

    @Override
    public void Init(FMLInitializationEvent event) {
        super.Init(event);
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }
}
