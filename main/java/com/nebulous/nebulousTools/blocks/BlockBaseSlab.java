package com.nebulous.nebulousTools.blocks;

import com.nebulous.nebulousTools.NebulousTools;
import com.nebulous.nebulousTools.items.ItemModelProvider;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public abstract class BlockBaseSlab extends BlockSlab implements ItemModelProvider{

	protected String name;
	
	private static final PropertyBool VARIANT = PropertyBool.create("variant");
	
	public BlockBaseSlab(Material material, String name) {
		super(material);
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		useNeighborBrightness = true;
		
		IBlockState blockState = this.blockState.getBaseState();
        blockState = blockState.withProperty(VARIANT, false);
        if (!this.isDouble()) {
            blockState = blockState.withProperty(HALF, EnumBlockHalf.BOTTOM);
        }

        setDefaultState(blockState);
	}
	
	@Override
	public final IBlockState getStateFromMeta(final int meta) {
		IBlockState blockState = this.getDefaultState();
	        blockState = blockState.withProperty(VARIANT, false);
	        if (!this.isDouble()) {
	            EnumBlockHalf value = EnumBlockHalf.BOTTOM;
	            if ((meta & 8) != 0) {
	                value = EnumBlockHalf.TOP;
	            }

	            blockState = blockState.withProperty(HALF, value);
	        }

		return blockState;
	}

	@Override
	public final int getMetaFromState(final IBlockState state) {
	        if (this.isDouble()) {
	           return 0;
	        }

	        if ((EnumBlockHalf) state.getValue(HALF) == EnumBlockHalf.TOP) {
	            return 8;
	        } else {
	            return 0;
	        }
	}

	@Override
	protected final BlockStateContainer createBlockState() {
	        if (this.isDouble()) {
	            return new BlockStateContainer(this, new IProperty[] {VARIANT});
	        } else {
	            return new BlockStateContainer(
	                this,
	                new IProperty[] {VARIANT, HALF});
	        }
	}

	@Override
	public void registerItemModel(Item item) {
		NebulousTools.proxy.registerItemRenderer(item, 0, name);
	}

	@Override
	public String getUnlocalizedName(int meta) {
		return name;
	}

	@Override
	public boolean isDouble() {
		return false;
	}

	@Override
	public IProperty<?> getVariantProperty() {
		return VARIANT;
	}

	@Override
	public Comparable<?> getTypeForItem(ItemStack stack) {
		return null;
	}
}
