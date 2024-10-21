package Comparision;

public class Product implements Comparable<Product> {
    
    public String name;
    public double price;
    public double rating;
    public int quantity;

    public Product(String name, double price, double rating, int quantity){

        this.name = name;
        this.price = price;
        this.rating = rating;
        this.quantity = quantity;

    }

    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }

    public double getRating(){
        return this.rating;
    }

    public int getQuantity(){
        return this.quantity;
    }

    @Override
    public int compareTo(Product comparedProduct) {

        return Double.compare( this.getPrice(), comparedProduct.getPrice());

    }
}
