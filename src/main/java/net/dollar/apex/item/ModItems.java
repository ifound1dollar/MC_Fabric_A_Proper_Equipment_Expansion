package net.dollar.apex.item;

import net.dollar.apex.ModMain;
import net.dollar.apex.entity.ModEntities;
import net.dollar.apex.item.custom.*;
import net.dollar.apex.item.custom.bow.ModInfusedGemstoneBowItem;
import net.dollar.apex.item.custom.bow.ModCobaltSteelBowItem;
import net.dollar.apex.item.custom.bow.ModTungstenCarbideBowItem;
import net.dollar.apex.item.custom.tungstencarbide.*;
import net.dollar.apex.item.custom.cobaltsteel.*;
import net.dollar.apex.item.custom.crossbow.ModInfusedGemstoneCrossbowItem;
import net.dollar.apex.item.custom.crossbow.ModCobaltSteelCrossbowItem;
import net.dollar.apex.item.custom.crossbow.ModTungstenCarbideCrossbowItem;
import net.dollar.apex.item.custom.infusedgemstone.*;
import net.dollar.apex.util.ModArmorMaterials;
import net.dollar.apex.util.ModSmithingUpgradeItemHelper;
import net.dollar.apex.util.ModToolMaterials;
import net.minecraft.item.*;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    //region Misc.
    public static final Item OBSIDIAN_GOLEM_SPAWN_EGG = registerItem("obsidian_golem_spawn_egg",
            new SpawnEggItem(ModEntities.OBSIDIAN_GOLEM, 0x12031E, 0xED4D0E,
                    new Item.Settings().registryKey(generateItemKey("obsidian_golem_spawn_egg"))));
    public static final Item MYSTERIOUS_SPECTER_SPAWN_EGG = registerItem("mysterious_specter_spawn_egg",
            new SpawnEggItem(ModEntities.MYSTERIOUS_SPECTER, 0xE3E3E3, 0xB8B8B8,
                    new Item.Settings().registryKey(generateItemKey("mysterious_specter_spawn_egg"))));
    public static final Item FERTILIZER = registerItem("fertilizer",
            new BoneMealItem((new Item.Settings().registryKey(generateItemKey("fertilizer")))));
    //endregion

    //region Trophy items
    //Set maxCount here instead of in the item class.
    public static final Item TROPHY_OBSIDIAN_DUST = registerItem("trophy_obsidian_dust",
            new ModTrophyItem(new Item.Settings().registryKey(generateItemKey("trophy_obsidian_dust"))
                    .maxCount(1), "1"));
    public static final Item TROPHY_OMINOUS_LETTER = registerItem("trophy_ominous_letter",
            new ModTrophyItem(new Item.Settings().registryKey(generateItemKey("trophy_ominous_letter"))
                    .maxCount(1), "2"));

    //endregion

    //region Raw Items, Gems, Compounds
    public static final Item RUBY = registerItem("ruby",
            new Item(new Item.Settings().registryKey(generateItemKey("ruby"))));
    public static final Item SAPPHIRE = registerItem("sapphire",
            new Item(new Item.Settings().registryKey(generateItemKey("sapphire"))));
    public static final Item COBALT_SHARD = registerItem("cobalt_shard",
            new Item(new Item.Settings().registryKey(generateItemKey("cobalt_shard"))));
    public static final Item PHOSPHATE_POWDER = registerItem("phosphate_powder",
            new Item(new Item.Settings().registryKey(generateItemKey("phosphate_powder"))));
    public static final Item RAW_TIN = registerItem("raw_tin",
            new Item(new Item.Settings().registryKey(generateItemKey("raw_tin"))));
    public static final Item TIN_INGOT = registerItem("tin_ingot",
            new Item(new Item.Settings().registryKey(generateItemKey("tin_ingot"))));
    public static final Item TIN_NUGGET = registerItem("tin_nugget",
            new Item(new Item.Settings().registryKey(generateItemKey("tin_nugget"))));
    public static final Item BRONZE_COMPOUND = registerItem("bronze_compound",
            new Item(new Item.Settings().registryKey(generateItemKey("bronze_compound"))));
    public static final Item BRONZE_INGOT = registerItem("bronze_ingot",
            new Item(new Item.Settings().registryKey(generateItemKey("bronze_ingot"))));
    public static final Item BRONZE_NUGGET = registerItem("bronze_nugget",
            new Item(new Item.Settings().registryKey(generateItemKey("bronze_nugget"))));
    public static final Item STEEL_COMPOUND = registerItem("steel_compound",
            new Item(new Item.Settings().registryKey(generateItemKey("steel_compound"))));
    public static final Item STEEL_INGOT = registerItem("steel_ingot",
            new Item(new Item.Settings().registryKey(generateItemKey("steel_ingot"))));
    public static final Item STEEL_NUGGET = registerItem("steel_nugget",
            new Item(new Item.Settings().registryKey(generateItemKey("steel_nugget"))));
    public static final Item RAW_TUNGSTEN = registerItem("raw_tungsten",
            new Item(new Item.Settings().registryKey(generateItemKey("raw_tungsten"))));
    public static final Item TUNGSTEN_INGOT = registerItem("tungsten_ingot",
            new Item(new Item.Settings().registryKey(generateItemKey("tungsten_ingot"))));
    public static final Item TUNGSTEN_NUGGET = registerItem("tungsten_nugget",
            new Item(new Item.Settings().registryKey(generateItemKey("tungsten_nugget"))));
    //endregion

    //Region End-game upgrade items
    public static final Item MOLTEN_CORE = registerItem("molten_core",
            new ModCustomItem(new Item.Settings().registryKey(generateItemKey("molten_core"))
                    .fireproof(), "tooltip.molten_core", false));
    public static final Item HANDFUL_OF_STARDUST = registerItem("handful_of_stardust",
            new ModCustomItem(new Item.Settings().registryKey(generateItemKey("handful_of_stardust"))
                    .fireproof(), "tooltip.handful_of_stardust", false));
    public static final Item INFUSED_GEMSTONE = registerItem("infused_gemstone",
            new ModCustomItem(new Item.Settings().registryKey(generateItemKey("infused_gemstone"))
                    .fireproof(), "tooltip.infused_gemstone", true));
    public static final Item COBALT_STEEL_INGOT = registerItem("cobalt_steel_ingot",
            new ModCustomItem(new Item.Settings().registryKey(generateItemKey("cobalt_steel_ingot"))
                    .fireproof(), "tooltip.cobalt_steel_ingot", false));
    public static final Item TUNGSTEN_CARBIDE_INGOT = registerItem("tungsten_carbide_ingot",
            new ModCustomItem(new Item.Settings().registryKey(generateItemKey("tungsten_carbide_ingot"))
                    .fireproof(), "tooltip.tungsten_carbide_ingot", false));
    //endregion

    //region Upgrade Templates
    public static final Item BASIC_UPGRADE_TEMPLATE = registerItem("basic_upgrade_template",
            new Item(new Item.Settings().registryKey(generateItemKey("basic_upgrade_template"))));
    public static final Item COBALT_UPGRADE_TEMPLATE = registerItem("cobalt_upgrade_smithing_template",
            ModSmithingUpgradeItemHelper.createCobaltUpgradeTemplate());
    public static final Item INFUSION_UPGRADE_TEMPLATE = registerItem("infusion_upgrade_smithing_template",
            ModSmithingUpgradeItemHelper.createInfusionUpgradeTemplate());
    public static final Item CARBIDE_UPGRADE_TEMPLATE = registerItem("carbide_upgrade_smithing_template",
            ModSmithingUpgradeItemHelper.createCarbideUpgradeTemplate());
    //endregion

    //region Bows/Crossbows 
    public static final Item COBALT_STEEL_BOW = registerItem("cobalt_steel_bow",
            new ModCobaltSteelBowItem(new Item.Settings()
                    .registryKey(generateItemKey("cobalt_steel_bow"))
                    .maxDamage(1200).fireproof()));
    public static final Item COBALT_STEEL_CROSSBOW = registerItem("cobalt_steel_crossbow",
            new ModCobaltSteelCrossbowItem(new Item.Settings()
                    .registryKey(generateItemKey("cobalt_steel_crossbow"))
                    .maxDamage(1500).fireproof()));
    public static final Item INFUSED_GEMSTONE_BOW = registerItem("infused_gemstone_bow",
            new ModInfusedGemstoneBowItem(new Item.Settings()
                    .registryKey(generateItemKey("infused_gemstone_bow"))
                    .maxDamage(1200).fireproof()));   //Vanilla maxDamage is 384
    public static final Item INFUSED_GEMSTONE_CROSSBOW = registerItem("infused_gemstone_crossbow",
            new ModInfusedGemstoneCrossbowItem(new Item.Settings()
                    .registryKey(generateItemKey("infused_gemstone_crossbow"))
                    .maxDamage(1500).fireproof()));  //Vanilla maxDamage is 465
    public static final Item TUNGSTEN_CARBIDE_BOW = registerItem("tungsten_carbide_bow",
            new ModTungstenCarbideBowItem(new Item.Settings()
                    .registryKey(generateItemKey("tungsten_carbide_bow"))
                    .maxDamage(1200).fireproof()));
    public static final Item TUNGSTEN_CARBIDE_CROSSBOW = registerItem("tungsten_carbide_crossbow",
            new ModTungstenCarbideCrossbowItem(new Item.Settings()
                    .registryKey(generateItemKey("tungsten_carbide_crossbow"))
                    .maxDamage(1500).fireproof()));
    //endregion

    //region Axes
    public static final Item BRONZE_AXE = registerItem("bronze_axe",
            new AxeItem(ModToolMaterials.BRONZE, 6.0f, -3.1f,
                    new Item.Settings()
                            .registryKey(generateItemKey("bronze_axe"))));
    public static final Item GILDED_BRONZE_AXE = registerItem("gilded_bronze_axe",
            new AxeItem(ModToolMaterials.GILDED_BRONZE, 6.0f, -2.9f,
                    new Item.Settings()
                            .registryKey(generateItemKey("gilded_bronze_axe"))));
    public static final Item COBALT_STEEL_AXE = registerItem("cobalt_steel_axe",
            new ModCobaltSteelAxeItem(ModToolMaterials.COBALT_STEEL, 5.0f, -2.7f,
                    new Item.Settings()
                            .registryKey(generateItemKey("cobalt_steel_axe"))
                            .fireproof())); //Very fast, Netherite = 5.0f, -3.0f
    public static final Item INFUSED_GEMSTONE_AXE = registerItem("infused_gemstone_axe",
            new ModInfusedGemstoneAxeItem(ModToolMaterials.INFUSED_GEMSTONE, 5.0f, -2.9f,
                    new Item.Settings()
                            .registryKey(generateItemKey("infused_gemstone_axe"))
                            .fireproof())); //Faster, Netherite = 5.0f, -3.0f
    public static final Item TUNGSTEN_CARBIDE_AXE = registerItem("tungsten_carbide_axe",
            new ModTungstenCarbideAxeItem(ModToolMaterials.TUNGSTEN_CARBIDE, 6.0f, -3.2f,
                    new Item.Settings()
                            .registryKey(generateItemKey("tungsten_carbide_axe"))
                            .fireproof())); //Slower, Netherite = 5.0f, -3.0f
    //endregion

    //region Battleaxes
    public static final Item DIAMOND_BATTLEAXE = registerItem("diamond_battleaxe",
            new ModBattleaxeItem(ToolMaterial.DIAMOND, 5, -3.0f,
                    new Item.Settings()
                            .registryKey(generateItemKey("diamond_battleaxe"))));
    public static final Item NETHERITE_BATTLEAXE = registerItem("netherite_battleaxe",
            new ModBattleaxeItem(ToolMaterial.NETHERITE, 5, -3.0f,
                    new Item.Settings()
                            .registryKey(generateItemKey("netherite_battleaxe"))
                            .fireproof()));
    public static final Item COBALT_STEEL_BATTLEAXE = registerItem("cobalt_steel_battleaxe",
            new ModCobaltSteelBattleaxeItem(ModToolMaterials.COBALT_STEEL,
                    5, -2.7f,
                    new Item.Settings()
                            .registryKey(generateItemKey("cobalt_steel_battleaxe"))
                            .fireproof())); //Faster, Netherite = 5.0f, -3.0f
    public static final Item INFUSED_GEMSTONE_BATTLEAXE = registerItem("infused_gemstone_battleaxe",
            new ModInfusedGemstoneBattleaxeItem(ModToolMaterials.INFUSED_GEMSTONE,
                    5, -2.9f,
                    new Item.Settings()
                            .registryKey(generateItemKey("infused_gemstone_battleaxe"))
                            .fireproof())); //Very fast, Netherite = 5.0f, -3.0f
    public static final Item TUNGSTEN_CARBIDE_BATTLEAXE = registerItem("tungsten_carbide_battleaxe",
            new ModTungstenCarbideBattleaxeItem(ModToolMaterials.TUNGSTEN_CARBIDE,
                    6, -3.2f,
                    new Item.Settings()
                            .registryKey(generateItemKey("tungsten_carbide_battleaxe"))
                            .fireproof())); //Slower, Netherite = 5.0f, -3.0f
    //endregion

    //region Hoes
    public static final Item BRONZE_HOE = registerItem("bronze_hoe",
            new HoeItem(ModToolMaterials.BRONZE, -2.0f, -1.0f,
                    new Item.Settings()
                            .registryKey(generateItemKey("bronze_hoe"))));
    public static final Item GILDED_BRONZE_HOE = registerItem("gilded_bronze_hoe",
            new HoeItem(ModToolMaterials.GILDED_BRONZE, -2.0f, -0.0f,
                    new Item.Settings()
                            .registryKey(generateItemKey("gilded_bronze_hoe"))));
    public static final Item COBALT_STEEL_HOE = registerItem("cobalt_steel_hoe",
            new ModCobaltSteelHoeItem(ModToolMaterials.COBALT_STEEL,
                    -2, 0.0f,
                    new Item.Settings()
                            .registryKey(generateItemKey("cobalt_steel_hoe"))
                            .fireproof())); //Very fast, Netherite = -4, 0.0f
    public static final Item INFUSED_GEMSTONE_HOE = registerItem("infused_gemstone_hoe",
            new ModInfusedGemstoneHoeItem(ModToolMaterials.INFUSED_GEMSTONE,
                    -2, -1.0f,
                    new Item.Settings()
                            .registryKey(generateItemKey("infused_gemstone_hoe"))
                            .fireproof())); //Faster, Netherite = -4, 0.0f
    public static final Item TUNGSTEN_CARBIDE_HOE = registerItem("tungsten_carbide_hoe",
            new ModTungstenCarbideHoeItem(ModToolMaterials.TUNGSTEN_CARBIDE,
                    -3, -2.0f,
                    new Item.Settings()
                            .registryKey(generateItemKey("tungsten_carbide_hoe"))
                            .fireproof())); //Slower, Netherite = -4, 0.0f
    //endregion

    //region Paxels
    public static final Item DIAMOND_PAXEL = registerItem("diamond_paxel",
            new ModPaxelItem(ToolMaterial.DIAMOND, 2.0f, -2.9f,
                    new Item.Settings()
                            .registryKey(generateItemKey("diamond_paxel"))));
    public static final Item NETHERITE_PAXEL = registerItem("netherite_paxel",
            new ModPaxelItem(ToolMaterial.NETHERITE, 2.0f, -2.9f,
                    new Item.Settings()
                            .registryKey(generateItemKey("netherite_paxel"))
                            .fireproof())); //Rough average between Axe, Pickaxe, and Shovel stats
    public static final Item COBALT_STEEL_PAXEL = registerItem("cobalt_steel_paxel",
            new ModCobaltSteelPaxelItem(ModToolMaterials.COBALT_STEEL,
                    2.0f, -2.6f,
                    new Item.Settings()
                            .registryKey(generateItemKey("cobalt_steel_paxel"))
                            .fireproof())); //Faster, Netherite = 2.0f, -2.9f
    public static final Item INFUSED_GEMSTONE_PAXEL = registerItem("infused_gemstone_paxel",
            new ModInfusedGemstonePaxelItem(ModToolMaterials.INFUSED_GEMSTONE,
                    2.0f, -2.8f,
                    new Item.Settings()
                            .registryKey(generateItemKey("infused_gemstone_paxel"))
                            .fireproof())); //Very fast, Netherite = 2.0f, -2.9f
    public static final Item TUNGSTEN_CARBIDE_PAXEL = registerItem("tungsten_carbide_paxel",
            new ModTungstenCarbidePaxelItem(ModToolMaterials.TUNGSTEN_CARBIDE,
                    2.5f, -3.1f,
                    new Item.Settings()
                            .registryKey(generateItemKey("tungsten_carbide_paxel"))
                            .fireproof())); //Slower, Netherite = 2.0f, -2.9f
    //endregion

    //region Pickaxes
    public static final Item BRONZE_PICKAXE = registerItem("bronze_pickaxe",
            new PickaxeItem(ModToolMaterials.BRONZE, 1.0f, -2.8f,
                    new Item.Settings()
                            .registryKey(generateItemKey("bronze_pickaxe"))));
    public static final Item GILDED_BRONZE_PICKAXE = registerItem("gilded_bronze_pickaxe",
            new PickaxeItem(ModToolMaterials.GILDED_BRONZE, 1.0f, -2.6f,
                    new Item.Settings()
                            .registryKey(generateItemKey("gilded_bronze_pickaxe"))));
    public static final Item COBALT_STEEL_PICKAXE = registerItem("cobalt_steel_pickaxe",
            new ModCobaltSteelPickaxeItem(ModToolMaterials.COBALT_STEEL,
                    1, -2.5f,
                    new Item.Settings()
                            .registryKey(generateItemKey("cobalt_steel_pickaxe"))
                            .fireproof())); //Slower, Netherite = 1, -2.8f
    public static final Item INFUSED_GEMSTONE_PICKAXE = registerItem("infused_gemstone_pickaxe",
            new ModInfusedGemstonePickaxeItem(ModToolMaterials.INFUSED_GEMSTONE,
                    1, -2.7f,
                    new Item.Settings()
                            .registryKey(generateItemKey("infused_gemstone_pickaxe"))
                            .fireproof())); //Faster, Netherite = 1, -2.8f
    public static final Item TUNGSTEN_CARBIDE_PICKAXE = registerItem("tungsten_carbide_pickaxe",
            new ModTungstenCarbidePickaxeItem(ModToolMaterials.TUNGSTEN_CARBIDE,
                    1, -3.0f,
                    new Item.Settings()
                            .registryKey(generateItemKey("tungsten_carbide_pickaxe"))
                            .fireproof())); //Very fast, Netherite = 1, -2.8f
    //endregion

    //region Shovel
    public static final Item BRONZE_SHOVEL = registerItem("bronze_shovel",
            new ShovelItem(ModToolMaterials.BRONZE, 1.5f, -3.0f,
                    new Item.Settings()
                            .registryKey(generateItemKey("bronze_shovel"))));
    public static final Item GILDED_BRONZE_SHOVEL = registerItem("gilded_bronze_shovel",
            new ShovelItem(ModToolMaterials.GILDED_BRONZE, 1.5f, -2.8f,
                    new Item.Settings()
                            .registryKey(generateItemKey("gilded_bronze_shovel"))));
    public static final Item COBALT_STEEL_SHOVEL = registerItem("cobalt_steel_shovel",
            new ModCobaltSteelShovelItem(ModToolMaterials.COBALT_STEEL,
                    1.5f, -2.7f,
                    new Item.Settings()
                            .registryKey(generateItemKey("cobalt_steel_shovel"))
                            .fireproof())); //Very fast, Netherite = 1.5f, -3.0f
    public static final Item INFUSED_GEMSTONE_SHOVEL = registerItem("infused_gemstone_shovel",
            new ModInfusedGemstoneShovelItem(ModToolMaterials.INFUSED_GEMSTONE,
                    2.0f, -2.9f,
                    new Item.Settings()
                            .registryKey(generateItemKey("infused_gemstone_shovel"))
                            .fireproof())); //Faster, Netherite = 1.5f, -3.0f
    public static final Item TUNGSTEN_CARBIDE_SHOVEL = registerItem("tungsten_carbide_shovel",
            new ModTungstenCarbideShovelItem(ModToolMaterials.TUNGSTEN_CARBIDE,
                    2.0f, -3.2f,
                    new Item.Settings()
                            .registryKey(generateItemKey("tungsten_carbide_shovel"))
                            .fireproof())); //Slower, Netherite = 1.5f, -3.0f
    //endregion

    //region Sword
    public static final Item BRONZE_SWORD = registerItem("bronze_sword",
            new SwordItem(ModToolMaterials.BRONZE, 3, -2.4f,
                    new Item.Settings()
                            .registryKey(generateItemKey("bronze_sword"))));
    public static final Item GILDED_BRONZE_SWORD = registerItem("gilded_bronze_sword",
            new SwordItem(ModToolMaterials.GILDED_BRONZE, 3, -2.2f,
                    new Item.Settings()
                            .registryKey(generateItemKey("gilded_bronze_sword"))));
    public static final Item COBALT_STEEL_SWORD = registerItem("cobalt_steel_sword",
            new ModCobaltSteelSwordItem(ModToolMaterials.COBALT_STEEL,
                    3, -2.0f,
                    new Item.Settings()
                            .registryKey(generateItemKey("cobalt_steel_sword"))
                            .fireproof())); //Very fast, Netherite = 3, -2.4f
    public static final Item INFUSED_GEMSTONE_SWORD = registerItem("infused_gemstone_sword",
            new ModInfusedGemstoneSwordItem(ModToolMaterials.INFUSED_GEMSTONE,
                    3, -2.3f,
                    new Item.Settings()
                            .registryKey(generateItemKey("infused_gemstone_sword"))
                            .fireproof())); //Faster, Netherite = 3, -2.4f
    public static final Item TUNGSTEN_CARBIDE_SWORD = registerItem("tungsten_carbide_sword",
            new ModTungstenCarbideSwordItem(ModToolMaterials.TUNGSTEN_CARBIDE,
                    3, -2.6f,
                    new Item.Settings()
                            .registryKey(generateItemKey("tungsten_carbide_sword"))
                            .fireproof())); //Slower, Netherite = 3, -2.4f
    //endregion

    //region Bronze armor
    public static final Item BRONZE_HELMET = registerItem("bronze_helmet",
            new ArmorItem(ModArmorMaterials.BRONZE, EquipmentType.HELMET,
                    new Item.Settings()
                            .registryKey(generateItemKey("bronze_helmet"))));  //15 durability multiplier, same as Iron
    public static final Item BRONZE_CHESTPLATE = registerItem("bronze_chestplate",
            new ArmorItem(ModArmorMaterials.BRONZE, EquipmentType.CHESTPLATE,
                    new Item.Settings()
                            .registryKey(generateItemKey("bronze_chestplate"))));
    public static final Item BRONZE_LEGGINGS = registerItem("bronze_leggings",
            new ArmorItem(ModArmorMaterials.BRONZE, EquipmentType.LEGGINGS,
                    new Item.Settings()
                            .registryKey(generateItemKey("bronze_leggings"))));
    public static final Item BRONZE_BOOTS = registerItem("bronze_boots",
            new ArmorItem(ModArmorMaterials.BRONZE, EquipmentType.BOOTS,
                    new Item.Settings()
                            .registryKey(generateItemKey("bronze_boots"))));
    //endregion

    //region Gilded Bronze armor
    public static final Item GILDED_BRONZE_HELMET = registerItem("gilded_bronze_helmet",
            new ModGildedBronzeArmorItem(ModArmorMaterials.GILDED_BRONZE, EquipmentType.HELMET,
                    new Item.Settings()
                            .registryKey(generateItemKey("gilded_bronze_helmet"))));  //23 durability multiplier
    public static final Item GILDED_BRONZE_CHESTPLATE = registerItem("gilded_bronze_chestplate",
            new ModGildedBronzeArmorItem(ModArmorMaterials.GILDED_BRONZE, EquipmentType.CHESTPLATE,
                    new Item.Settings()
                            .registryKey(generateItemKey("gilded_bronze_chestplate"))));
    public static final Item GILDED_BRONZE_LEGGINGS = registerItem("gilded_bronze_leggings",
            new ModGildedBronzeArmorItem(ModArmorMaterials.GILDED_BRONZE, EquipmentType.LEGGINGS,
                    new Item.Settings()
                            .registryKey(generateItemKey("gilded_bronze_leggings"))));
    public static final Item GILDED_BRONZE_BOOTS = registerItem("gilded_bronze_boots",
            new ModGildedBronzeArmorItem(ModArmorMaterials.GILDED_BRONZE, EquipmentType.BOOTS,
                    new Item.Settings()
                            .registryKey(generateItemKey("gilded_bronze_boots"))));
    //endregion

    //region Cobalt-Steel armor
    public static final Item COBALT_STEEL_HELMET = registerItem("cobalt_steel_helmet",
            new ModCobaltSteelArmorItem(ModArmorMaterials.COBALT_STEEL, EquipmentType.HELMET,
                    new Item.Settings()
                            .registryKey(generateItemKey("cobalt_steel_helmet"))));  //37 durability multiplier
    public static final Item COBALT_STEEL_CHESTPLATE = registerItem("cobalt_steel_chestplate",
            new ModCobaltSteelArmorItem(ModArmorMaterials.COBALT_STEEL, EquipmentType.CHESTPLATE,
                    new Item.Settings()
                            .registryKey(generateItemKey("cobalt_steel_chestplate"))));
    public static final Item COBALT_STEEL_LEGGINGS = registerItem("cobalt_steel_leggings",
            new ModCobaltSteelArmorItem(ModArmorMaterials.COBALT_STEEL, EquipmentType.LEGGINGS,
                    new Item.Settings()
                            .registryKey(generateItemKey("cobalt_steel_leggings"))));
    public static final Item COBALT_STEEL_BOOTS = registerItem("cobalt_steel_boots",
            new ModCobaltSteelArmorItem(ModArmorMaterials.COBALT_STEEL, EquipmentType.BOOTS,
                    new Item.Settings()
                            .registryKey(generateItemKey("cobalt_steel_boots"))));
    //endregion

    //region Infused Gemstone armor
    public static final Item INFUSED_GEMSTONE_HELMET = registerItem("infused_gemstone_helmet",
            new ModInfusedGemstoneArmorItem(ModArmorMaterials.INFUSED_GEMSTONE, EquipmentType.HELMET,
                    new Item.Settings()
                            .registryKey(generateItemKey("infused_gemstone_helmet"))));  //37 durability multiplier
    public static final Item INFUSED_GEMSTONE_CHESTPLATE = registerItem("infused_gemstone_chestplate",
            new ModInfusedGemstoneArmorItem(ModArmorMaterials.INFUSED_GEMSTONE, EquipmentType.CHESTPLATE,
                    new Item.Settings()
                            .registryKey(generateItemKey("infused_gemstone_chestplate"))));
    public static final Item INFUSED_GEMSTONE_LEGGINGS = registerItem("infused_gemstone_leggings",
            new ModInfusedGemstoneArmorItem(ModArmorMaterials.INFUSED_GEMSTONE, EquipmentType.LEGGINGS,
                    new Item.Settings()
                            .registryKey(generateItemKey("infused_gemstone_leggings"))));
    public static final Item INFUSED_GEMSTONE_BOOTS = registerItem("infused_gemstone_boots",
            new ModInfusedGemstoneArmorItem(ModArmorMaterials.INFUSED_GEMSTONE, EquipmentType.BOOTS,
                    new Item.Settings()
                            .registryKey(generateItemKey("infused_gemstone_boots"))));
    //endregion

    //region Infused Gemstone armor
    public static final Item TUNGSTEN_CARBIDE_HELMET = registerItem("tungsten_carbide_helmet",
            new ModTungstenCarbideArmorItem(ModArmorMaterials.TUNGSTEN_CARBIDE, EquipmentType.HELMET,
                    new Item.Settings()
                            .registryKey(generateItemKey("tungsten_carbide_helmet"))));  //41 durability multiplier
    public static final Item TUNGSTEN_CARBIDE_CHESTPLATE = registerItem("tungsten_carbide_chestplate",
            new ModTungstenCarbideArmorItem(ModArmorMaterials.TUNGSTEN_CARBIDE, EquipmentType.CHESTPLATE,
                    new Item.Settings()
                            .registryKey(generateItemKey("tungsten_carbide_chestplate"))));
    public static final Item TUNGSTEN_CARBIDE_LEGGINGS = registerItem("tungsten_carbide_leggings",
            new ModTungstenCarbideArmorItem(ModArmorMaterials.TUNGSTEN_CARBIDE, EquipmentType.LEGGINGS,
                    new Item.Settings()
                            .registryKey(generateItemKey("tungsten_carbide_leggings"))));
    public static final Item TUNGSTEN_CARBIDE_BOOTS = registerItem("tungsten_carbide_boots",
            new ModTungstenCarbideArmorItem(ModArmorMaterials.TUNGSTEN_CARBIDE, EquipmentType.BOOTS,
                    new Item.Settings()
                            .registryKey(generateItemKey("tungsten_carbide_boots"))));
    //endregion





//    /**
//     * Adds items (specified in-method) to the Ingredients creative mode tab.
//     * @param entries The Entries object to add the new Items to
//     */
//    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
//        //REMEMBER TO ADD EACH ITEM HERE
//        //entries.add(RUBY);
//        //entries.add(SAPPHIRE);
//        //entries.add(INFUSED_GEMSTONE);
//        //entries.add(MOLTEN_CORE);
//    }

    private static RegistryKey<Item> generateItemKey(String name) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(ModMain.MOD_ID, name));
    }

    /**
     * Registers a single item
     * @param name String identifier for the name
     * @param item Actual Item object to register
     * @return The registered Minecraft Item
     */
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ModMain.MOD_ID, name), item);
    }

    /**
     * Handles registering all mod items.
     */
    public static void registerModItems() {
        ModMain.LOGGER.info("Registering Mod Items for " + ModMain.MOD_ID);

        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
