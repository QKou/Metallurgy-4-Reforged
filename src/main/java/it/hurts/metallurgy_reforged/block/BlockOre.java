/*
 * -------------------------------------------------------------------------------------------------------
 * Class: BlockOre
 * This class is part of Metallurgy 4 Reforged
 * Complete source code is available at: https://github.com/Davoleo/Metallurgy-4-Reforged
 * This code is licensed under GNU GPLv3
 * Authors: ItHurtsLikeHell & Davoleo
 * Copyright (c) 2020.
 * --------------------------------------------------------------------------------------------------------
 */

package it.hurts.metallurgy_reforged.block;

import it.hurts.metallurgy_reforged.config.GeneralConfig;
import it.hurts.metallurgy_reforged.data.Drop;
import it.hurts.metallurgy_reforged.material.MetalColors;
import it.hurts.metallurgy_reforged.particle.ParticleOre;
import it.hurts.metallurgy_reforged.util.BlockUtils;
import it.hurts.metallurgy_reforged.util.Constants;
import it.hurts.metallurgy_reforged.util.MetallurgyTabs;
import it.hurts.metallurgy_reforged.util.Utils;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class BlockOre extends Block {

	//Optional custom drops for blocks
	private List<Drop> customDrops;

	public BlockOre(String name, float hardness, int harvestLevel, float blastResistance)
	{
		super(Material.ROCK);
		setHarvestLevel(Constants.PICKAXE, harvestLevel);
		setResistance(blastResistance);

		BlockUtils.initBlock(this, name, MetallurgyTabs.tabOre, hardness, blastResistance, "p", harvestLevel);
		ModBlocks.oreBlocks.add(this);
	}

	/**
	 * @return A new ItemBlock of this block
	 */
	public Item createItemBlock()
	{
		return new ItemBlock(this).setRegistryName(Objects.requireNonNull(getRegistryName()));
	}

	public BlockOre setDrops(Drop... drops)
	{
		this.customDrops = Arrays.asList(drops);
		return this;
	}

	// VISUAL EFFECTS -----------------------------------------------------------

	@Override
	public int getLightValue(IBlockState state, IBlockAccess world, BlockPos pos)
	{
		if (GeneralConfig.enableOreLight)
		{
			return this.getHarvestLevel(state) >= 5 ? 5 : 0;
		}
		return 0;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand)
	{
		if (worldIn.isRemote && GeneralConfig.enableOreParticles)
		{
			spawnParticles(worldIn, pos, rand);
		}
	}

	@Override
	public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune)
	{
		if (customDrops == null)
			drops.add(new ItemStack(this));
		else
		{
			for (Drop drop : customDrops)
			{
				if (Math.random() <= drop.getChance())
					drops.add(new ItemStack(drop.getItemStack().getItem(), drop.getRandomAmount()));
			}
		}
	}

	/**
	 * Spawn Ore Block Particles
	 */
	@SideOnly(Side.CLIENT)
	private void spawnParticles(World worldIn, BlockPos pos, Random random)
	{
		double d0 = 0.0625D;
		String metalName = this.getRegistryName().getPath().replace("_ore", "");
		MetalColors color = MetalColors.byName(metalName.toUpperCase());
		if (color != null)
		{
			float[] colorComponents = color.getRGBValues();

			for (int i = 0; i < 6; ++i)
			{

				double d1 = (float) pos.getX() + random.nextFloat();
				double d2 = (float) pos.getY() + random.nextFloat();
				double d3 = (float) pos.getZ() + random.nextFloat();

				if (i == 0 && !worldIn.getBlockState(pos.up()).isOpaqueCube())
					d2 = (double) pos.getY() + d0 + 1.0D;

				if (i == 1 && !worldIn.getBlockState(pos.down()).isOpaqueCube())
					d2 = (double) pos.getY() - d0;

				if (i == 2 && !worldIn.getBlockState(pos.south()).isOpaqueCube())
					d3 = (double) pos.getZ() + d0 + 1.0D;

				if (i == 3 && !worldIn.getBlockState(pos.north()).isOpaqueCube())
					d3 = (double) pos.getZ() - d0;

				if (i == 4 && !worldIn.getBlockState(pos.east()).isOpaqueCube())
					d1 = (double) pos.getX() + d0 + 1.0D;

				if (i == 5 && !worldIn.getBlockState(pos.west()).isOpaqueCube())
					d1 = (double) pos.getX() - d0;

				if (d1 < (double) pos.getX() || d1 > (double) (pos.getX() + 1) || d2 < 0.0D || d2 > (double) (pos.getY() + 1) || d3 < (double) pos.getZ() || d3 > (double) (pos.getZ() + 1))
				{
					int harvestLevel = this.getHarvestLevel(this.getDefaultState());
					if (harvestLevel > 1)
						Minecraft.getMinecraft().effectRenderer.addEffect(new ParticleOre(worldIn, d1, d2, d3, 1.5F, colorComponents[0], colorComponents[1], colorComponents[2], harvestLevel - 2));
				}
			}
		}
	}

	@Override
	public boolean canDropFromExplosion(Explosion explosionIn)
	{
		return Utils.random.nextInt(4) > 0;
	}

}