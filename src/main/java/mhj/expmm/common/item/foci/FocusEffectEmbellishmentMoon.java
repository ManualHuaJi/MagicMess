package mhj.expmm.common.item.foci;

import thaumcraft.api.aspects.Aspect;

/**
 * @Author: ManualHuaJi
 */
public class FocusEffectEmbellishmentMoon extends FocusEffectEmbellishment {
    @Override
    public int getComplexity() {
        return 2;
    }

    @Override
    public boolean execute() {
        return false;
    }

    @Override
    public Aspect getAspect() {
        return Aspect.DARKNESS;
    }

    @Override
    public EnumSupplyType[] mustBeSupplied() {
        return new EnumSupplyType[]{EnumSupplyType.TRAJECTORY};
    }

    @Override
    public EnumSupplyType[] willSupply() {
        return new EnumSupplyType[]{EnumSupplyType.TARGET};
    }

    @Override
    public String getKey() {
        return "EF.moon";
    }

    @Override
    public String getResearch() {
        return null;
    }
}
