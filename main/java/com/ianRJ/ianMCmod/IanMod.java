
package com.ianRJ.ianMCmod;

import java.lang.reflect.Constructor;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSlab;
import net.minecraft.item.ItemStack;
import net.minecraft.world.WorldType;
import net.minecraftforge.common.util.EnumHelper;























import com.ianRJ.ianMCmod.ArmorTools.ItemArmor2;
import com.ianRJ.ianMCmod.ArmorTools.ItemArmor3;
import com.ianRJ.ianMCmod.ArmorTools.ItemArmor4;
import com.ianRJ.ianMCmod.ArmorTools.ItemArmor5;
import com.ianRJ.ianMCmod.ArmorTools.ItemBowLB;
import com.ianRJ.ianMCmod.ArmorTools.ItemBowNB;
//import com.ianRJ.ianMCmod.BiomeAndGen.BiomeRegistry;
//import com.ianRJ.ianMCmod.BiomeAndGen.WorldTypeGOT;
import com.ianRJ.ianMCmod.baseStuff.ItemAxe1;
import com.ianRJ.ianMCmod.baseStuff.ItemAxe1;
import com.ianRJ.ianMCmod.baseStuff.ItemHoe1;
import com.ianRJ.ianMCmod.baseStuff.ItemPickaxe1;
import com.ianRJ.ianMCmod.baseStuff.ItemHoe1;
import com.ianRJ.ianMCmod.baseStuff.ItemPickaxe1;
import com.ianRJ.ianMCmod.baseStuff.ItemSpade1;
import com.ianRJ.ianMCmod.baseStuff.ItemSword1;
import com.ianRJ.ianMCmod.blocks.BlockCustomSlab;
import com.ianRJ.ianMCmod.blocks.BlockGoTBrick;
import com.ianRJ.ianMCmod.blocks.BlockGoTStone;
import com.ianRJ.ianMCmod.blocks.BlockGoTctL;
import com.ianRJ.ianMCmod.blocks.BlockGoTctS;
import com.ianRJ.ianMCmod.blocks.BlockNewItem;
import com.ianRJ.ianMCmod.blocks.GoTSB;
import com.ianRJ.ianMCmod.blocks.ItemBlockStoneSlab;
import com.ianRJ.ianMCmod.blocks.ItemNewBlock;
import com.ianRJ.ianMCmod.blocks.LimestoneBSlab;
import com.ianRJ.ianMCmod.mobStuffz.EntitySheep1;
import com.ianRJ.ianMCmod.slabs.BlockLimestoneCobbleSlab;
import com.ianRJ.ianMCmod.slabs.BlockSlabBase;
import com.ianRJ.ianMCmod.*;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "irjm", name = "Game of Thrones Mod", version = "Alpha 1")
public class IanMod {
	@SidedProxy(clientSide = "com.ianRJ.ianMCmod.ClientProxy", serverSide = "com.ianRJ.ianMCmod.ServerProxy")

	public static ServerProxy proxy;
	
	@Instance
	public static IanMod modInstance;
//BASE ITEMS
	


	
	
	public static Item itemNewBlock;
	public static Block blockNewItem;
	public static Item itemFood1;
	public static Item itemFood2;
	public static Item itemFood3;
	
	public static Block stair1;
	
	public static Item itemPickaxe1;
	public static Item itemSword1;
	public static Item itemAxe1;
	public static Item itemSpade1;
	public static Item itemHoe1;
	
	public static Item itemPickaxe2;
	public static Item itemSword2;
	public static Item itemAxe2;
	public static Item itemSpade2;
	public static Item itemHoe2;
	//basically here for copy paste
	
//GoT ITEMS
	
	//Ore
	public static Item itemWesterlandSteel;

	public static Item itemNorthernSteel;

	
	//CT
	public static Block blockStarkCT;
	public static Block blockLannisterCT;
	
	//Tools And Weapons
	public static Item itemWestlanderSword;
	public static Item itemNorthernSword;

