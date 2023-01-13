package Seminar_1;

// Реализую класс Product, т.е. продукт, для вендинговой машины.
public class Product {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void doSmth() {
        System.out.println("Это класс товар");

    }

    public String doSmth (String string) {
        System.out.println("String");
        return "String";
    }

    public String doSmth (Integer string) {
        System.out.println("Integer");
        return "Integer";
    }

    public String doSmth (Object string) {
        System.out.println("Object");
        return "Object";
    }

    public String getName() {
        return name;
    }

    public void SetName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}