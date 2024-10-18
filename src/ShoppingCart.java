import components.map.Map;

/**
 * {@code ShoppingCartKernel} enhanced with secondary methods.
 */
public interface ShoppingCart extends ShoppingCartKernel {

    /**
     * Returns the name of the most expensive item in the {@code cart}.
     *
     * @param cart
     *            the {@code Map} to find expensive item in
     * @return {@code String} name of most expensive item
     * @requires {@code cart} is not empty
     * @ensures price(mostExpensive) >= all other prices in cart
     */
    String mostExpensive(Map<String, Double> cart);

    /**
     * Returns the name of the cheapest item in the {@code cart}.
     *
     * @param cart
     *            the {@code Map} to find cheapest item in
     * @return {@code String} name of cheapest item (smallest price)
     * @requires {@code cart} is not empty
     * @ensures price(cheapest) <= all other prices in cart
     */
    String cheapest(Map<String, Double> cart);

    /**
     * Removes {@code item} (key) and associated {code price} (value) from
     * {@code cart} map and stores in a designated text file.
     *
     * @param cart
     *            the {@code Map} to remove key and value from
     * @param item
     *            the {@code String} name of the item removed from cart
     * @updates cart
     * @requires {@code item} is in DOMAIN(cart)
     * @ensures item is removed from cart and (item, price) is found in
     *          saveForLater file.
     */
    void saveForLater(Map<String, Double> cart, String item);

    /**
     * Compares the values of two prices and returns an integer value
     * accordingly.
     *
     * @param cart
     *            the {@code Map} containing items
     * @param item1
     *            the {@code String} name of first item to compare
     * @param item2
     *            the {@code String} name of the second item to compare
     * @return 1, 0, or -1 depending on if price of item1 is greater than, equal
     *         to, or less than price of item2
     * @requires {@code item1} is in DOMAIN(cart) and {@code item2} is in
     *           DOMAIN(cart)
     * @ensures comparePrice return value =
     *          (item1.price()).compare(item2.price())
     */
    int comparePrice(Map<String, Double> cart, String item1, String item2);

    /**
     * Sums prices of all items in {@code cart} and returns total.
     *
     * @param cart
     *            the {@code Map} to sum up prices of
     * @return {@code Double} sum of all prices of items
     * @requires {@code cart} is not empty
     * @ensures totalPrice = sum of ALL item prices in cart
     */
    Double totalPrice(Map<String, Double> cart);

}
