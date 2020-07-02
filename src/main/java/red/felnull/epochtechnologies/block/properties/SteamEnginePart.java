package red.felnull.epochtechnologies.block.properties;

import net.minecraft.util.IStringSerializable;

public enum SteamEnginePart implements IStringSerializable {
    PREVIOUS("previous"),//前
    REAR("rear");//後
    private final String name;

    private SteamEnginePart(String p_i49342_3_) {
        this.name = p_i49342_3_;
    }

    public String func_176610_l() {
        return this.name;
    }

}
