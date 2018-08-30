package lambda;

public class GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {
        SomeFunc<String> reverse = (str) -> {
            String ret = new StringBuilder(str).reverse().toString();
            return ret;
        };
        System.out.println( reverse.func("Hello") );

        SomeFunc<Integer> factorial = (n) -> {
            int ret = 1;
            for (int i = 1; i <= n; i++)
            {
                ret *= i;
            }
            return ret;
        };
        System.out.println( factorial.func(3) );
    }
}
