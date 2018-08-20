package org.andestech.learning.rfb18;

import java.util.*;

public class HashDicApp {

    public static void main(String[] args)
    {

      HashSet<Integer> set1 = new HashSet<>();
      set1.add(123);
      set1.add(123);
      set1.add(333);

      for(int i: set1)
      {
          System.out.println(i);
      }

        System.out.println(set1);
//... remove dublicates


        LinkedList<Byte> LB =
                new LinkedList<>();

      LB.add((byte)12);
        LB.add((byte)12);
        LB.add((byte)-33);
        LB.add((byte)1);
        System.out.println("Init list: " + LB);


      LB = new LinkedList<>(
              new LinkedHashSet<>(LB)
      );

      System.out.println("Corrected list: " + LB);

     // Dictionary

     HashMap<Integer,Book> map;
     map = new HashMap<>();


     map.put(12,new Book("Auth 01"));
        map.put(-2332,new Book("Auth 03"));
        map.put(1333,new Book("Auth 0441"));
        map.put(-77313,new Book("Auth 881"));
        map.put(98712,new Book("Auth 789901"));
        map.put(12,new Book("Auth 01r444"));

        System.out.println(map);

        System.out.println(map.keySet());
        System.out.println(map.values());

        for(int k: map.keySet())
        {
            Book data = map.get(k);
            //...
            System.out.println(data);
        }




    }
}
