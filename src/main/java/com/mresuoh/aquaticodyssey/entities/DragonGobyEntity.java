package com.mresuoh.aquaticodyssey.entities;

import com.mresuoh.aquaticodyssey.init.ModEntityTypes;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.goal.PanicGoal;
import net.minecraft.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.entity.passive.fish.AbstractFishEntity;
import net.minecraft.item.AirItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class DragonGobyEntity extends AbstractFishEntity {

    public DragonGobyEntity(EntityType<DragonGobyEntity> type, World worldIn) {
        super (type, worldIn);
    }

    public DragonGobyEntity createChild(AgeableEntity ageable) {
        DragonGobyEntity entity = new DragonGobyEntity(ModEntityTypes.DRAGON_GOBY.get(), this.world);
        entity.onInitialSpawn(this.world, this.world.getDifficultyForLocation(new BlockPos(entity)),
                SpawnReason.BREEDING, (ILivingEntityData) null, (CompoundNBT) null);
        return entity;
    }

    @Override
    protected void registerAttributes() {
        super.registerAttributes();
        this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(5.0D);
        this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(1.0D);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(4, new SwimGoal(this));
        this.goalSelector.addGoal(0, new PanicGoal(this, 1.25D));
    }

    private static class SwimGoal extends RandomSwimmingGoal {
        private final DragonGobyEntity fish;

        public SwimGoal(DragonGobyEntity fish) {
            super(fish, 1.0D, 40);
            this.fish = fish;
        }
    }

    @Override
    protected ItemStack getFishBucket() {
        return ItemStack.EMPTY;
    }

    @Override
    protected SoundEvent getFlopSound() {
        return null;
    }

}
