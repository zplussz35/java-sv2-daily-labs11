package day04.webshop;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<Item> boughtItems;
    private double balance;

    public User(String name, int balance) {
        this.name = name;
        this.balance = balance;
        this.boughtItems=new ArrayList<>();
    }

    public void buyItem(Item item){
        if(item.getPrice()<=balance){
            balance-=item.getPrice();
            boughtItems.add(item);
        }
        else{
            throw new IllegalStateException("Too expensive for you!");
        }
    }

    public String getName() {
        return name;
    }

    public List<Item> getBoughtItems() {
        return boughtItems;
    }

    public double getBalance() {
        return balance;
    }
}
