package mhj.expmm.research.theorycraft;

import mhj.expmm.tile.TileAdvancedResearchTable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import thaumcraft.api.research.theorycraft.ResearchTableData;
import thaumcraft.api.research.theorycraft.TheorycraftCard;
import thaumcraft.common.tiles.crafting.TileResearchTable;

/**
 * @Author: ManualHuaJi
 */
public class CardDifferent extends TheorycraftCard {
    String cat = "";
    int amt = 0;

    @Override
    public boolean initialize(EntityPlayer player, ResearchTableData data) {
        if (data.categoryTotals.size() < 1) {
            return false;
        }
        int hVal = 0;
        String hKey = "";
        for (String category : data.categoryTotals.keySet()) {
            int q = data.getTotal(category);
            if (q > hVal) {
                hVal = q;
                hKey = category;
            }
        }
        this.cat = hKey;
        this.amt = (10 + hVal / 2);
        return true;
    }

    @Override
    public int getInspirationCost() {
        return 1;
    }

    @Override
    public boolean isAidOnly() {
        return true;
    }

    @Override
    public String getLocalizedName() {
        return new TextComponentTranslation("card.different.name").getUnformattedText();
    }

    @Override
    public String getLocalizedText() {
        return new TextComponentTranslation("card.different.text", amt, new TextComponentTranslation(new StringBuilder().append("tc.research_category.").append(this.cat).toString()).getFormattedText() + TextFormatting.RESET).getUnformattedText();
    }

    @Override
    public boolean activate(EntityPlayer player, ResearchTableData data) {
        if (data.table instanceof TileResearchTable) {
            if ((data.table != null) && (((TileResearchTable) data.table).getStackInSlot(0) != null) &&
                    (((TileResearchTable) data.table).getStackInSlot(0).getItemDamage() < ((TileResearchTable) data.table).getStackInSlot(0).getMaxDamage()) &&
                    (((TileResearchTable) data.table).getStackInSlot(1) != null)) {
                ((TileResearchTable) data.table).consumeInkFromTable();
                ((TileResearchTable) data.table).consumepaperFromTable();
                data.addTotal("ALCHEMY", this.amt);
                data.addTotal(this.cat, 5);
            }
        }
        if ((data.table != null) && (((TileAdvancedResearchTable) data.table).getStackInSlot(0) != null) &&
                (((TileAdvancedResearchTable) data.table).getStackInSlot(0).getItemDamage() < ((TileAdvancedResearchTable) data.table).getStackInSlot(0).getMaxDamage()) &&
                (((TileAdvancedResearchTable) data.table).getStackInSlot(1) != null)) {
            ((TileAdvancedResearchTable) data.table).consumeInkFromTable();
            ((TileAdvancedResearchTable) data.table).consumepaperFromTable();
            data.addTotal("ALCHEMY", this.amt);
            data.addTotal(this.cat, 5);
        }
        return true;
    }

    @Override
    public String getResearchCategory() {
        return "ARTIFICE";
    }
}
