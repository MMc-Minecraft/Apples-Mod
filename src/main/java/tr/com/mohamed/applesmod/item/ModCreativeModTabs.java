package tr.com.mohamed.applesmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import tr.com.mohamed.applesmod.ApplesMod;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ApplesMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> APPLES_TAB = CREATIVE_MODE_TABS.register("apples_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.WOOD_APPLE.get()))
                    .title(Component.translatable("creativetab.apples_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.WOOD_APPLE.get());
                        pOutput.accept(ModItems.WOOL_APPLE.get());
                        pOutput.accept(ModItems.WATER_APPLE.get());
                        pOutput.accept(ModItems.TNT_APPLE.get());
                        pOutput.accept(ModItems.STONE_APPLE.get());
                        pOutput.accept(ModItems.STARTS_APPLE.get());
                        pOutput.accept(ModItems.SPONGE_APPLE.get());
                        pOutput.accept(ModItems.SNOW_APPLE.get());
                        pOutput.accept(ModItems.SLIME_APPLE.get());
                        pOutput.accept(ModItems.SAND_APPLE.get());
                        pOutput.accept(ModItems.REDSTONE_APPLE.get());
                        pOutput.accept(ModItems.NETHERIET_APPLE.get());
                        pOutput.accept(ModItems.MILK_APPLE.get());
                        pOutput.accept(ModItems.LEAVES_APPLE.get());
                        pOutput.accept(ModItems.LEATHER_APPLE.get());
                        pOutput.accept(ModItems.LAVA_APPLE.get());
                        pOutput.accept(ModItems.LAPIS_APPLE.get());
                        pOutput.accept(ModItems.HONEY_APPLE.get());
                        pOutput.accept(ModItems.ENDER_APPLE.get());
                        pOutput.accept(ModItems.ENCHANTED_SPONGE_APPLE.get());
                        pOutput.accept(ModItems.EMERALD_APPLE.get());
                        pOutput.accept(ModItems.EGG_APPLE.get());
                        pOutput.accept(ModItems.DIRT_APPLE.get());
                        pOutput.accept(ModItems.COPPER_APPLE.get());
                        pOutput.accept(ModItems.COAL_APPLE.get());
                        pOutput.accept(ModItems.CAT_APPLE.get());

                        pOutput.accept(Items.ENCHANTED_GOLDEN_APPLE);
                        pOutput.accept(Items.GOLDEN_APPLE);
                        pOutput.accept(Items.APPLE);
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
