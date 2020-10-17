package dk.magnusjensen.oregenmod.world.gen;

import dk.magnusjensen.oregenmod.util.RegistryHandler;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class OreGeneration {

	public static ConfiguredFeature<?, ?> AMETHYST_ORE;

	public static void initOverWorldFeatures() {
		if (AMETHYST_ORE == null) {
			AMETHYST_ORE = OreGenUtils.buildOverWorldFeature(RegistryHandler.AMETHYST_ORE.get().getDefaultState());
		}
	}

	public static void generateOverworldOres(BiomeLoadingEvent event) {
		event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, AMETHYST_ORE);
	}
}
