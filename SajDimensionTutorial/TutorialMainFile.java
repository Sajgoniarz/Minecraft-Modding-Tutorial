package SajDimensionTutorial;

import net.minecraftforge.common.DimensionManager;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = "Saj_Tutorial_Dimension", name = "Dimension Tutorial", version = "1.0.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class TutorialMainFile 
{
	@SidedProxy(clientSide = "SajDimensionTutorial.ClientProxy", serverSide = "SajDimensionTutorial.CommonProxy")
	public static CommonProxy proxy;
	
	@Init
	public void load(FMLInitializationEvent event) 
	{
		DimensionManager.registerProviderType(2, WorldProviderTutorial.class, true);
		// Registering our WorldProvider.class with ID of 2
		DimensionManager.registerDimension(2, 2);
		// Registering our new Dimension with ID 2 (first variable), and using our newly created World Provider
		// represented by its ID of 2
		ClientProxy.RegisterRenderInformation();
	
	}
}