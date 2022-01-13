package day04.webshop;

import java.time.LocalDate;

public abstract class Item {
    protected String name;
    protected double price;
    protected LocalDate expDate;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Item(String name){
        this.name=name;
        this.expDate=LocalDate.now();
    }




    protected abstract void setExpDate();


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getExpDate() {
        return expDate;
    }
    protected abstract Item copy();
}