	//Limestone
	public static Block blockLimestoneBrick;
		public static Block blockLimestoneBrickSR;
		public static BlockSlab blockLimestoneBrickSB;
		public static BlockSlab blockLimestoneBrickSB2;
	public static Block blockLimestoneBrickCA;
	public static Block blockLimestoneBrickM;
	public static Block blockLimestoneBrickF;
	public static Block blockLimestoneCobble;
		public static Block blockLimestoneCobbleSR;
		public static BlockCustomSlab blockLimestoneCobbleSB;
		public static BlockCustomSlab blockLimestoneCobbleSB2;
	public static Block blockLimestoneBrickCR;
	public static Block blockLimestoneBrickB;
	public static Block blockLimestone;
	
	//Northstone
	public static Block blockNorthStoneBrick;
		public static Block blockNorthStoneBrickSR;
		public static BlockSlab blockNorthStoneBrickSB;
		public static BlockSlab blockNorthStoneBrickSB2;
	public static Block blockNorthStoneBrickCA;
	public static Block blockNorthStoneBrickM;
	public static Block blockNorthStoneBrickF;
	public static Block blockNorthStoneCobble;
		public static BlockSlab blockNorthStoneCobbleSB;
		public static BlockSlab blockNorthStoneCobbleSB2;
		public static Block blockNorthStoneCobbleSR;
	public static Block blockNorthStoneBrickCR;
	public static Block blockNorthStoneBrickB;
	public static Block blockNorthStone;
//Armor
	//Stark
	public static Item starkHelmetR;
	public static Item starkChestplateR;
	public static Item starkLeggingsR;
	public static Item starkBootsR;
	
	public static Item starkHelmetP;
	public static Item starkChestplateP;
	public static Item starkLeggingsP;
	public static Item starkBootsP;
	//Lannister
	public static Item lannisterHelmetR;
	public static Item lannisterChestplateR;
	public static Item lannisterLeggingsR;
	public static Item lannisterBootsR;
	
	public static Item lannisterHelmetP;
	public static Item lannisterChestplateP;
	public static Item lannisterLeggingsP;
	public static Item lannisterBootsP;
	
	public static Item bowTest;
	public static Item bowTest2;
//Weapons
	//Stark
		
	//Lannister
//Materials
	//Base
	public static final Item.ToolMaterial ToolMaterial1 = EnumHelper.addToolMaterial("ToolMaterial1", 4, 1500, 9.0F, 2.5F, 3);
	public static final ItemArmor.ArmorMaterial ArmorMaterial1 = EnumHelper.addArmorMaterial("ArmorMaterial1", 2000, new int[]{2,7,5,3}, 30);
	//GoT
	public static final ItemArmor.ArmorMaterial ArmorMaterialPlated = EnumHelper.addArmorMaterial("PlatedMaterial", 200, new int[]{3,8,6,3}, 30);
	public static final ItemArmor.ArmorMaterial ArmorMaterialRegular = EnumHelper.addArmorMaterial("RegularMaterial", 200, new int[]{2,7,5,3}, 30);

	public static final Item.ToolMaterial GOTnorthern = EnumHelper.addToolMaterial("GOTnorthern", 4, 1500, 9.0F, 2.5F, 3);
	public static final Item.ToolMaterial GOTwesterland = EnumHelper.addToolMaterial("GOTwesterland", 4, 1500, 9.0F, 2.5F, 3);
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		//Item/block init and registering
		//config handling
		//BiomeRegistry.IanMod();		
//BASE Registry
	//Tools
		//stair1= new GOTStairs(stair1, 0);
		//GameRegistry.registerBlock(stair1, "stair1");
		EntitySheep1.mainRegistry();
		proxy.registerRenderThings();
		//GoTEntity.mainRegistry();
		
		
		
		bowTest = new ItemBowLB().setUnlocalizedName("lannisterBow").setCreativeTab(tabGoTWeapons);
		GameRegistry.registerItem(bowTest, bowTest.getUnlocalizedName().substring(5));
		
		bowTest2 = new ItemBowNB().setUnlocalizedName("starkBow").setCreativeTab(tabGoTWeapons);
		GameRegistry.registerItem(bowTest2, bowTest2.getUnlocalizedName().substring(5));
		
		itemPickaxe1 = new ItemPickaxe1(GOTnorthern).setUnlocalizedName("NorthernPickaxe").setTextureName("irjm:itemPickaxe1");
		GameRegistry.registerItem(itemPickaxe1, itemPickaxe1.getUnlocalizedName().substring(5));
		
