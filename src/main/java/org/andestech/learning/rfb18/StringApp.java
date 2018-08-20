package org.andestech.learning.rfb18;

public class StringApp {
    public static void main(String[] args)
    {
        String st1 = "ABC", st2="ABC";

        System.out.println(System.identityHashCode(st1));
        System.out.println(System.identityHashCode(st2));

        String st3 = new String("ABC"),
                st4= new String("ABC");

        System.out.println(System.identityHashCode(st3));
        System.out.println(System.identityHashCode(st4));

        System.identityHashCode(st1);


        String st5 = "qqq";
        st5 = "22112";

        System.out.println(st3==st4); // так сравнивать строки нельзя!!!
        System.out.println(st3.equals(st4) );
        System.out.println(st3.compareTo(st4) );

        //------------------------------------

        String st6 = new String(new char[]{'q','1','3'});
        System.out.println(st6);



    }

}
