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
    public static final RegistryObject<Item> CAT_APPLE = ITEMS.register("catapple",
            () -> new Item(new Item.Properties().food(ModFoods.CAT_APPLE)));
    public static final RegistryObject<Item> BONES_APPLE = ITEMS.register("bonesapple",
            () -> new Item(new Item.Properties().food(ModFoods.BONES_APPLE)));
    public static final RegistryObject<Item> COAL_APPLE = ITEMS.register("coalapple",
            () -> new Item(new Item.Properties().food(ModFoods.COAL_APPLE)));
    public static final RegistryObject<Item> COPPER_APPLE = ITEMS.register("copperapple",
            () -> new Item(new Item.Properties().food(ModFoods.COPPER_APPLE)));
    public static final RegistryObject<Item> DIAMOND_APPLE = ITEMS.register("diamondapple",
            () -> new Item(new Item.Properties().food(ModFoods.DIAMOND_APPLE)));
    public static final RegistryObject<Item> IRON_APPLE = ITEMS.register("ironapple",
            () -> new Item(new Item.Properties().food(ModFoods.IRON_APPLE)));
    public static final RegistryObject<Item> EMERALD_APPLE = ITEMS.register("emeraldapple",
            () -> new Item(new Item.Properties().food(ModFoods.EMERALD_APPLE)));
    public static final RegistryObject<Item> LAPIS_APPLE = ITEMS.register("lapisapple",
            () -> new Item(new Item.Properties().food(ModFoods.LAPIS_APPLE)));
    public static final RegistryObject<Item> LEATHER_APPLE = ITEMS.register("leatherapple",
            () -> new Item(new Item.Properties().food(ModFoods.LEATHER_APPLE)));
    public static final RegistryObject<Item> NETHERIET_APPLE = ITEMS.register("netheriteapple",
            () -> new Item(new Item.Properties().food(ModFoods.NETHERIET_APPLE)));
    public static final RegistryObject<Item> REDSTONE_APPLE = ITEMS.register("redstoneapple",
            () -> new Item(new Item.Properties().food(ModFoods.REDSTONE_APPLE)));
    public static final RegistryObject<Item> DIRT_APPLE = ITEMS.register("dirtapple",
            () -> new Item(new Item.Properties().food(ModFoods.DIRT_APPLE)));
    public static final RegistryObject<Item> GRAVEL_APPLE = ITEMS.register("gravelapple",
            () -> new Item(new Item.Properties().food(ModFoods.GRAVEL_APPLE)));
    public static final RegistryObject<Item> LEAVES_APPLE = ITEMS.register("leavesapple",
            () -> new Item(new Item.Properties().food(ModFoods.LEAVES_APPLE)));
    public static final RegistryObject<Item> WOOL_APPLE = ITEMS.register("woolapple",
            () -> new Item(new Item.Properties().food(ModFoods.WOOL_APPLE)));
    public static final RegistryObject<Item> WATER_APPLE = ITEMS.register("waterapple",
            () -> new Item(new Item.Properties().food(ModFoods.WATER_APPLE)));
    public static final RegistryObject<Item> TNT_APPLE = ITEMS.register("tntapple",
            () -> new Item(new Item.Properties().food(ModFoods.TNT_APPLE)));
    public static final RegistryObject<Item> STONE_APPLE = ITEMS.register("stoneapple",
            () -> new Item(new Item.Properties().food(ModFoods.STONE_APPLE)));
    public static final RegistryObject<Item> STARTS_APPLE = ITEMS.register("starsapple",
            () -> new Item(new Item.Properties().food(ModFoods.STARTS_APPLE)));
    public static final RegistryObject<Item> SPONGE_APPLE = ITEMS.register("spongeapple",
            () -> new Item(new Item.Properties().food(ModFoods.SPONGE_APPLE)));
    public static final RegistryObject<Item> SNOW_APPLE = ITEMS.register("snowapple",
            () -> new Item(new Item.Properties().food(ModFoods.SNOW_APPLE)));
    public static final RegistryObject<Item> SLIME_APPLE = ITEMS.register("slimeapple",
            () -> new Item(new Item.Properties().food(ModFoods.SLIME_APPLE)));
    public static final RegistryObject<Item> SAND_APPLE = ITEMS.register("sandapple",
            () -> new Item(new Item.Properties().food(ModFoods.SAND_APPLE)));
    public static final RegistryObject<Item> MILK_APPLE = ITEMS.register("milkapple",
            () -> new Item(new Item.Properties().food(ModFoods.MILK_APPLE)));
    public static final RegistryObject<Item> LAVA_APPLE = ITEMS.register("lavaapple",
            () -> new Item(new Item.Properties().food(ModFoods.LAVA_APPLE)));
    public static final RegistryObject<Item> HONEY_APPLE = ITEMS.register("honeyapple",
            () -> new Item(new Item.Properties().food(ModFoods.HONEY_APPLE)));
    public static final RegistryObject<Item> ENDER_APPLE = ITEMS.register("enderapple",
            () -> new Item(new Item.Properties().food(ModFoods.ENDER_APPLE)));
    public static final RegistryObject<Item> ENCHANTED_SPONGE_APPLE = ITEMS.register("enchspongeapple",
            () -> new Item(new Item.Properties().food(ModFoods.ENCHANTED_SPONGE_APPLE)));
    public static final RegistryObject<Item> EGG_APPLE = ITEMS.register("eggapple",
            () -> new Item(new Item.Properties().food(ModFoods.EGG_APPLE)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
