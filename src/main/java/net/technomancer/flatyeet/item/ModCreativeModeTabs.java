package net.technomancer.flatyeet.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.technomancer.flatyeet.FlatYeet;
import net.technomancer.flatyeet.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FlatYeet.MOD_ID);

    public static final RegistryObject<CreativeModeTab> FLAT_YEET_TAB = CREATIVE_MODE_TABS.register("flat_yeet_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.HOGANETRINE.get()))
                    .title(Component.translatable("creativetab.flat_yeet_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        for(RegistryObject<Item> item : ModItems.ITEMS.getEntries()) {
                            pOutput.accept(item.get());
                        };
                        for(RegistryObject<Block> block : ModBlocks.BLOCKS.getEntries()) {
                            pOutput.accept(block.get());
                        };
                    })
                    .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
