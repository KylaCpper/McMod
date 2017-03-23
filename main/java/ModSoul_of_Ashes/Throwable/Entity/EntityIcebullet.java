package ModSoul_of_Ashes.Throwable.Entity;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.projectile.EntityThrowable;import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityIcebullet extends EntityThrowable{

	public EntityIcebullet(World worldIn){
	    super(worldIn);
	}

	public EntityIcebullet(World worldIn, EntityLivingBase throwerIn){
	    super(worldIn, throwerIn);
	}

	public EntityIcebullet(World worldIn, double x, double y, double z){
	    super(worldIn, x, y, z);
	}

    protected void onImpact(RayTraceResult result){

    }
}
