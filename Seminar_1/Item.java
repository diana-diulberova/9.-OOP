package Seminar_1;

public class Item extends Product{
    private double weight;

    public Item (String name, double price, double weight) {
        super(name, price);
        this.weight = weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void doSmth() {
        System.out.println("Это класс элемент");
        weight +=1;
    }
    
}
