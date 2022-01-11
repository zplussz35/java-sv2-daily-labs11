package day02;

import java.util.List;

public class Hiking {
    int getPlusElevation(List<Integer> heights){
        if(heights.size()<2){
            return 0;
        }
        int szum=0;
        for (int i = 1; i <heights.size() ; i++) {
            if(heights.get(i)>heights.get(i-1)){
                szum+=heights.get(i)-heights.get(i-1);
            }
        }
        return szum;
    }
}
