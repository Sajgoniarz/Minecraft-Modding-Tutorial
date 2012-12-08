package SajPortalTutorial;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;
import net.minecraft.src.World;

public class BlockTutorial extends Block
{
    public BlockTutorial(int par1, int par2)
    {
        super(par1, par2, Material.rock);
        setCreativeTab(CreativeTabs.tabBlock);
  
    }

    public void onBlockAdded(World par1World, int par2, int par3, int par4)
    {

        if (par1World.getBlockId(par2, par3 - 1, par4) != Block.sandStone.blockID || !BlockPortalTutorial.tryToCreatePortal(par1World, par2, par3, par4))
        {
            if (par3 - 1 != Block.sandStone.blockID)
            {
                par1World.setBlockWithNotify(par2, par3, par4, 0);

            }
            else
            {
                par1World.scheduleBlockUpdate(par2, par3, par4, this.blockID, this.tickRate() + par1World.rand.nextInt(10));

            }
        }
    }
    
    public String getTextureFile()
	{
		return "/SajTut/terrain.png";
	}

    
  
}

