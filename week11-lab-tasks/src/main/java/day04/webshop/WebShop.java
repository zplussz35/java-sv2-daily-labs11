package day04.webshop;

import java.util.ArrayList;
import java.util.List;

public class WebShop {
    private List<Item> items;
    private List<User> users;

    public WebShop(List<Item> items, List<User> users) {
        this.items = items;
        this.users = users;
    }

    public void buy(String userName, String itemName){
        if(Validator.isBlank(userName)||Validator.isBlank(itemName)){
            throw new IllegalArgumentException("You should give an username and an utemname!");
        }
        for (User user:users) {
            if(user.getName().equals(userName)){
                for (Item item:items) {
                    selectBuy(user,item,itemName);
                }
            }
        }
    }

    private void selectBuy(User user,Item item,String itemName){
        if(item.getName().equals(itemName)){
            if(item instanceof Product){
                if(user.getBalance()>=3*item.getPrice()){
                    Product product = (Product) item.copy();
                    product.growPrice(10);
                    product.addExtraExpDate(33);
                    user.buyItem(product);
                }
                else{
                    user.buyItem(item.copy());
                }
            }
            else{
                user.buyItem(item.copy());
            }
        }
    }

}
