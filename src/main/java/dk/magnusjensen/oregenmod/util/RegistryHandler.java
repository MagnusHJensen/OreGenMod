package dk.magnusjensen.oregenmod.util;

import dk.magnusjensen.oregenmod.OreGenMod;
import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, OreGenMod.MOD_ID);

	public static void init(){
		BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}

	public static final RegistryObject<OreBlock> AMETHYST_ORE = BLOCKS.register("amethyst_ore", () -> new OreBlock(Block.Properties.create(Material.IRON)));

}
