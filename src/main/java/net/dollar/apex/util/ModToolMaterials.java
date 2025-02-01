package net.dollar.apex.util;

import net.dollar.apex.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Supplier;

public interface ModToolMaterials {
    //NETHERITE: 4, 2031, 9, 4.0f, 15
    ToolMaterial BRONZE = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL,
            250,
            6.0f,
            2.0f,
            14,
            ModTags.Items.COMMON_BRONZE_INGOTS);
    ToolMaterial GILDED_BRONZE = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            666,
            12,
            2.0f,
            22,
            ItemTags.GOLD_TOOL_MATERIALS);
    ToolMaterial INFUSED_GEMSTONE = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            2031,
            10,
            4.0f,
            22,
            ModTags.Items.MOD_REPAIRS_COBALT_STEEL_EQUIPMENT);
    ToolMaterial COBALT_STEEL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
             2031,
             20,
             3.0f,
             18,
            ModTags.Items.MOD_REPAIRS_INFUSED_GEMSTONE_EQUIPMENT);
    ToolMaterial TUNGSTEN_CARBIDE = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            2501,
            7,
            6.0f,
            15,
            ModTags.Items.MOD_REPAIRS_TUNGSTEN_CARBIDE_EQUIPMENT);
}
