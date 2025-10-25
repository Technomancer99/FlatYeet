package net.technomancer.flatyeet.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.technomancer.flatyeet.FlatYeet;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FlatYeet.MOD_ID);

    //Adding Items
    public static final RegistryObject<Item> HOGANETRINE = ITEMS.register("hoganetrine",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HOGANETRINE_DUST = ITEMS.register("hoganetrine_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_KELLIUM = ITEMS.register("raw_kellium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KELLIUM_INGOT = ITEMS.register("kellium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KELLIUM_DUST = ITEMS.register("kellium_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> METAL_INGOT = ITEMS.register("metal_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> METAL_DUST = ITEMS.register("metal_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> METAL_PLATE = ITEMS.register("metal_plate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HELL_BLADE = ITEMS.register("hell_blade",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
