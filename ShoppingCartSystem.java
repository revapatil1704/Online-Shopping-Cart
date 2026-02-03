package ShoppingCart;

import java.util.HashMap;
import java.util.Scanner;

public class ShoppingCartSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> price = new HashMap<>();
        price.put("book", 50);
        price.put("pen", 10);
        price.put("pencil", 5);
        price.put("eraser", 3);

        Cart cart = new Cart();

        while (true) {

            System.out.println("\n1. Show Items");
            System.out.println("2. Add Item");
            System.out.println("3. Show Cart");
            System.out.println("4. Calculate Total");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Available Items:");
                    for (String item : price.keySet()) {
                        System.out.println(item + " : " + price.get(item));
                    }
                    break;

                case 2:
                    System.out.print("Enter item name: ");
                    String name = sc.next();

                    System.out.print("Enter quantity: ");
                    int qty = sc.nextInt();

                    cart.addItem(name, qty, price);
                    break;

                case 3:
                    cart.showCart();
                    break;

                case 4:
                    System.out.println("Total Amount = " + cart.getTotal(price));
                    break;

                case 5:
                    System.out.println("Thank You!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
