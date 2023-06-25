package RK;

import java.sql.Array;
import java.util.*;

public class RK03 {
    public static void main(String[] args) {
        List<Integer> inventory = new ArrayList<Integer>(Arrays.asList(2,8,4,10,6));
        long order = 20;
        System.out.println(maximumProfit(inventory, order));
    }

    public static long maximumProfit(List inventory, long order){
        inventory.sort(Comparator.reverseOrder());
        int maxUnit = 0;
        int profit = 0;
        for(int i = 0; i < order; i++){
            maxUnit = (int) Collections.max(inventory);
//            long resOrder =  order;

                profit += maxUnit;
                System.out.println("profit = " + profit);
                inventory.set(0, maxUnit-1);
                inventory.sort(Comparator.reverseOrder());
//                resOrder = resOrder-1;
//                System.out.println("resorder = " + resOrder);
                System.out.println(inventory);


            }


        return profit;
    }
}
