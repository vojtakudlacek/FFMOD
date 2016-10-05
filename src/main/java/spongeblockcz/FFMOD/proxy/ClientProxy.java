package spongeblockcz.FFMOD.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import spongeblockcz.FFMOD.FFMOD;

public class ClientProxy extends CommonProxy {

 public void registerItemRenderer(Item item, int meta, String id) {
 ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation("ffmod" + ":" + id, "inventory"));
 }
}