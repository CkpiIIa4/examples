public class ExampleTypes {
    public static void main(String[] args) {
        short a = 120;
        short b = 543;
        short c= (short)(a + b);
        System.out.println("short - " + "a + b = " + c);

        byte d = 12;
        byte e = 53;
        byte f= (byte)(d + e);
        System.out.println("byte - " + "d + e = " + f);

        int g = 82356;
        int h = 567432;
        int i = h / g;
        System.out.println("int - h / g = " + i);

        long j = 12435467;
        long k = 76856743;
        long m = j * k;
        System.out.println("long  - j * k = " + m);

        float n = 23.054f;
        float o = 11.057f;
        float p = n - o;
        System.out.println("float - n - o = " + p);

        double r = 1.0005674;
        double s = 2.054331;
        double q = s % r;
        System.out.println("double - s % r = " + q);

        boolean t = true;
        boolean u = false;
        System.out.println("boolean - t = " + t + "  u = " + u);

        String s1 = "ab";
        String s2 = "dv" + s1;
        System.out.println(" Composite type ");
        System.out.println("String - s1 = "  + s1 + " s2 = " + s2);

    }
}