		itemAxe1 = new ItemAxe1(GOTnorthern).setUnlocalizedName("NorthernAxe").setTextureName("irjm:itemAxe1");
		GameRegistry.registerItem(itemAxe1, itemAxe1.getUnlocalizedName().substring(5));
		
		itemSpade1 = new ItemSpade1(GOTnorthern).setUnlocalizedName("NorthernSpade").setTextureName("irjm:itemSpade1");
		GameRegistry.registerItem(itemSpade1, itemSpade1.getUnlocalizedName().substring(5));
		
		itemSword1 = new ItemSword1(GOTnorthern).setUnlocalizedName("NorthernSword").setTextureName("irjm:itemSword1").setCreativeTab(tabGoTWeapons);
		GameRegistry.registerItem(itemSword1, itemSword1.getUnlocalizedName().substring(5));
		
		itemHoe1 = new ItemHoe1(GOTnorthern).setUnlocalizedName("NorthernHoe").setTextureName("irjm:itemHoe");
		GameRegistry.registerItem(itemHoe1, itemHoe1.getUnlocalizedName().substring(5));
		
		
		itemPickaxe2 = new ItemPickaxe1(GOTwesterland).setUnlocalizedName("WesterlandPickaxe").setTextureName("irjm:itemPickaxe2");
		GameRegistry.registerItem(itemPickaxe2, itemPickaxe2.getUnlocalizedName().substring(5));
		
		itemAxe2 = new ItemAxe1(GOTwesterland).setUnlocalizedName("WesterlandAxe").setTextureName("irjm:itemAxe2");
		GameRegistry.registerItem(itemAxe2, itemAxe2.getUnlocalizedName().substring(5));
		
		itemSpade2 = new ItemSpade1(GOTwesterland).setUnlocalizedName("WesterlandSpade").setTextureName("irjm:itemSpade2");
		GameRegistry.registerItem(itemSpade2, itemSpade2.getUnlocalizedName().substring(5));
		
		itemSword2 = new ItemSword1(GOTwesterland).setUnlocalizedName("WesterlandSword").setTextureName("irjm:itemSword2").setCreativeTab(tabGoTWeapons);
		GameRegistry.registerItem(itemSword2, itemSword2.getUnlocalizedName().substring(5));
		
		itemHoe2 = new ItemHoe1(GOTwesterland).setUnlocalizedName("WesterlandHoe").setTextureName("irjm:itemHoe2");
		GameRegistry.registerItem(itemHoe2, itemHoe2.getUnlocalizedName().substring(5));
	//Blocks
		blockNewItem = new BlockNewItem(Material.rock).setBlockName("BlockNewItem").setBlockTextureName("irjm:blockNewItem");
		GameRegistry.registerBlock(blockNewItem, blockNewItem.getUnlocalizedName().substring(5));
	//Items
		itemNewBlock = new ItemNewBlock().setUnlocalizedName("ItemNewBlock").setTextureName("irjm:itemNewBlock");
		GameRegistry.registerItem(itemNewBlock, itemNewBlock.getUnlocalizedName().substring(5));
		
		itemFood1 = new ItemFood(12, 0.6F, true).setUnlocalizedName("Muffin").setTextureName("irjm:itemMuffinBatter");
		GameRegistry.registerItem(itemFood1, itemFood1.getUnlocalizedName().substring(5));
		
		itemFood2 = new ItemFood(5, 1.0F, false).setUnlocalizedName("BurntMuffin").setTextureName("irjm:itemFood1");
		GameRegistry.registerItem(itemFood2, itemFood2.getUnlocalizedName().substring(5));
	//Smelting
		GameRegistry.addSmelting(itemFood1, new ItemStack(itemFood1), 10.0f);
		
//GoT Registry
	
	//Lannister Plated
		
		lannisterHelmetP = new ItemArmor2(ArmorMaterialPlated, 0, 0).setUnlocalizedName("LannisterPlatedHelmet").setTextureName("irjm:platedLHelmet").setCreativeTab(tabGoTArmor);
		GameRegistry.registerItem(lannisterHelmetP, lannisterHelmetP.getUnlocalizedName().substring(5));
				
		lannisterChestplateP = new ItemArmor2(ArmorMaterialPlated, 0, 1).setUnlocalizedName("LannisterPlatedChestplate").setTextureName("irjm:platedLChestplate").setCreativeTab(tabGoTArmor);
		GameRegistry.registerItem(lannisterChestplateP, lannisterChestplateP.getUnlocalizedName().substring(5));
		
