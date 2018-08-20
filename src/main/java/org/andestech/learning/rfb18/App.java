package org.andestech.learning.rfb18;

//import java.util.*;
import java.util.*;


import java.util.ArrayList;

class Library
{
   // private ArrayList<Book> books;
   private static ArrayList<Book> books =
           new ArrayList<>(10);

    public Library(){

        ///.....
      //  books = new ArrayList<>(10);

    }



}

class Book{

    private String data;


    Book(String data) {
        this.data = data;
    }

    public String toString(){

        return "Book: " + data;
    }
}


public class App
{
    public static void main( String[] args )
    {

       // ArrayList<String> codes =
          List<String> codes =
          new ArrayList<>(20);

        codes.add("JHGSJHG");
        codes.add("11JHGSJHG");
        codes.add("22JHGSJHG");

        for(String s: codes)
        {
            //...
            System.out.println(s);
        }

        List<String> codes2 =
                new LinkedList<>();

        codes2.add("LL-JHGSJHG");
        codes2.add("LL_11JHGSJHG");
        codes2.add("LL-22JHGSJHG");

        int i =0;
        for(String s: codes2)
        {
            codes2.set(i, s.toLowerCase());
            i++;
        }


        for(int j=0; j<codes2.size(); j++)
        {
            codes2.set(j, "+++" + codes2.get(j));

        }


        for(String s: codes2)
        {
            //...
            System.out.println(s);
        }

        Iterator<String> it1 =  codes.iterator();
        while(it1.hasNext())
        {
            System.out.println(it1.next());
        }

    // init

        ArrayList<String> codes3 =

           new ArrayList<>( Arrays.asList(
                   new String[]{"AA","BB","CC","DD"}

           )  );

        System.out.println(codes3);

        ArrayList<Book> codes4 =

                new ArrayList<>( Arrays.asList(
                        new Book[]{new Book("data1"),
                                new Book("data1"),
                                new Book("data1"),new Book("data1")}

                )  );

        System.out.println(codes4);



    }
}
