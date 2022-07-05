//package RK;
//
//import java.util.Arrays;
//
//public class RK01 {
//        public int maximumUnits(int[]boxes, int[] unitPerBox, int truckSize) {
//
//            Arrays.sort(boxes, unitPerBox -> boxes[1] - unitPerBox[1]);
//
//            int MaxUnit = 0; for (int[] b : B) {
//
//                int count = Math.min(b[0], truckSize);
//
//                MaxUnit += count * b[1];
//
//                truckSize -= count;
//
//                if (truckSize == 0)
//                    return MaxUnit;
//
//            } return MaxUnit; } }
//