		lannisterLeggingsP = new ItemArmor2(ArmorMaterialPlated, 0, 2).setUnlocalizedName("LannisterPlatedLeggings").setTextureName("irjm:platedLLeggings").setCreativeTab(tabGoTArmor);
		GameRegistry.registerItem(lannisterLeggingsP, lannisterLeggingsP.getUnlocalizedName().substring(5));
				
		lannisterBootsP = new ItemArmor2(ArmorMaterialPlated, 0, 3).setUnlocalizedName("LannisterPlatedBoots").setTextureName("irjm:platedLBoots").setCreativeTab(tabGoTArmor);
		GameRegistry.registerItem(lannisterBootsP, lannisterBootsP.getUnlocalizedName().substring(5));
	
	//Lannister Regular
		
		lannisterHelmetR = new ItemArmor3(ArmorMaterialRegular, 0, 0).setUnlocalizedName("LannisterRegularHelmet").setTextureName("irjm:regularLHelmet").setCreativeTab(tabGoTArmor);
		GameRegistry.registerItem(lannisterHelmetR, lannisterHelmetR.getUnlocalizedName().substring(5));
				
		lannisterChestplateR = new ItemArmor3(ArmorMaterialRegular, 0, 1).setUnlocalizedName("LannisterRegularChestplate").setTextureName("irjm:regularLChestplate").setCreativeTab(tabGoTArmor);
		GameRegistry.registerItem(lannisterChestplateR, lannisterChestplateR.getUnlocalizedName().substring(5));
				
		lannisterLeggingsR = new ItemArmor3(ArmorMaterialRegular, 0, 2).setUnlocalizedName("LannisterRegularLeggings").setTextureName("irjm:regularLLeggings").setCreativeTab(tabGoTArmor);
		GameRegistry.registerItem(lannisterLeggingsR, lannisterLeggingsR.getUnlocalizedName().substring(5));
				
		lannisterBootsR = new ItemArmor3(ArmorMaterialRegular, 0, 3).setUnlocalizedName("LannisterRegularBoots").setTextureName("irjm:regularLBoots").setCreativeTab(tabGoTArmor);
		GameRegistry.registerItem(lannisterBootsR, lannisterBootsR.getUnlocalizedName().substring(5));
	
	//Stark Plated
		
		starkHelmetP = new ItemArmor4(ArmorMaterialPlated, 0, 0).setUnlocalizedName("StarkPlatedHelmet").setTextureName("irjm:platedSHelmet").setCreativeTab(tabGoTArmor);
		GameRegistry.registerItem(starkHelmetP, starkHelmetP.getUnlocalizedName().substring(5));
				
		starkChestplateP = new ItemArmor4(ArmorMaterialPlated, 0, 1).setUnlocalizedName("StarkPlatedChestplate").setTextureName("irjm:platedSChestplate").setCreativeTab(tabGoTArmor);
		GameRegistry.registerItem(starkChestplateP, starkChestplateP.getUnlocalizedName().substring(5));
				
		starkLeggingsP = new ItemArmor4(ArmorMaterialPlated, 0, 2).setUnlocalizedName("StarkPlatedLeggings").setTextureName("irjm:platedSLeggings").setCreativeTab(tabGoTArmor);
		GameRegistry.registerItem(starkLeggingsP, starkLeggingsP.getUnlocalizedName().substring(5));
				
		starkBootsP = new ItemArmor4(ArmorMaterialPlated, 0, 3).setUnlocalizedName("StarkPlatedBoots").setTextureName("irjm:platedSBoots").setCreativeTab(tabGoTArmor);
		GameRegistry.registerItem(starkBootsP, starkBootsP.getUnlocalizedName().substring(5));		
	
	//Stark Regular
	 
		starkHelmetR = new ItemArmor5(ArmorMaterialRegular, 0, 0).setUnlocalizedName("StarkRegularHelmet").setTextureName("irjm:regularSHelmet").setCreativeTab(tabGoTArmor);
		GameRegistry.registerItem(starkHelmetR, starkHelmetR.getUnlocalizedName().substring(5));
				
