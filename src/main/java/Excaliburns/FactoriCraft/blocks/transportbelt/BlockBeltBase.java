package Excaliburns.FactoriCraft.blocks.transportbelt;

import com.google.common.collect.Lists;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRailBase;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

public abstract class BlockBeltBase extends Block{

    private static final AxisAlignedBB BOUNDING_BOX = new AxisAlignedBB(0, 0, 0, 1, 1* 0.0625, 1);

    protected BlockBeltBase() {
        super(Material.ROCK);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }


    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer(){
        return BlockRenderLayer.SOLID;
    }

    @Override
    public boolean isOpaqueCube(IBlockState iBlockState){
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState iBlockState){
        return false;
    }

    @Override
    public EnumBlockRenderType getRenderType(IBlockState iBlockState){
        return EnumBlockRenderType.MODEL;
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState iBlockstate, IBlockAccess worldIn, BlockPos pos){
        return BOUNDING_BOX;
    }

    @Override
    public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn, boolean isActualState) {
        super.addCollisionBoxToList(state, worldIn, pos, entityBox, collidingBoxes, entityIn, isActualState);
    }
    /*
        public static final PropertyDirection PROPERTYFACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);

        @Override
        public IBlockState getStateFromMeta(int meta){
            EnumFacing facing = EnumFacing.getHorizontal(meta);
            return this.getDefaultState().withProperty(PROPERTYFACING, facing);
        }

        @Override
        public int getMetaFromState(IBlockState state){
            EnumFacing facing = (EnumFacing)state.getValue(PROPERTYFACING);
            return facing.getHorizontalIndex();
        }

        @Override
        public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
            return state;
        }

        @Override
        protected BlockStateContainer createBlockState(){
            return new BlockStateContainer(this, new IProperty[] {PROPERTYFACING});
        }

        @Override
        public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing blockFaceClickedOn, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer){
            EnumFacing enumfacing = (placer == null) ? EnumFacing.NORTH : EnumFacing.fromAngle(placer.rotationYaw);
            return this.getDefaultState().withProperty(PROPERTYFACING, enumfacing);
        }
    */
    enum EnumBeltDirection implements IStringSerializable{
        // Ordered NSEW then left right for each cardinal
        // Formated FROM_TO
        NORTH_SOUTH(0, "north_south"),
        SOUTH_NORTH(1, "south_north"),
        EAST_WEST(2, "east_west"),
        WEST_EAST(3, "west_east"),

        NORTH_EAST(4, "north_east"),
        NORTH_WEST(5, "north_west"),

        SOUTH_WEST(6, "south_west"),
        SOUTH_EAST(7, "south_east"),

        EAST_SOUTH(8, "east_south"),
        EAST_NORTH(9, "east_north"),

        WEST_NORTH(10, "west_north"),
        WEST_SOUTH(11, "west_south"),

        NORTH_ASCENDING(12, "north_ascending"),
        SOUTH_ASCENDING(13, "south_ascending"),
        EAST_ASCENDING(14, "east_ascending"),
        WEST_ASCENDING(15, "west_ascending"),

        NORTH_DESCENDING(16, "north_descending"),
        SOUTH_DESCENDING(17, "south_descending"),
        EAST_DESCENDING(18, "east_descending"),
        WEST_DESCENDING(19, "west_descending");


        private static final EnumBeltDirection[] META_LOOKUP = new EnumBeltDirection[values().length];
        private final int meta;
        private final String name;

        public int getMetadata() { return this.meta; }

        public String toString() { return this.name; }

        public static EnumBeltDirection byMetadata(int meta){
            if (meta < 0 || meta >= META_LOOKUP.length){
                meta = 0;
            }

            return META_LOOKUP[meta];
        }

        private EnumBeltDirection(int meta, String name){
            this.meta = meta;
            this.name = name;
        }

        public String getName() { return this.name; }

        static {
            for (EnumBeltDirection enumbeltdirection : values())
                META_LOOKUP[enumbeltdirection.getMetadata()] = enumbeltdirection;
        }
    }
}
