public class Barista {
    private final CoffeeBuilderInterface builder;

    public Barista(CoffeeBuilderInterface builder) {
        this.builder = builder;
    }

    public Coffee  makeCoffeeCappuccino() {
        CoffeeBuilderInterface newBuilder = builder.reset();
        newBuilder.setType("Cappuccino");
        newBuilder.addCoffee();
        newBuilder.addMilk();
        newBuilder.addSugar();
        newBuilder.addCinnamon();
        return newBuilder.build();
    }

    public Coffee  makeCoffeeLatte() {
        CoffeeBuilderInterface newBuilder = builder.reset();
        newBuilder.setType("Latte");
        newBuilder.addCoffee();
        newBuilder.addMilk();
        newBuilder.addSugar();
        newBuilder.addSyrup();
        newBuilder.addCream();
        return newBuilder.build();
    }

    public Coffee  makeCoffeeEspresso() {
        CoffeeBuilderInterface newBuilder = builder.reset();
        newBuilder.setType("Double Espresso");
        newBuilder.addCoffee();
        newBuilder.addDoubleCoffe();
        newBuilder.addMilk();
        return newBuilder.build();
    }

    public Coffee getCoffee() {
        return builder.build();
    }

}
