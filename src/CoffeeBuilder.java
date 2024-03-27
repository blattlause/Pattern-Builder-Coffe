public class CoffeeBuilder implements CoffeeBuilderInterface{
    private String type;
    private boolean doubleCoffe;
    private boolean coffee;
    private boolean milk;
    private boolean cream;
    private boolean sugar;
    private boolean cinnamon;
    private boolean syrup;

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void addDoubleCoffe() {
        this.doubleCoffe = true;
    }

    @Override
    public void addMilk() {
        this.milk = true;
    }

    @Override
    public void addCoffee() {
        this.coffee = true;
    }

    @Override
    public void addSugar() {
        this.sugar = true;
    }

    @Override
    public void addCream() {
        this.cream = true;
    }

    @Override
    public void addCinnamon() {
        this.cinnamon = true;
    }

    @Override
    public void addSyrup() {
        this.syrup = true;
    }

    @Override
    public Coffee build() {
        return new Coffee(type, coffee, doubleCoffe,  milk, cream, sugar, cinnamon, syrup);
    }

    @Override
    public CoffeeBuilderInterface reset() {
        this.type = null; 
        this.doubleCoffe = false;
        this.coffee = false;
        this.milk = false;
        this.cream = false;
        this.sugar = false;
        this.cinnamon = false;
        this.syrup = false;
        return this;
    }
}
