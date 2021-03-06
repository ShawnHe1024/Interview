package pers.shawn.interview.designPattern.composite.iterator;

import pers.shawn.interview.designPattern.composite.menu.Menu;
import pers.shawn.interview.designPattern.composite.menu.MenuComponent;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {

    Stack<Iterator> stack = new Stack();

    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.isEmpty()) {
            return false;
        } else {
            Iterator iterator = stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }

    @Override
    public Object next() {
        if (hasNext()) {
            Iterator iterator = stack.peek();
            MenuComponent component = (MenuComponent) iterator.next();
            if (component instanceof Menu) {
                stack.push(component.createIterator());
            }
            return component;
        } else {
            return null;
        }
    }
}
