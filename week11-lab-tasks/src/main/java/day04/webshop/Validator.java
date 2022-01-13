package day04.webshop;

import java.util.List;

public class Validator {

    public static boolean isBlank(String s){
        return s == null || s.strip().equals("");
    }
    public static boolean isEmpty(List<Object> l){
        return l==null|| l.isEmpty();
    }
}
