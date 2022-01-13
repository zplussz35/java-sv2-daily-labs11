package day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {
    private int numberCount;
    private int numberOfPulled;

    public Lottery(int numberCount, int numberOfPulled) {
        this.numberCount = numberCount;
        this.numberOfPulled = numberOfPulled;
    }

    public List<Integer> startLottery(){
        Random r = new Random();
        List<Integer> result= new ArrayList<>();
        int i=numberOfPulled;
        while(i>0){
            int num=r.nextInt(1,numberCount+1);
            if(!result.contains(num)){
                result.add(num);
                i--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Lottery l = new Lottery(90,6);
        System.out.println(l.startLottery());
    }

}
