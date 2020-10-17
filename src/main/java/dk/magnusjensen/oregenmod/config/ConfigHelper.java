package dk.magnusjensen.oregenmod.config;

import dk.magnusjensen.oregenmod.world.gen.OreGeneration;
import net.minecraft.world.gen.feature.DecoratedFeatureConfig;
import net.minecraft.world.gen.feature.FeatureSpreadConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.DecoratedPlacementConfig;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.fml.config.ModConfig;

public class ConfigHelper {

	public static void bakeServer(final ModConfig config) {

		// Vein Size
		((OreFeatureConfig)((DecoratedFeatureConfig)((DecoratedFeatureConfig) OreGeneration.AMETHYST_ORE.config).feature.get().config).feature.get().config).size = ConfigHolder.SERVER.serverAmethystVeinSize.get();
		// Vein Count
		((FeatureSpreadConfig)((DecoratedFeatureConfig) OreGeneration.AMETHYST_ORE.config).decorator.config).func_242799_a().field_242250_b = ConfigHolder.SERVER.serverAmethystVeinCount.get();
		// Minimum Height the ore can spawn
		((TopSolidRangeConfig)((DecoratedPlacementConfig)((DecoratedFeatureConfig)((DecoratedFeatureConfig) OreGeneration.AMETHYST_ORE.config).feature.get().config).decorator.config).field_242885_d.config).field_242813_c = ConfigHolder.SERVER.serverAmethystBottomHeight.get();
		// Maximum Height the ore can spawn.
		((TopSolidRangeConfig)((DecoratedPlacementConfig)((DecoratedFeatureConfig)((DecoratedFeatureConfig) OreGeneration.AMETHYST_ORE.config).feature.get().config).decorator.config).field_242885_d.config).field_242815_e = ConfigHolder.SERVER.serverAmethystMaxHeight.get();
	}
}