		starkChestplateR = new ItemArmor5(ArmorMaterialRegular, 0, 1).setUnlocalizedName("StarkRegularChestplate").setTextureName("irjm:regularSChestplate").setCreativeTab(tabGoTArmor);
		GameRegistry.registerItem(starkChestplateR, starkChestplateR.getUnlocalizedName().substring(5));
				
		starkLeggingsR = new ItemArmor5(ArmorMaterialRegular, 0, 2).setUnlocalizedName("StarkRegularLeggings").setTextureName("irjm:regularSLeggings").setCreativeTab(tabGoTArmor);
		GameRegistry.registerItem(starkLeggingsR, starkLeggingsR.getUnlocalizedName().substring(5));
				
		starkBootsR = new ItemArmor5(ArmorMaterialRegular, 0, 3).setUnlocalizedName("StarkRegularBoots").setTextureName("irjm:regularSBoots").setCreativeTab(tabGoTArmor);
		GameRegistry.registerItem(starkBootsR, starkBootsR.getUnlocalizedName().substring(5));
	
	//Limestone
		
		blockLimestone = new BlockGoTStone(Material.rock).setBlockName("Limestone").setBlockTextureName("irjm:limestone").setCreativeTab(tabGoTblocks);
		GameRegistry.registerBlock(blockLimestone, blockLimestone.getUnlocalizedName().substring(5));
		
		blockLimestoneBrick = new BlockGoTBrick(Material.rock).setBlockName("LimestoneBrick").setBlockTextureName("irjm:limestoneB").setCreativeTab(tabGoTblocks);
		GameRegistry.registerBlock(blockLimestoneBrick, blockLimestoneBrick.getUnlocalizedName().substring(5));
		
		blockLimestoneBrickM = new BlockGoTBrick(Material.rock).setBlockName("LimestoneBrickM").setBlockTextureName("irjm:limestoneBmossy").setCreativeTab(tabGoTblocks);
		GameRegistry.registerBlock(blockLimestoneBrickM, blockLimestoneBrickM.getUnlocalizedName().substring(5));
		
		blockLimestoneBrickB = new BlockGoTBrick(Material.rock).setBlockName("LimestoneBrickB").setBlockTextureName("irjm:limestoneBburnt").setCreativeTab(tabGoTblocks);
		GameRegistry.registerBlock(blockLimestoneBrickB, blockLimestoneBrickB.getUnlocalizedName().substring(5));
		
		blockLimestoneBrickCR = new BlockGoTBrick(Material.rock).setBlockName("LimestoneBrickCR").setBlockTextureName("irjm:limestoneBcracked").setCreativeTab(tabGoTblocks);
		GameRegistry.registerBlock(blockLimestoneBrickCR, blockLimestoneBrickCR.getUnlocalizedName().substring(5));
		
		blockLimestoneBrickCA = new BlockGoTBrick(Material.rock).setBlockName("LimestoneBrickCA").setBlockTextureName("irjm:limestoneBcarved").setCreativeTab(tabGoTblocks);
		GameRegistry.registerBlock(blockLimestoneBrickCA, blockLimestoneBrickCA.getUnlocalizedName().substring(5));
		
		blockLimestoneBrickF = new BlockGoTBrick(Material.rock).setBlockName("LimestoneBrickF").setBlockTextureName("irjm:limestoneBfrozen").setCreativeTab(tabGoTblocks);
		GameRegistry.registerBlock(blockLimestoneBrickF, blockLimestoneBrickF.getUnlocalizedName().substring(5));
		
		itemFood3 = new ItemFood(5, 1.0F, false).setUnlocalizedName("ItemBlueberry").setTextureName("irjm:itemBlueberry").setCreativeTab(tabGoTFood);
		GameRegistry.registerItem(itemFood3, itemFood3.getUnlocalizedName().substring(5));

		
		//blockLimestoneBrickSB = new LimestoneBSlab(false);
		//GameRegistry.registerBlock(blockLimestoneBrickSB, GoTSB.class, "blockLimestoneBrickSB");
		//blockLimestoneBrickSB2 = new LimestoneBSlab(true);
		//GameRegistry.registerBlock(blockLimestoneBrickSB2, GoTSB.class, "blockLimestoneBrickSB2");
		
