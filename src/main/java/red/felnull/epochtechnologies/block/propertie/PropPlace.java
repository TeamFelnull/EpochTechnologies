package red.felnull.epochtechnologies.block.propertie;

import net.minecraft.util.IStringSerializable;

public enum PropPlace implements IStringSerializable {
    UP("up"),//上
    MIDDLE("middle"),//真ん中
    UNDER("under");//下
    private final String name;

    private PropPlace(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    public String func_176610_l() {
        return this.name;
    }

}
