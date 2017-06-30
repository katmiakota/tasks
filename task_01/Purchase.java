package by.gsu.epamlab;

import java.util.Date;

public class Purchase {
    private String name;
    private int price;
    private int quantity;
    private int date;

    public Purchase(String name, int price, int quantity, int date) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.date = date;
    }

    public int getDate() {
        return date;
    }

    public int getPrice() {
        return price;
    }


    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  name + ',' + price +
                ',' + quantity +
                ',' + date ;
    }
}
