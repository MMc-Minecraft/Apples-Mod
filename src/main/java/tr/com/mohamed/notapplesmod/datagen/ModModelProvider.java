package tr.com.mohamed.notapplesmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import tr.com.mohamed.notapplesmod.items.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.WOOD_APPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CAT_APPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BONES_APPLE, Models.GENERATED);
//        itemModelGenerator.register(ModItems.COAL_APPLE, Models.GENERATED);
//        itemModelGenerator.register(ModItems.COPPER_APPLE, Models.GENERATED);
//        itemModelGenerator.register(ModItems.DIAMOND_APPLE, Models.GENERATED);
//        itemModelGenerator.register(ModItems.IRON_APPLE, Models.GENERATED);
//        itemModelGenerator.register(ModItems.EMERALD_APPLE, Models.GENERATED);
//        itemModelGenerator.register(ModItems.LAPIS_APPLE, Models.GENERATED);
//        itemModelGenerator.register(ModItems.LEATHER_APPLE, Models.GENERATED);
//        itemModelGenerator.register(ModItems.NETHERITE_APPLE, Models.GENERATED);
//        itemModelGenerator.register(ModItems.REDSTONE_APPLE, Models.GENERATED);
//        itemModelGenerator.register(ModItems.DIRT_APPLE, Models.GENERATED);
//        itemModelGenerator.register(ModItems.GRAVEL_APPLE, Models.GENERATED);
//        itemModelGenerator.register(ModItems.LEAVES_APPLE, Models.GENERATED);
//        itemModelGenerator.register(ModItems.WOOL_APPLE, Models.GENERATED);
//        itemModelGenerator.register(ModItems.WATER_APPLE, Models.GENERATED);
//        itemModelGenerator.register(ModItems.TNT_APPLE, Models.GENERATED);
//        itemModelGenerator.register(ModItems.STONE_APPLE, Models.GENERATED);
//        itemModelGenerator.register(ModItems.STARS_APPLE, Models.GENERATED);
//        itemModelGenerator.register(ModItems.SPONGE_APPLE, Models.GENERATED);
//        itemModelGenerator.register(ModItems.SNOW_APPLE, Models.GENERATED);
//        itemModelGenerator.register(ModItems.SLIME_APPLE, Models.GENERATED);
//        itemModelGenerator.register(ModItems.SAND_APPLE, Models.GENERATED);
//        itemModelGenerator.register(ModItems.MILK_APPLE, Models.GENERATED);
//        itemModelGenerator.register(ModItems.LAVA_APPLE, Models.GENERATED);
//        itemModelGenerator.register(ModItems.HONEY_APPLE, Models.GENERATED);
//        itemModelGenerator.register(ModItems.ENDER_APPLE, Models.GENERATED);
//        itemModelGenerator.register(ModItems.ENCHANTED_SPONGE_APPLE, Models.GENERATED);
    }
}
