package restaurant;

import food.Dish;
import food.Drink;
import food.Food;

import java.util.HashMap;

public class Menu {

    private HashMap<Food, Integer> storage;

    public Menu() {
        storage = new HashMap<Food, Integer>();
    }

    public void add(Food item, int price) {
        if (storage.containsKey(item)) {
            throw new IllegalArgumentException("This item is " +
                    "already in the menu");
        }

        storage.put(item, price);
    }

    public void remove(Food item) {
        if (!storage.containsKey(item)) {
            throw new IllegalArgumentException("This item is not on the menu");
        }

        storage.remove(item);
    }

    public void changePrice(Food item, int newPrice) {
        if (!storage.containsKey(item)) {
            throw new IllegalArgumentException("This item is not on the menu");
        }

        storage.replace(item, newPrice);
    }

    public int getPrice(Food item) {
        if (!storage.containsKey(item)) {
            throw new IllegalArgumentException("This item is not on the menu");
        }

        return storage.get(item);
    }

    public Food getItemByName(String name) {
        Food itemFound = null;

        for (Food item: storage.keySet()) {
            if (item.getName().equals(name)){
                itemFound = item;
            }
        }
        if (itemFound == null) {
            throw new IllegalArgumentException("Item not found in the menu");
        }
        return itemFound;
    }


    @Override
    public String toString() {
        return storage.toString();
    }

}
