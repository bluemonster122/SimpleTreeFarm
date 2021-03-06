package bluemonster122.simpletreefarm.gui;

import bluemonster122.simpletreefarm.container.ContainerTreeFarm;
import bluemonster122.simpletreefarm.tile.TreeFarmTile;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

    public static final int farm = 0;

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == farm) {
            return new ContainerTreeFarm(player, (TreeFarmTile) world.getTileEntity(new BlockPos(x, y, z)));
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == farm) {
            return new GuiTreeFarm(player, (TreeFarmTile) world.getTileEntity(new BlockPos(x, y, z)));
        }
        return null;
    }
}
