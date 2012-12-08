package SajPortalTutorial;

import net.minecraftforge.client.MinecraftForgeClient;

//Standard Forge Proxy file, We are using it to preload our texture file
public class ClientProxy extends CommonProxy
{
	public static void registerRenderInformation() 
	  {  
		MinecraftForgeClient.preloadTexture("/SajTut/terrain.png");
	  }
}