package red.felnull.epochtechnologies.block.propertie;

import net.minecraft.state.EnumProperty;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.properties.BlockStateProperties;

public class ETBlockStateProperties {
    public static final EnumProperty<PropPlace> PROP_PLACE = EnumProperty.create("place", PropPlace.class);
}
