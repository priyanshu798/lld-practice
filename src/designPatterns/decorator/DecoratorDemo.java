package designPatterns.decorator;

public class DecoratorDemo {
    static void main() {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription());
        System.out.println(coffee.getCost());

        coffee = new CreamDecorator(coffee);
        System.out.println(coffee.getDescription());
        System.out.println(coffee.getCost());

    }
}
