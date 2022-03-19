package arrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    static int getMaxValue(int [] niz){
        int max = niz[0];
        for (int i = 1; i < niz.length; i++) {
            if (niz[i] > max){
                max = niz[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {


        int [] niz = new int[]{55,25,80,32,66};

        for (int i = 2; i < niz.length - 1; i++) {}

        int maxValue = getMaxValue(niz);

        Arrays.sort(niz);
        System.out.println(niz[0]);
        System.out.println(niz[niz.length - 1]);


//        int max = niz[0];
//        for (int i = 1; i < niz.length; i++) {
//            if (niz[i] < max){
//                max = niz[i];
//            }
//        }
        //System.out.println(maxValue);







//
//        for(int a:niz){
//            System.out.println(a);
//        }

        int [][] niz2d = new int[][]{
                {1,2,8},
                {3,4,10},
                {5,6,15}
        };

//        for (int [] a: niz2d) {
//            for ( int b: a) {
//                System.out.print(b + " ");
//            }
//            System.out.println();
//        }







    }



}
