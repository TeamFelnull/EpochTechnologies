package red.felnull.epochtechnologies.client.gui.screen;

import net.minecraft.client.gui.ScreenManager;
import red.felnull.epochtechnologies.container.ETContainerTypes;

public class ETScrennContainerFactorys {
    public static void registerFactories() {
        ScreenManager.registerFactory(ETContainerTypes.STEAM_BOILER, SteamBoilerScreen::new);
    }
}
