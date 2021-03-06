package orangeVillager61.ImprovedVillagers;

import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import orangeVillager61.ImprovedVillagers.render.blocks.BlockRender;
import orangeVillager61.ImprovedVillagers.render.entities.IvVillagerRender;
import orangeVillager61.ImprovedVillagers.render.items.ItemRender;

public class ClientProxy extends CommonProxy{

	 @Override
	    public void preInit(FMLPreInitializationEvent e) {
	        super.preInit(e);
	        BlockRender.preInit();
	    }

	    @Override
	    public void init(FMLInitializationEvent e) {
	        super.init(e);
	        ItemRender.registerItemRenderer();
	        BlockRender.registerBlockRenderer();
	    }

	    @Override
	    public void postInit(FMLPostInitializationEvent e) {
	        super.postInit(e);
	    }
}
