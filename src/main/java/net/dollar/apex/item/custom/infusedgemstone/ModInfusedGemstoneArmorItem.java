package net.dollar.apex.item.custom.infusedgemstone;

import net.dollar.apex.item.ModItems;
import net.dollar.apex.util.IFullSetEffectArmor;
import net.dollar.apex.util.IInfusedGemstoneItem;
import net.dollar.apex.util.ModUtils;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.DamageTypeTags;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModInfusedGemstoneArmorItem extends ArmorItem implements IFullSetEffectArmor, IInfusedGemstoneItem {
    public ModInfusedGemstoneArmorItem(ArmorMaterial material, Type type, Settings settings) {
        super(material, type, settings);
    }



    /**
     * IFullSetEffectArmor interface method that prevents an effect from being applied if a full set is worn.
     * @param effect Effect trying to be applied
     * @return Whether the effect can be applied to this armor's wearer
     */
    @Override
    public boolean canReceiveEffect(StatusEffect effect, LivingEntity wearer) {
        //Can receive effect UNLESS full set and effect is wither.
        boolean isFullSet = false;

        //Check for correct equipment, then set isFullSet accordingly
        if (wearer instanceof PlayerEntity player) {
            boolean hasHelm = player.getEquippedStack(EquipmentSlot.HEAD).getItem() == ModItems.INFUSED_GEMSTONE_HELMET;
            boolean hasChest = player.getEquippedStack(EquipmentSlot.CHEST).getItem() == ModItems.INFUSED_GEMSTONE_CHESTPLATE;
            boolean hasLegs = player.getEquippedStack(EquipmentSlot.LEGS).getItem() == ModItems.INFUSED_GEMSTONE_LEGGINGS;
            boolean hasBoots = player.getEquippedStack(EquipmentSlot.FEET).getItem() == ModItems.INFUSED_GEMSTONE_BOOTS;
            isFullSet = hasHelm && hasChest && hasLegs && hasBoots;
        }

        return !(isFullSet && (effect == StatusEffects.WITHER || effect == StatusEffects.POISON));
    }



    /**
     * Gets whether Entities of this Item are fireproof (true).
     * @return Whether this Item is fireproof
     */
    @Override
    public boolean isFireproof() {
        return true;
    }

    /**
     * Appends text to the Item's hover tooltip (lore).
     * @param stack ItemStack corresponding to this Item
     * @param world Active world
     * @param tooltip List of tooltip texts to show
     * @param context TooltipContext denoting data like simple or advanced
     */
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        ModUtils.appendInfusedGemstoneEquipmentTooltip(tooltip, ModUtils.EquipmentType.ARMOR);
    }
}
