package tr.com.mohamed.applesmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import tr.com.mohamed.applesmod.ApplesMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ApplesMod.MOD_ID);

    public static final RegistryObject<Item> WOOD_APPLE = ITEMS.register("woodapple",
            () -> new Item(new Item.Properties().food(ModFoods.WOOD_APPLE)));
    public static final RegistryObject<Item> IRON_APPLE = ITEMS.register("ironapple",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
