package net.dollar.apex.util;

import net.dollar.apex.item.ModItems;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ChargedProjectilesComponent;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;

/**
 * Handles setting up complex model predicates that are used for Bows and Crossbows (which render different
 *  textures depending on duration of use).
 */
@Environment(EnvType.CLIENT)
public class ModModelPredicateProvider {
    public static void registerModModels() {
        registerBow(ModItems.INFUSED_GEMSTONE_BOW);
        registerBow(ModItems.COBALT_STEEL_BOW);
        registerBow(ModItems.TUNGSTEN_CARBIDE_BOW);
        registerCrossbow(ModItems.INFUSED_GEMSTONE_CROSSBOW);
        registerCrossbow(ModItems.COBALT_STEEL_CROSSBOW);
        registerCrossbow(ModItems.TUNGSTEN_CARBIDE_CROSSBOW);
    }



    /**
     * Handles creating model predicate registries for the passed-in bow Item.
     * @param bow Bow Item to create model predicates for
     */
    private static void registerBow(Item bow) {
        ModelPredicateProviderRegistry.register(bow, Identifier.of("pull"),
                (stack, world, entity, seed) -> {
                    if (entity == null) {
                        return 0.0f;
                    }
                    if (entity.getActiveItem() != stack) {
                        return 0.0f;
                    }
                    return (float)(stack.getMaxUseTime(entity) - entity.getItemUseTimeLeft()) / 20.0f;
                });

        ModelPredicateProviderRegistry.register(bow, Identifier.of("pulling"),
                (stack, world, entity, seed) ->
                        entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);
    }

    /**
     * Handles creating model predicate registries for the passed-in bow Item.
     * @param crossbow Bow Item to create model predicates for
     */
    private static void registerCrossbow(Item crossbow) {
        ModelPredicateProviderRegistry.register(crossbow, Identifier.of("pull"),
                (stack, world, entity, seed) -> {
                    if (entity == null) {
                        return 0.0f;
                    }
                    if (CrossbowItem.isCharged(stack)) {
                        return 0.0f;
                    }
                    return (float)(stack.getMaxUseTime(entity) - entity.getItemUseTimeLeft()) / (float)CrossbowItem.getPullTime(stack, entity);
                });

        ModelPredicateProviderRegistry.register(crossbow, Identifier.of("pulling"),
                (stack, world, entity, seed) ->
                        entity != null && entity.isUsingItem() && entity.getActiveItem() == stack
                                && !CrossbowItem.isCharged(stack) ? 1.0f : 0.0f);

        ModelPredicateProviderRegistry.register(crossbow, Identifier.of("charged"),
                (stack, world, entity, seed) ->
                        CrossbowItem.isCharged(stack) ? 1.0f : 0.0f);

        ModelPredicateProviderRegistry.register(crossbow, Identifier.of("firework"),
                (stack, world, entity, seed) -> {
                    ChargedProjectilesComponent chargedProjectilesComponent = stack.get(DataComponentTypes.CHARGED_PROJECTILES);
                    return chargedProjectilesComponent != null && chargedProjectilesComponent.contains(Items.FIREWORK_ROCKET) ? 1.0f : 0.0f;
                });
    }
}