		blockLimestoneCobbleSB = new BlockCustomSlab(false, Material.rock);
		GameRegistry.registerBlock(blockLimestoneCobbleSB, ItemBlockStoneSlab.class, "blockLimestoneCobbleSB");
		blockLimestoneCobbleSB2 = new BlockCustomSlab(true, Material.rock);
		GameRegistry.registerBlock(blockLimestoneCobbleSB2, ItemBlockStoneSlab.class, "blockLimestoneCobbleSB2");
	

		
		
		blockLimestoneCobble = new BlockGoTStone(Material.rock).setBlockName("LimestoneCobble").setBlockTextureName("irjm:limestoneCobble").setCreativeTab(tabGoTblocks);
		GameRegistry.registerBlock(blockLimestoneCobble, blockLimestoneCobble.getUnlocalizedName().substring(5));
	//Crafting Tables
		blockLannisterCT = new BlockGoTctL(Material.wood).setBlockName("LannisterCT").setCreativeTab(tabGoTblocks);
		GameRegistry.registerBlock(blockLannisterCT, blockLannisterCT.getUnlocalizedName().substring(5));
		
		blockStarkCT = new BlockGoTctS(Material.wood).setBlockName("StarkCT").setCreativeTab(tabGoTblocks);
		GameRegistry.registerBlock(blockStarkCT, blockStarkCT.getUnlocalizedName().substring(5));
		
		
	//NorthStone
		
		blockNorthStone = new BlockGoTStone(Material.rock).setBlockName("NorthStone").setBlockTextureName("irjm:NorthStone").setCreativeTab(tabGoTblocks);
		GameRegistry.registerBlock(blockNorthStone, blockNorthStone.getUnlocalizedName().substring(5));
		
		blockNorthStoneBrick = new BlockGoTBrick(Material.rock).setBlockName("NorthStoneBrick").setBlockTextureName("irjm:NorthStoneB").setCreativeTab(tabGoTblocks);
		GameRegistry.registerBlock(blockNorthStoneBrick, blockNorthStoneBrick.getUnlocalizedName().substring(5));
		
		blockNorthStoneBrickM = new BlockGoTBrick(Material.rock).setBlockName("NorthStoneBrickM").setBlockTextureName("irjm:NorthStoneBmossy").setCreativeTab(tabGoTblocks);
		GameRegistry.registerBlock(blockNorthStoneBrickM, blockNorthStoneBrickM.getUnlocalizedName().substring(5));
		
		blockNorthStoneBrickCR = new BlockGoTBrick(Material.rock).setBlockName("NorthStoneBrickCR").setBlockTextureName("irjm:NorthStoneBcracked").setCreativeTab(tabGoTblocks);
		GameRegistry.registerBlock(blockNorthStoneBrickCR, blockNorthStoneBrickCR.getUnlocalizedName().substring(5));
		
		blockNorthStoneBrickCA = new BlockGoTBrick(Material.rock).setBlockName("NorthStoneBrickCA").setBlockTextureName("irjm:NorthStoneBcarved").setCreativeTab(tabGoTblocks);
		GameRegistry.registerBlock(blockNorthStoneBrickCA, blockNorthStoneBrickCA.getUnlocalizedName().substring(5));
		
		blockNorthStoneBrickF = new BlockGoTBrick(Material.rock).setBlockName("NorthStoneBrickF").setBlockTextureName("irjm:NorthStoneBfrozen").setCreativeTab(tabGoTblocks);
		GameRegistry.registerBlock(blockNorthStoneBrickF, blockNorthStoneBrickF.getUnlocalizedName().substring(5));
		
