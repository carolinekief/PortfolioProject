import components.map.Map;
import components.map.Map1L;

/**
 * Shopping cart component proof of concept.
 *
 * @author Caroline Kiefaber
 *
 */
public final class ShopCartProofOfConcept {

    /**
     * Private no-argument constructor.
     */
    private ShopCartProofOfConcept() {
    }

    //kernels:

    /**
     * Adds item to cart.
     *
     * @param cart
     *            cart map
     * @param item
     *            item added
     * @param price
     *            price added
     */
    public void addItem(Map<String, Double> cart, String item, Double price) {
        //add item
        cart.add(item, price);

    }

    /**
     * Removes item from cart.
     *
     * @param cart
     *            cart map
     * @param item
     *            item removed
     */
    public void removeItem(Map<String, Double> cart, String item) {
        //remove item
        cart.remove(item);
    }

    /**
     * Gets price of item.
     *
     * @param cart
     *            cart map
     * @param item
     *            item for value
     * @return the price of {@code item}
     */
    public double price(Map<String, Double> cart, String item) {
        //get price of item
        double price = cart.value(item);

        //return price
        return price;
    }

    //have not yet added secondary methods

    /**
     * Displays cart.
     *
     * @param args
     *            arguments
     *
     */
    public static void main(String[] args) {
        Map<String, Double> cart = new Map1L<>();

        //creating a sample cart
        cart.add("penny", 0.01);
        cart.add("nickel", 0.05);
        cart.add("dime", 0.10);
        cart.add("quarter", 0.25);

        //print cart items and prices
        System.out.println("Your Cart: ");
        for (Map.Pair<String, Double> itemAndPrice : cart) {
            //print item name
            System.out.println("Item: " + itemAndPrice.key());
            //print price
            System.out.println("Price: $" + itemAndPrice.value());
        }

    }

}
