package ShoppingCart;

import java.util.HashMap;

public class Cart {

    HashMap<String, Integer> cart = new HashMap<>();

    // Add item
    public void addItem(String name, int qty, HashMap<String, Integer> price) {

        name = name.toLowerCase();

        if (!price.containsKey(name)) {
            System.out.println("Item not available in store");
            return;
        }

        cart.put(name, cart.getOrDefault(name, 0) + qty);
        System.out.println("Item added");
    }

    // Show cart
    public void showCart() {

        if (cart.isEmpty()) {
            System.out.println("Cart is empty");
            return;
        }

        System.out.println("Cart Items:");
        for (String name : cart.keySet()) {
            System.out.println(name + " : " + cart.get(name));
        }
    }

    // Calculate total
    public int getTotal(HashMap<String, Integer> price) {

        int total = 0;

        for (String name : cart.keySet()) {
            total += price.get(name) * cart.get(name);
        }

        return total;
    }
}
