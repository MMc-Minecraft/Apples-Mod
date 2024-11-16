package tr.com.mohamed.applesmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import tr.com.mohamed.applesmod.ApplesMod;
import tr.com.mohamed.applesmod.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ApplesMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.WOOD_APPLE);
        simpleItem(ModItems.WOOL_APPLE);
        simpleItem(ModItems.WATER_APPLE);
        simpleItem(ModItems.TNT_APPLE);
        simpleItem(ModItems.STONE_APPLE);
//        simpleItem(ModItems.STARTS_APPLE);
        simpleItem(ModItems.SPONGE_APPLE);
        simpleItem(ModItems.SNOW_APPLE);
        simpleItem(ModItems.SLIME_APPLE);
        simpleItem(ModItems.SAND_APPLE);
        simpleItem(ModItems.REDSTONE_APPLE);
        simpleItem(ModItems.NETHERIET_APPLE);
//        simpleItem(ModItems.MILK_APPLE);
        simpleItem(ModItems.LEAVES_APPLE);
        simpleItem(ModItems.LEATHER_APPLE);
        simpleItem(ModItems.LAVA_APPLE);
        simpleItem(ModItems.LAPIS_APPLE);
        simpleItem(ModItems.HONEY_APPLE);
        simpleItem(ModItems.ENDER_APPLE);
//        simpleItem(ModItems.ENCHANTED_SPONGE_APPLE);
        simpleItem(ModItems.EMERALD_APPLE);
//        simpleItem(ModItems.EGG_APPLE);
        simpleItem(ModItems.DIRT_APPLE);
        simpleItem(ModItems.COPPER_APPLE);
        simpleItem(ModItems.COAL_APPLE);
        simpleItem(ModItems.BONES_APPLE);
        simpleItem(ModItems.CAT_APPLE);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ApplesMod.MOD_ID, "item/" + item.getId().getPath()));
    }
}
