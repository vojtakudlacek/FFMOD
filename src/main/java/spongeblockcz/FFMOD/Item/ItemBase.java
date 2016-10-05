package spongeblockcz.FFMOD.Item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import spongeblockcz.FFMOD.FFMOD;

public class ItemBase extends Item implements ItemModelProvider{
 
 protected String name;
 
 public ItemBase(String name) {
 this.name = name;
 setUnlocalizedName(name);
 setRegistryName(name);
 //setCreativeTab(TutorialMod.creativeTab); //this is commented out, because we don't have our creative-tab yet.
 }
 
 @Override
 public void registerItemModel(Item item) {
 FFMOD.proxy.registerItemRenderer(this, 1, name);
 }
 
 @Override
 public ItemBase setCreativeTab(CreativeTabs tab) {
 super.setCreativeTab(tab);
 return this;
 }

}