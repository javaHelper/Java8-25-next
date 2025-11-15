package com.example.sec03;

public class RecordPatterns {

    public static void main(String[] args) {
        var apple = new FoodItem("Apple", 0.99);
        var water = new DrinkItem("Water", 1.29);

        printDetails(apple);
        printDetails(water);

        System.out.println("============");
        printDetails_with_21(apple);
        printDetails_with_21(water);
    }

    private static void printDetails(Item item) {
        if (item instanceof FoodItem foodItem) {
            var name = foodItem.name();
            var price = foodItem.price();
            System.out.println(STR."Food Item with name \{name} hass price \{price}");
        } else if (item instanceof DrinkItem drinkItem) {
            var name = drinkItem.name();
            var price = drinkItem.price();
            System.out.println(STR."Drink Item with name \{name} hass price \{price}");
        }
    }

    private static void printDetails_with_21(Item item) {
        if (item instanceof FoodItem(var name, var price)) {
            System.out.println(STR."Food Item with name \{name} hass price \{price}");
        } else if (item instanceof DrinkItem(var name, var price)) {
            System.out.println(STR."Drink Item with name \{name} hass price \{price}");
        }
    }
}
