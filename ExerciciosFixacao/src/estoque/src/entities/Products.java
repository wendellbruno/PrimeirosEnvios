package estoque.src.entities;

public class Products {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStrock(){
        return price*quantity;
    }
    public void addProcuts(int quantity){
        this.quantity+=quantity;
    }
    public void Remove(int quantity){
        this.quantity-=quantity;
    }
    public String toString(){
        return name +
                ", $ "+
                String.format("%.2f", price) +
                ", " +
                quantity +
                " units, Total : $ "+
                totalValueInStrock();
    }
}