		blockNorthStoneBrickB = new BlockGoTBrick(Material.rock).setBlockName("NorthStoneBrickB").setBlockTextureName("irjm:NorthStoneBburnt").setCreativeTab(tabGoTblocks);
		GameRegistry.registerBlock(blockNorthStoneBrickB, blockNorthStoneBrickB.getUnlocalizedName().substring(5));
		
		
		/*blockNorthStoneBrickSB = (BlockSlab) new (false).setBlockName("NorthStoneBrickSlab");
		GameRegistry.registerBlock(blockNorthStoneBrickSB, blockNorthStoneBrickSB.getUnlocalizedName().substring(5));
		blockNorthStoneBrickSB2 = (BlockSlab) new SlabNorthStone(true).setBlockName("NorthStoneCobbleSlab");
		GameRegistry.registerBlock(blockNorthStoneCobbleSB2, blockNorthStoneCobbleSB2.getUnlocalizedName().substring(5));
		
		blockNorthStoneBrickSR = new BlockGoTSlab(Material.rock).setBlockName("NorthStoneBrickStair").setBlockTextureName("irjm:NorthStonebrickstair").setCreativeTab(tabGoTblocks);
		GameRegistry.registerBlock(blockNorthStoneBrickSR, blockNorthStoneBrickSR.getUnlocalizedName().substring(5));
		blockNorthStoneCobbleSR = new BlockGoTStair(Material.rock).setBlockName("NorthStoneCobbleStair").setBlockTextureName("irjm:NorthStonecobblestair").setCreativeTab(tabGoTblocks);
		GameRegistry.registerBlock(blockNorthStoneCobbleSR, blockNorthStoneCobbleSR.getUnlocalizedName().substring(5));
	*/
		
		blockNorthStoneCobble = new BlockGoTStone(Material.rock).setBlockName("NorthStoneCobble").setBlockTextureName("irjm:NorthStoneCobble").setCreativeTab(tabGoTblocks);
		GameRegistry.registerBlock(blockNorthStoneCobble, blockNorthStoneCobble.getUnlocalizedName().substring(5));
	//tools n' shit		
		itemNorthernSteel = new ItemNewBlock().setUnlocalizedName("NorthernSteel").setTextureName("irjm:northernsteel").setCreativeTab(tabGoTMaterials);
		GameRegistry.registerItem(itemNorthernSteel, itemNorthernSteel.getUnlocalizedName().substring(5));
		
