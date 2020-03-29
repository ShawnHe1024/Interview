package DesignPattern.IteratorPattern.JDKIterator.Iterator;

import DesignPattern.IteratorPattern.JDKIterator.Restaurant.MenuItem;

import java.util.Iterator;

public class DinerIterator implements Iterator {

    MenuItem[] menuItems;
    int position = 0;

    public DinerIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.length || menuItems[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        return menuItems[position++];
    }

}
