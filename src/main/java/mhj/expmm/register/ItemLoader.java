package mhj.expmm.register;

import mhj.expmm.ExperimentalMagic;
import mhj.expmm.common.item.foci.FocusEffectEmbellishmentDeathMagic;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import thaumcraft.api.casters.FocusEngine;

import static mhj.expmm.common.item.ItemsEXPMM.itemReference;

/**
 * @Author: ManualHuaJi
 */
@Mod.EventBusSubscriber(modid = ExperimentalMagic.MODID)
public class ItemLoader {
    public static Item[] items = {
            itemReference
    };


    @SubscribeEvent
    public static void registerItem(RegistryEvent.Register<Item> itemRegister) {
        IForgeRegistry<Item> ir = itemRegister.getRegistry();
        for (final Item item : items) {
            ir.register(item);
        }
    }


    public static void registerFocus() {
        FocusEngine.registerElement(FocusEffectEmbellishmentDeathMagic.class, new ResourceLocation("expmm", "textures/foci/deathmagic.png"), 15734052);

    }


}