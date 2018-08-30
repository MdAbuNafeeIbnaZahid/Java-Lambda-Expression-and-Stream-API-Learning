package lambda;



public class MethodRefDemo {
    static String stringOps(StringFunc sf, String s)
    {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Hello";
        String outStr;


        outStr = stringOps(MyStringOps::strReverse, inStr);
        outStr = stringOps(MyStringOps::strReverse, inStr);
        outStr = stringOps(MyStringOps::strReverse, inStr);

        System.out.println( outStr );
        System.out.println( MyStringOps.i );
    }
}
