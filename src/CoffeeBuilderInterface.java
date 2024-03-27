public interface CoffeeBuilderInterface {
    void setType(String type);
    void addDoubleCoffe();
    void addCoffee();
    void addMilk();
    void addSugar();
    void addCream();
    void addCinnamon();
    void addSyrup();
    CoffeeBuilderInterface reset();
    Coffee build();
} 
