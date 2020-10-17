package dk.magnusjensen.oregenmod.util;

import dk.magnusjensen.oregenmod.OreGenMod;
import dk.magnusjensen.oregenmod.config.ConfigHelper;
import dk.magnusjensen.oregenmod.config.ConfigHolder;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;

@Mod.EventBusSubscriber(modid = OreGenMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusSubscriber {

	@SubscribeEvent
	public static void onModConfigEvent(ModConfig.ModConfigEvent event) {
		ModConfig config = event.getConfig();
		if (config.getSpec() == ConfigHolder.SERVER_SPEC) {
			ConfigHelper.bakeServer(config);
		}
	}
}
