package pers.shawn.interview.designPattern.iterator.jdk.restaurant;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {

    ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();
        addItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true, 2.99);
        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem item = new MenuItem(name, description, vegetarian, price);
        menuItems.add(item);
    }

    @Override
    public Iterator createIterator() {
        return menuItems.iterator();
    }
}
