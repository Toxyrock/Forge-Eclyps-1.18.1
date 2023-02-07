package net.toxyrock.eclypsmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.toxyrock.eclypsmod.EclypsMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EclypsMod.MOD_ID);

        public static final RegistryObject<Item> ERINITE = ITEMS.register("erinite",
                () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ECLYPS_TAB)));

        public static final RegistryObject<Item> CRYSTAL_ERINITE = ITEMS.register("crystal_erinite",
                () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ECLYPS_TAB)));



        public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
