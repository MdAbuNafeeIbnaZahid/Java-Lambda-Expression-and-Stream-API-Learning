package lambda;

public class MyStringOps {

    static int i = 0;

    public static String strReverse(String str)
    {
        i++;
        return new StringBuilder(str).reverse().toString();
    }

    @Override
    public String toString() {
        return "MyStringOps{" +
                "i=" + i +
                '}';
    }
}
