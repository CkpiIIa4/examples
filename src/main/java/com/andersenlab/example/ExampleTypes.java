package com.andersenlab.example;

public class ExampleTypes {
    public String string;

    public static void main(String[] args) {
        String a = new String("abcde");
        String b = new String("abcde");
        System.out.println("2 identical strings");

        if ( a == b )
            System.out.println(" a == b - TRUE" );
        else
            System.out.println(" a == b - FALSE");

        if ( a.equals(b) )
            System.out.println(" a == b -- TRUE" );
        else
            System.out.println(" a == b -- FALSE");

        String c = "abcd";
        String d = "abcd";
        System.out.println("1 string equals to both");

        if ( c == d )
            System.out.println(" c == d - TRUE" );
        else
            System.out.println(" c == d - FALSE");

        if ( c.equals(d) )
            System.out.println(" c == d - TRUE" );
        else
            System.out.println(" c == d - FALSE");

        int hCode1 = a.hashCode();
        int hCode2 = b.hashCode();

        int hCode3 = c.hashCode();
        int hCode4 = d.hashCode();

        System.out.println("2 identical strings - " + hCode1 + "   " + hCode2);
        System.out.println("1 string equal to both - " + hCode3 + "   " + hCode4);
    }

}
