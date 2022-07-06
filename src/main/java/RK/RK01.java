package RK;

import java.util.Arrays;

public class RK01 {

        public int maximumUnits(int[]boxes, int[] unitPerBox, int truckSize) {

            
            int MaxUnit = 0;

            for (int i = 0; i<boxes.length; i++) {

                int count = Math.min(boxes[i], truckSize);

                MaxUnit += count * unitPerBox[i];

                truckSize -= count;

                if (truckSize == 0)
                    return MaxUnit;

                }
                return MaxUnit;
            }
        }

