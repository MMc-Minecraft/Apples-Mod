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
                        pOutput.accept(ModItems.IRON_APPLE.get());
                        pOutput.accept(Items.ENCHANTED_GOLDEN_APPLE);
                        pOutput.accept(Items.GOLDEN_APPLE);
                        pOutput.accept(Items.APPLE);
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
