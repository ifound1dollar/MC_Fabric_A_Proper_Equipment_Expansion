package net.dollar.apex.util;

import net.dollar.apex.ModMain;
import net.dollar.apex.item.ModItems;
import net.minecraft.item.*;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentModels;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public interface ModArmorMaterials {
    ArmorMaterial BRONZE = new ArmorMaterial(15, Util.make(
            new EnumMap<>(EquipmentType.class), (map) -> {
                map.put(EquipmentType.BOOTS, 2);
                map.put(EquipmentType.LEGGINGS, 5);
                map.put(EquipmentType.CHESTPLATE, 6);
                map.put(EquipmentType.HELMET, 2);
                map.put(EquipmentType.BODY, 5);
            }), 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f, 0.0f,
            ModTags.Items.COMMON_BRONZE_INGOTS, EquipmentModels.IRON);
    ArmorMaterial GILDED_BRONZE = new ArmorMaterial(23, Util.make(
            new EnumMap<>(EquipmentType.class), (map) -> {
                map.put(EquipmentType.BOOTS, 3);
                map.put(EquipmentType.LEGGINGS, 5);
                map.put(EquipmentType.CHESTPLATE, 6);
                map.put(EquipmentType.HELMET, 3);
                map.put(EquipmentType.BODY, 9);
            }), 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 1.0f, 0.0f,
            ItemTags.REPAIRS_GOLD_ARMOR, EquipmentModels.GOLD);
    ArmorMaterial COBALT_STEEL = new ArmorMaterial(37, Util.make(
            new EnumMap<>(EquipmentType.class), (map) -> {
                map.put(EquipmentType.BOOTS, 3);
                map.put(EquipmentType.LEGGINGS, 6);
                map.put(EquipmentType.CHESTPLATE, 8);
                map.put(EquipmentType.HELMET, 3);
                map.put(EquipmentType.BODY, 11);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0f, 0.1f,
            ModTags.Items.MOD_REPAIRS_COBALT_STEEL_EQUIPMENT, EquipmentModels.NETHERITE);
    ArmorMaterial INFUSED_GEMSTONE = new ArmorMaterial(37, Util.make(
            new EnumMap<>(EquipmentType.class), (map) -> {
                map.put(EquipmentType.BOOTS, 3);
                map.put(EquipmentType.LEGGINGS, 6);
                map.put(EquipmentType.CHESTPLATE, 8);
                map.put(EquipmentType.HELMET, 3);
                map.put(EquipmentType.BODY, 11);
            }), 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0f, 0.05f,
            ModTags.Items.MOD_REPAIRS_INFUSED_GEMSTONE_EQUIPMENT, EquipmentModels.DIAMOND);
    ArmorMaterial TUNGSTEN_CARBIDE = new ArmorMaterial(41, Util.make(
            new EnumMap<>(EquipmentType.class), (map) -> {
                map.put(EquipmentType.BOOTS, 3);
                map.put(EquipmentType.LEGGINGS, 6);
                map.put(EquipmentType.CHESTPLATE, 8);
                map.put(EquipmentType.HELMET, 3);
                map.put(EquipmentType.BODY, 11);
            }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.0f, 0.1f,
            ModTags.Items.MOD_REPAIRS_TUNGSTEN_CARBIDE_EQUIPMENT, EquipmentModels.NETHERITE);
}