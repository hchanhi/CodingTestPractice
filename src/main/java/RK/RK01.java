package RK;

import java.util.Arrays;

public class RK01 {
    public static void main(String[] args) {

        int[] boxes = new int[]{1, 1};
        int[] unitPerBox = new int[]{9, 6};
        int truckSize = 1;
        System.out.println(maxUnits(boxes, unitPerBox,truckSize));
    }

        static int maxUnits(int [] boxes, int[] unitPerBox, int truckSize){

            int maxUnit = 0;
            int index = 0;
            int max = 0;
            for(int i = 0; i<truckSize; i++){
                for(int j = 0; j<unitPerBox.length; j++){
                    if(unitPerBox[j]>maxUnit){
                        maxUnit = unitPerBox[j];
                        index = j;
                    }
                }
                if(truckSize < boxes[index]){
                    boxes[index] = truckSize;
                }
                max = max + maxUnit * boxes[index];
                truckSize = truckSize - boxes[index];
                unitPerBox[index] = 0;
                maxUnit = 0;
            }
            return max;
    }
}





