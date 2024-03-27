public class App {
    public static void main(String[] args) throws Exception {
        CoffeeBuilder builder = new CoffeeBuilder();
        Barista barista = new Barista(builder);

        barista.makeCoffeeCappuccino();
        Coffee cappuccino = barista.getCoffee();
        System.out.println("Ordered Coffee: " + cappuccino.getType());
        recipe(cappuccino);

        barista.makeCoffeeLatte();
        Coffee latte = barista.getCoffee();
        System.out.println("Ordered Coffee: " + latte.getType());
        recipe(latte);

        barista.makeCoffeeEspresso();
        Coffee espresso = barista.getCoffee();
        System.out.println("Ordered Coffee: " + espresso.getType());
        recipe(espresso);
    }
    public static void recipe(Coffee coffee)
    {
        System.out.println("Coffe: " + coffee.hasCoffee() + ", Double coffe: " + coffee.hasDouble() + ", Milk: " + coffee.hasMilk()
         + ", Sugar: " + coffee.hasSugar() + ", Cream: " + coffee.hasCream() + ", Cinnamon: " + coffee.hasCinnamon() + ", Syrup: " + coffee.hasSyrup());
    }
}
