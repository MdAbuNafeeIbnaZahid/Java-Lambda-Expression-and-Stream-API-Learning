package lambda;

public class LambdaAsArgumentsDemo {
    static String stringOp(StringFunc sf, String s)
    {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "My name is Nafee";
        String outStr;

        outStr = stringOp( (s) -> s.toUpperCase(), inStr );
        System.out.println( outStr );

        StringFunc reverse = (s) -> new StringBuilder(s).reverse().toString();
        outStr = stringOp(reverse, inStr);
        System.out.println( outStr );

        outStr = stringOp( (s) -> {
            return s.replace(" ", "");
        }, inStr );
        System.out.println(outStr);


    }
}
