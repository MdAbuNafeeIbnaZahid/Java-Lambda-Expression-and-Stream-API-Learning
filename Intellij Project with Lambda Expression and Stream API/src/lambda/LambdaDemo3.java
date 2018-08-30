package lambda;

public class LambdaDemo3 {
    public static void main(String[] args) {
        NumericTest2 isFactor = (int n, int d) -> ((n%d)==0);

        System.out.println( isFactor.test(10, 2) );
        System.out.println( isFactor.test(10, 3) );

        NumericFunc factGetter = (int i) -> {
            int ret = 1;
            for (int a = 1; a <= i; a++)
            {
                ret *= a;
            }
            return ret;
        };

        System.out.println( factGetter.func(4) );
    }
}
