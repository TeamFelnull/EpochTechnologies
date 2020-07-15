package red.felnull.epochtechnologies.block.propertie;

import net.minecraft.util.IStringSerializable;

public enum UpDownPlace implements IStringSerializable {
    UP("up"),//上
    UNDER("under");//下

    private final String name;

    private UpDownPlace(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    public String func_176610_l() {
        return this.name;
    }

}

