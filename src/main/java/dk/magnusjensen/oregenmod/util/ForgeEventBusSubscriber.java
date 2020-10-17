package dk.magnusjensen.oregenmod.util;

import dk.magnusjensen.oregenmod.OreGenMod;
import dk.magnusjensen.oregenmod.world.gen.OreGeneration;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = OreGenMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ForgeEventBusSubscriber {

	@SubscribeEvent(priority = EventPriority.HIGH)
	public static void onBiomeLoading(BiomeLoadingEvent event) {
		if (event.getCategory() != Biome.Category.NETHER && event.getCategory() != Biome.Category.THEEND) {
			OreGeneration.initOverWorldFeatures();
			OreGeneration.generateOverworldOres(event);
		}
	}
}
