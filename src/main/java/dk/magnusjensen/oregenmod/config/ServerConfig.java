package dk.magnusjensen.oregenmod.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ServerConfig {

	final ForgeConfigSpec.BooleanValue serverEnableAmethystOre;
	final ForgeConfigSpec.IntValue serverAmethystVeinSize;
	final ForgeConfigSpec.IntValue serverAmethystVeinCount;
	final ForgeConfigSpec.IntValue serverAmethystBottomHeight;
	final ForgeConfigSpec.IntValue serverAmethystMaxHeight;

	ServerConfig(ForgeConfigSpec.Builder builder) {
		builder.push("OreGen");
		this.serverEnableAmethystOre = builder.comment("Enable amethyst ore generation?").translation("swem.config.enableAmethystOre").define("EnableAmethystOre", true);
		this.serverAmethystVeinSize = builder.comment("Amethyst ore vein size").translation("swem:config.serverAmethystVeinSize").defineInRange("AmethystVeinSize", 8, 1, 2147483647);
		this.serverAmethystVeinCount = builder.comment("Amethyst ore vein count per chunk").translation("swem:config.serverAmethystVeinCount").defineInRange("AmethystVeinCount", 2, 1, 2147483647);
		this.serverAmethystBottomHeight = builder.comment("Amethyst ore minimum height").translation("swem:config.serverAmethystBottomHeight").defineInRange("AmethystBottomHeight", 0, 1, 2147483647);
		this.serverAmethystMaxHeight = builder.comment("Amethyst ore maximum height").translation("swem:config.serverAmethystMaxHeight").defineInRange("AmethystMaxHeight", 15, 1, 2147483647);
		builder.pop();
	}

}
