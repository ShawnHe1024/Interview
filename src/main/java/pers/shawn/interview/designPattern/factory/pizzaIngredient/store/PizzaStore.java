package pers.shawn.interview.designPattern.factory.pizzaIngredient.store;

import pers.shawn.interview.designPattern.factory.pizzaIngredient.pizza.Pizza;

public abstract class PizzaStore {

    abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
