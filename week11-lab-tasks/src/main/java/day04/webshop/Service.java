package day04.webshop;

import java.time.LocalDate;

public class Service extends Item{

    private final int PLUS_MONTH =12;

    public Service(String name, double price) {
        super(name, price);
        setExpDate();
    }
    public Service(String name){
        super(name);
    }

    @Override
    protected void setExpDate() {
        expDate= LocalDate.now().plusMonths(PLUS_MONTH);
    }

    @Override
    protected Item copy() {
        return new Service(name,price);
    }
}
