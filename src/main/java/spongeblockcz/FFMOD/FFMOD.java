package spongeblockcz.FFMOD;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import spongeblockcz.FFMOD.Item.ModItems;
import spongeblockcz.FFMOD.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = FFMOD.MODID, version = FFMOD.VERSION)
public class FFMOD
{
	@SidedProxy(serverSide = "spongeblockcz.FFMOD.proxy.CommonProxy", clientSide = "spongeblockcz.FFMOD.proxy.ClientProxy")
    public static CommonProxy proxy;
	
	public static final String MODID = "ffmod";
    public static final String VERSION = "0.0.1";
    
    @Mod.Instance(MODID)
	public static FFMOD instance;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	ModItems.init();
    }
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	
    }
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}
