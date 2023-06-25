package RK;

import java.util.HashMap;

public class RK02 {
    public static void main(String[] args) {
        String[][] product = {{"10", "d01", "d1"}, {"15", "EMPTY", "EMPTY"}, {"20", "d1", "EMPTY"}};
        String discount[][] = {{"d01", "1", "27"}, {"d1", "2", "5"}};
        System.out.println(totalPrice(product, discount));
    }

    static class Rule {

        int type, amount;

        Rule(int  type, int amount) {
            this.type = type;
            this.amount = amount;
        }
    }

    public static int totalPrice(String[][] product, String[][] discount) {

        HashMap<String, Rule> rule = new HashMap<String, Rule>();
        for(int i =0; i<discount.length;i++){
            String key = discount[i][0];
            int type = Integer.parseInt(discount[i][1]);
            int amount = Integer.parseInt(discount[i][2]);
            rule.put(key, new Rule(type, amount));
        }

        int totalPrice = 0;
        int disPrice = 0;
        int min = 0;
        for(int i = 0; i<product.length; i++){
            int price = Integer.parseInt(product[i][0]);
            min = price;
            disPrice = price;
                for(int j = 1; j < product[i].length; j++){
                    if(!product[i][j].equals("EMPTY")){
                    Rule tag = rule.get(product[i][j]);
                    System.out.println(i);
                    if(tag.type == 0){
                        disPrice = tag.amount;

                    }if(tag.type == 1){
                        disPrice = price * (1-tag.amount/100);
                        System.out.println((1-tag.amount/100));

                    }if (tag.type == 2){
                        disPrice = price - tag.amount;

                    }
                    min = Math.min(min, disPrice);
                    System.out.println("min = "+ min);
                    }
            }totalPrice =  totalPrice+min;
        }
        System.out.println(totalPrice);
        return totalPrice;
    }
}

