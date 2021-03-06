package pers.shawn.interview.designPattern.factory.pizzaIngredient;

import pers.shawn.interview.designPattern.factory.pizzaIngredient.pizza.Pizza;
import pers.shawn.interview.designPattern.factory.pizzaIngredient.store.NYPizzaStore;
import pers.shawn.interview.designPattern.factory.pizzaIngredient.store.PizzaStore;

/**
 * 抽象工厂模式, 用来创建一个产品家族,
 */
public class PizzaTest {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("A: " + pizza.getName() + "\n");

    }

}
