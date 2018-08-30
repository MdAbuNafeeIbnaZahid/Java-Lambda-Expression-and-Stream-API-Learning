package lambda;

public class BlockLambdaDemo2 {
    public static void main(String[] args) {
        StringFunc reverse = (str) -> {
          String ret = new StringBuilder(str).reverse().toString();
          return ret;
        };

        System.out.println( reverse.func("Hello") );
    }
}
