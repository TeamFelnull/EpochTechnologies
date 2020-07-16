package red.felnull.epochtechnologies.storage;

import net.minecraft.fluid.Fluids;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.capability.templates.FluidTank;

public class BoilerFluidTank extends FluidTank {
    private int boilerTankNum;

    public BoilerFluidTank(int num, int capacity) {
        super(capacity);
        this.boilerTankNum = num;
    }

    public boolean isFluidValid(FluidStack stack) {

        if (boilerTankNum == 0) {
            if (stack.getFluid() == Fluids.WATER)
                return validator.test(stack);
        } else if (boilerTankNum == 1) {
            if (stack.getFluid() == Fluids.LAVA)
                return validator.test(stack);
        }

        return false;


    }
}
