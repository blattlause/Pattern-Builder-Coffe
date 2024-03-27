public class Coffee {
    private String type;
    private boolean doubleCoffee;
    private boolean coffee;
    private boolean milk;
    private boolean cream;
    private boolean sugar;
    private boolean cinnamon;
    private boolean syrup;

    public Coffee(String type, boolean coffee, boolean doubleCoffee, boolean milk, boolean cream, boolean sugar, boolean cinnamon, boolean syrup) {
        this.type = type;
        this.coffee = coffee;
        this.doubleCoffee = doubleCoffee;
        this.milk = milk;
        this.cream = cream;
        this.sugar = sugar;
        this.cinnamon = cinnamon;
        this.syrup = syrup;
    }
    

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean hasCoffee() {
        return coffee;
    }

    public void setCoffee(boolean coffee) {
        this.coffee = coffee;
    }

    public boolean hasMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean hasDouble() {
        return doubleCoffee;
    }

    public void setDouble(boolean doubleCoffe) {
        this.doubleCoffee = doubleCoffe;
    }

    public boolean hasCream() {
        return cream;
    }

    public void setCream(boolean cream) {
        this.cream = cream;
    }

    public boolean hasSugar() {
        return sugar;
    }

    public void setSugar(boolean sugar) {
        this.sugar = sugar;
    }

    public boolean hasCinnamon() {
        return cinnamon;
    }

    public void setCinnamon(boolean cinnamon) {
        this.cinnamon = cinnamon;
    }

    public boolean hasSyrup() {
        return syrup;
    }

    public void setSyrup(boolean syrup) {
        this.syrup = syrup;
    }

}
