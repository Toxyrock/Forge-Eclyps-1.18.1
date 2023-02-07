package net.toxyrock.eclypsmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab ECLYPS_TAB = new CreativeModeTab("eclypstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ERINITE.get());
        }
    };
}
