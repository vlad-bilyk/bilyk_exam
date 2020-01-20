package restaurant;

import food.Food;

public class Restaurant {

    public String getName() {
        return name;
    }

    private String name;
    private Menu menu;

    public Restaurant(String name) {
        this.name = name;
        menu = new Menu();
    }

    public void addItemToMenu(Food item, int price) {
        menu.add(item, price);
        System.out.println(item.toString() + "was added to menu.");
    }

    public void removeItemFromMenu(Food item) {
        menu.remove(item);
        System.out.println(item.toString() + "was removed from menu");
    }

    public void changeItemPrice(Food item, int newPrice) {
        int oldPrice = menu.getPrice(item);
        menu.changePrice(item, newPrice);
        System.out.println(item.toString() + "price: " + oldPrice
                + " -> " + newPrice);
    }

    public int getItemPrice(Food item) {
        return menu.getPrice(item);
    }

    public Food getItemFromMenuByName(String name) {
        return menu.getItemByName(name);
    }

    public String showMenu() {
        return menu.toString();
    }
}
