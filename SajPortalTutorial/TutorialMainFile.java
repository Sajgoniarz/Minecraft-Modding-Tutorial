package SajPortalTutorial;


import net.minecraft.src.Block;
import net.minecraftforge.common.DimensionManager;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "Saj_Tutorial_Portal", name = "Portal Tutorial", version = "1.0.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class TutorialMainFile 
{
	@SidedProxy(clientSide = "SajPortalTutorial.ClientProxy", serverSide = "SajPortalTutorial.CommonProxy")
	public static CommonProxy proxy;
	
	public static final Block PortalTutorial = new BlockPortalTutorial(1000, 0).setBlockName("Portal Tutorial").setResistance(60.0F).setBlockUnbreakable();
	public static final Block BlockTutorial = new BlockTutorial(1001,1).setBlockName("Block Tutorial").setHardness(0F);
	
	@Init
	public void load(FMLInitializationEvent event) 
	{
		GameRegistry.registerBlock(PortalTutorial);
		LanguageRegistry.addName(PortalTutorial, "I'm a Portal, who are U?");
		GameRegistry.registerBlock(BlockTutorial);
		LanguageRegistry.addName(BlockTutorial, "Put me inside Portal!");
		ClientProxy.RegisterRenderInformation();
	
	}
}
