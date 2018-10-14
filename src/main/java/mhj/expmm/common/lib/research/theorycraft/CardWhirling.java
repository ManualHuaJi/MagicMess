package mhj.expmm.common.lib.research.theorycraft;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.TextComponentTranslation;
import thaumcraft.api.research.theorycraft.ResearchTableData;
import thaumcraft.api.research.theorycraft.TheorycraftCard;

/**
 * @Author: ManualHuaJi
 */
public class CardWhirling extends TheorycraftCard {
    @Override
    public int getInspirationCost() {
        return 1;
    }

    @Override
    public boolean initialize(EntityPlayer player, ResearchTableData data) {
        return true;
    }

    @Override
    public String getLocalizedName() {
        return new TextComponentTranslation("card.whirling.name", new Object[0]).getUnformattedText();
    }

    @Override
    public String getLocalizedText() {
        return new TextComponentTranslation("card.whirling.text", new Object[0]).getUnformattedText();
    }

    @Override
    public boolean activate(EntityPlayer player, ResearchTableData data) {
        data.addTotal("ELDRITCH", MathHelper.getInt(player.getRNG(), 15, 30));
        return true;
    }
}
