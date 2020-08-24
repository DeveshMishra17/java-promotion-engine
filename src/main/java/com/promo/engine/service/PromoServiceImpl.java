package com.promo.engine.service;

import java.util.Map;

import com.promo.engine.constants.UnitConstants;

public class PromoServiceImpl implements PromoService {

    @Override
    public int calculateFinalPrice(Map<String, Integer> cartItem) {

        if (cartItem == null || cartItem.isEmpty())
            return 0;

        Integer item1 = getSingleItemPrice("A", cartItem.get("A"));

        Integer item2 = getSingleItemPrice("B", cartItem.get("B"));

        Integer item3 = 0;

        if (cartItem.keySet().contains("D") && cartItem.get("D") > 0) {

            item3 = getCombinedItemPrice(cartItem.get("C"));
        } else {
            item3 = getSingleItemPrice("C", cartItem.get("C"));
        }

        return item1 + item2 + item3;
    }

    /*
     * Get combined promo item price
     * @param int quantity
     * @return fixed price for combined items
     */
    private Integer getCombinedItemPrice(int quantity) {
        return UnitConstants.COMBINED_PROMO_OFFER.get("Promo1").getFinalPrice() * quantity;
    }

    /*
     * Get Single item price
     * @param String item
     * @param int quantity
     * @return final price after applying promo
     */
    private Integer getSingleItemPrice(String item, Integer quantity) {

        int itemPrice;

        if (quantity < 0 || quantity == 0)
            itemPrice = 0;

        else if (quantity > 1) {
            itemPrice = calculateItemPrice(item, quantity);

        } else {
            itemPrice = UnitConstants.ITEM_PRICE_MAP.get(item);
        }
        return itemPrice;
    }

    /*
     * Apply single item promo based on item
     * @param String item
     * @param int quantity
     * @return final price after applying promo
     */
    private int calculateItemPrice(String item, Integer quantity) {

        int itemPrice = 0;

        if ("A".equalsIgnoreCase(item)) {

            itemPrice = calculateItemPrice(item, quantity, UnitConstants.SINGLE_ACTIVE_OFFER.get(item).getQuantity(),
                    itemPrice);

        } else if ("B".equalsIgnoreCase(item)) {

            itemPrice = calculateItemPrice(item, quantity, UnitConstants.SINGLE_ACTIVE_OFFER.get(item).getQuantity(),
                    itemPrice);

        } else if ("C".equalsIgnoreCase(item)) {

            itemPrice = calculateItemPrice(item, quantity, UnitConstants.SINGLE_ACTIVE_OFFER.get(item).getQuantity(),
                    itemPrice);

        } else if ("D".equalsIgnoreCase(item)) {

            itemPrice = calculateItemPrice(item, quantity, UnitConstants.SINGLE_ACTIVE_OFFER.get(item).getQuantity(),
                    itemPrice);

        }
        return itemPrice;
    }

    /*
     * Calculate price based
     * @param String item
     * @param Integer totalquantity
     * @param Integer qualifyQunatity for promo
     * @param int unit price of each item
     * @return final price after applying promo
     */
    private int calculateItemPrice(String item, Integer totalQuantity, Integer qualifyQunatity, int itemPrice) {

        do {
            itemPrice += UnitConstants.SINGLE_ACTIVE_OFFER.get(item).getOfferPrice();
            totalQuantity -= qualifyQunatity;

        } while (totalQuantity >= qualifyQunatity);

        if (totalQuantity > 0) {
            itemPrice += totalQuantity * UnitConstants.ITEM_PRICE_MAP.get(item);

        }
        return itemPrice;
    }

}
