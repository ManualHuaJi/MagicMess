package mhj.expmm.common.item.foci;

import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.casters.Trajectory;

/**
 * @Author: ManualHuaJi
 */
public class FocusEffectEmbellishmentAfterImage extends FocusEffectEmbellishment {
    @Override
    public boolean execute(RayTraceResult target, Trajectory trajectory, float finalPower, int num) {
        return false;
    }

    @Override
    public int getComplexity() {
        return 2;
    }


    @Override
    public Aspect getAspect() {
        return Aspect.SOUL;
    }

    @Override
    public EnumSupplyType[] willSupply() {
        return new EnumSupplyType[]{EnumSupplyType.TARGET};
    }

    @Override
    public void renderParticleFX(World world, double posX, double posY, double posZ, double motionX, double motionY, double motionZ) {

    }

    @Override
    public String getKey() {
        return"expmm.EF.AFTERIMAGE";
    }

    @Override
    public String getResearch() {
        return null;
    }


}
