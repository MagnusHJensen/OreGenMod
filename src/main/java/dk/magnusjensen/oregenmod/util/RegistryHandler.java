package dk.magnusjensen.oregenmod.util;

import dk.magnusjensen.oregenmod.OreGenMod;
import net.minecraft.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, OreGenMod.MOD_ID);

}
