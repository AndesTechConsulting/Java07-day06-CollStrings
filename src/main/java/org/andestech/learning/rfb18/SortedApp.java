package org.andestech.learning.rfb18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortedApp {

    public static void main(String[] s)
    {

        Double[] arr1 = {
        -12.11, 0.0, 23.0, 1000.1, -34.0, 34.0, 999.0
        };

        ArrayList<Double> list1 =
                new ArrayList<>( Arrays.asList(arr1));


        System.out.println(list1);

        list1.sort(new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return (int)(o1 - o2);
            }
        });

        list1.sort(new MySort());

        list1.sort((a,b)-> (int)((b - a)*100));

        list1.sort(new MySortAbs());

        //Collections.sort(list1);
        //Collections.reverse( list1);

        System.out.println(list1);

// Sort array

        int[] arr2 = {1,-200,1,33,4,45,-3333,556,23,0,33};

        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr2));


    }

}

class MySort implements Comparator<Double> {

//public boolean equals(Object o)
//{return true;}

    @Override
public int compare(Double o1, Double o2) {
        return (int)(o2 - o1);
        }
        }

class MySortAbs implements Comparator<Double> {

//public boolean equals(Object o)
//{return true;}

    @Override
    public int compare(Double o1, Double o2) {
        return (int)(Math.abs(o1) - Math.abs(o2));
    }
}