		itemWesterlandSteel = new ItemNewBlock().setUnlocalizedName("WesterlandSteel").setTextureName("irjm:westerlandsteel").setCreativeTab(tabGoTMaterials);
		GameRegistry.registerItem(itemWesterlandSteel, itemWesterlandSteel.getUnlocalizedName().substring(5));
		
		
		}
	@EventHandler
	public void init(FMLInitializationEvent event){
	//BASE Crafting Recipes
		GameRegistry.addRecipe(new ItemStack(itemAxe1), new Object[]{"NN ","NS "," S ", 'S', Items.stick, 'N', Items.string});
		GameRegistry.addRecipe(new ItemStack(itemAxe1), new Object[]{" NN"," SN"," S ", 'S', Items.stick, 'N', Items.string});
		GameRegistry.addRecipe(new ItemStack(itemSword1), new Object[]{" N "," N "," S ", 'S', Items.stick, 'N', Items.string});
		GameRegistry.addRecipe(new ItemStack(itemSpade1), new Object[]{" N "," S "," S ", 'S', Items.stick, 'N', Items.string});
		GameRegistry.addRecipe(new ItemStack(itemPickaxe1), new Object[]{"NNN"," S "," S ", 'S', Items.stick, 'N', Items.string});
		GameRegistry.addRecipe(new ItemStack(itemHoe1), new Object[]{"NN "," S "," S ", 'S', Items.stick, 'N', Items.string});
		GameRegistry.addRecipe(new ItemStack(itemHoe1), new Object[]{" NN"," S "," S ", 'S', Items.stick, 'N', Items.string});
		

	
	//GoT Crafting Recipes
		GameRegistry.addRecipe(new ItemStack(starkHelmetR), new Object[]{"PPP","L L","   ", 'P', itemNorthernSteel, 'L', Items.leather});
		GameRegistry.addRecipe(new ItemStack(starkChestplateR), new Object[]{"P P","LLL","PPP", 'P', itemNorthernSteel, 'L', Items.leather});
		GameRegistry.addRecipe(new ItemStack(starkLeggingsR), new Object[]{"PLP","L L","P P", 'P', itemNorthernSteel, 'L', Items.leather});		
		GameRegistry.addRecipe(new ItemStack(starkBootsR), new Object[]{"L L","P P","   ", 'P', itemNorthernSteel, 'L', Items.leather});
		GameRegistry.addRecipe(new ItemStack(starkBootsR), new Object[]{"   ","L L","P P", 'P', itemNorthernSteel, 'L', Items.leather});
		GameRegistry.addRecipe(new ItemStack(starkHelmetR), new Object[]{"   ","PPP","L L", 'P', itemNorthernSteel, 'L', Items.leather});
		
		GameRegistry.addRecipe(new ItemStack(lannisterHelmetR), new Object[]{"PPP","L L","   ", 'P', itemNorthernSteel, 'L', Items.leather});
		GameRegistry.addRecipe(new ItemStack(lannisterChestplateR), new Object[]{"P P","LLL","PPP", 'P', itemNorthernSteel, 'L', Items.leather});
		GameRegistry.addRecipe(new ItemStack(lannisterLeggingsR), new Object[]{"PLP","L L","P P", 'P', itemNorthernSteel, 'L', Items.leather});		
		GameRegistry.addRecipe(new ItemStack(lannisterBootsR), new Object[]{"L L","P P","   ", 'P', itemNorthernSteel, 'L', Items.leather});
		GameRegistry.addRecipe(new ItemStack(lannisterBootsR), new Object[]{"   ","L L","P P", 'P', itemNorthernSteel, 'L', Items.leather});
		GameRegistry.addRecipe(new ItemStack(lannisterHelmetR), new Object[]{"   ","PPP","L L", 'P', itemNorthernSteel, 'L', Items.leather});
		

	
		
		
		GameRegistry.addRecipe(new ItemStack(starkHelmetP), new Object[]{"PPP","P P","   ", 'P', itemNorthernSteel});
		GameRegistry.addRecipe(new ItemStack(starkChestplateP), new Object[]{"P P","PPP","PPP", 'P', itemNorthernSteel});
		GameRegistry.addRecipe(new ItemStack(starkLeggingsP), new Object[]{"PPP","P P","P P", 'P', itemNorthernSteel});		
		GameRegistry.addRecipe(new ItemStack(starkBootsP), new Object[]{"P P","P P","   ", 'P', itemNorthernSteel});
		GameRegistry.addRecipe(new ItemStack(starkBootsP), new Object[]{"   ","P P","P P", 'P', itemNorthernSteel});
		GameRegistry.addRecipe(new ItemStack(starkHelmetP), new Object[]{"   ","PPP","P P", 'P', itemNorthernSteel});
		
		GameRegistry.addRecipe(new ItemStack(lannisterHelmetP), new Object[]{"PPP","P P","   ", 'P', itemWesterlandSteel});
		GameRegistry.addRecipe(new ItemStack(lannisterChestplateP), new Object[]{"P P","PPP","PPP", 'P', itemWesterlandSteel});
		GameRegistry.addRecipe(new ItemStack(lannisterLeggingsP), new Object[]{"PPP","P P","P P", 'P', itemWesterlandSteel});		
		GameRegistry.addRecipe(new ItemStack(lannisterBootsP), new Object[]{"P P","P P","   ", 'P', itemWesterlandSteel});
		GameRegistry.addRecipe(new ItemStack(lannisterBootsP), new Object[]{"   ","P P","P P", 'P', itemWesterlandSteel});
		GameRegistry.addRecipe(new ItemStack(lannisterHelmetP), new Object[]{"   ","PPP","P P", 'P', itemWesterlandSteel});
	
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	 //WorldType GOT = new WorldTypeGOT(3, "Game of Thrones");
	 
	

		//list of blocks from every mod
	}
	public static CreativeTabs tabGoTblocks = new CreativeTabs("tabGoTblocks"){
		@Override
		public Item getTabIconItem(){
			return new ItemStack(blockLannisterCT).getItem();		
		}
	};
	public static CreativeTabs tabGoTArmor= new CreativeTabs("tabGoTArmor"){
		@Override
		public Item getTabIconItem(){
			return new ItemStack(lannisterHelmetP).getItem();
		}
	};
	public static CreativeTabs tabGoTMaterials= new CreativeTabs("tabGoTMaterials"){
		@Override
		public Item getTabIconItem(){
			return new ItemStack(itemNorthernSteel).getItem();
		}
	};
	public static CreativeTabs tabGoTWeapons= new CreativeTabs("tabGoTWeapons"){
		@Override
		public Item getTabIconItem(){
			return new ItemStack(itemSword2).getItem();
		}
	};
	public static CreativeTabs tabGoTFood= new CreativeTabs("tabGoTFood"){
		@Override
		public Item getTabIconItem(){
			return new ItemStack(itemFood3).getItem();
		}
	};
	//causes an order to the loading of the mods so PreInit then init then post
}

