package day04.webshop;

import java.time.LocalDate;

public class Product extends Item{

    private final int PLUS_MONTH =3;

    public Product(String name, double price) {
        super(name, price);
        setExpDate();
    }
    public Product(String name){
        super(name);
    }

    @Override
    protected void setExpDate() {
        expDate= LocalDate.now().plusMonths(PLUS_MONTH);
    }

    @Override
    protected Item copy() {
        return new Product(name,price);
    }

    public void addExtraExpDate(int plusMonth){
        expDate= expDate.plusMonths(plusMonth);
    }
    public void growPrice(int percent){
        price+=price*(percent*1.0/100.0);
    }
}
