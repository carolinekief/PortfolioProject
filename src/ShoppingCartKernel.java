import components.map.Map;

/**
 * Shopping cart kernel component with primary methods.
 */
public interface ShoppingCartKernel {

    /*
     * As a little note, I am planning on expanding on the design and using
     * something like Map<String, Product> for the cart so that I could add more
     * interesting cart info in the final result; just didn't have the time to
     * brainstorm that for this part of the assignment (I realize right now it
     * seems like just a bad version of map). :)
     */

    /**
     * Adds {@code item} (key) and {code price} (value) to {@code cart} map.
     *
     * @param cart
     *            the {@code Map} to add key and value to
     * @param item
     *            the {@code String} name of the item added to cart
     * @param price
     *            the {@code double} price of the item added to cart
     * @updates cart
     * @requires {@code item.length() > 0 && price >= 0.0}
     * @ensures cart = #cart union {(item, price)}
     */
    void addItem(Map<String, Double> cart, String item, Double price);

    /**
     * Removes {@code item} (key) and associated {code price} (value) from
     * {@code cart} map.
     *
     * @param cart
     *            the {@code Map} to remove key and value from
     * @param item
     *            the {@code String} name of the item removed from cart
     * @updates cart
     * @requires {@code item} is in DOMAIN(cart)
     * @ensures <pre>
     * remove.item = item  and
     * remove is in #cart  and
     * cart = #cart \ {remove}
     * </pre>
     */
    void removeItem(Map<String, Double> cart, String item);

    /**
     * Returns value (price) of {@code item} (key) from the {@code cart} map.
     *
     * @param cart
     *            the {@code Map} to get price of item from
     * @param item
     *            the {@code String} name of the item to get price of
     * @return the price {@code double} of a cart item
     * @aliases reference returned by {@code price}
     * @requires {@code item} is in DOMAIN(cart)
     * @ensures returned price = value(item) in {@code Map} cart.
     */
    double price(Map<String, Double> cart, String item);
}
