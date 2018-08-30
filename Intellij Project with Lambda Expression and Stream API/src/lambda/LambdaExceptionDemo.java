package lambda;

import util.EmptyArrayException;

public class LambdaExceptionDemo {
    public static void main(String[] args) throws EmptyArrayException {

        DoubleNumericArrayFunc avg = (ar ->
        {
            if (ar.length == 0)
            {
                throw new EmptyArrayException();
            }

            double sum = 0;
            for (double d : ar)
            {
                sum += d;
            }
            return sum / ar.length;
        }
        );

        double[] values = {1, 2, 3, 4, 5};
        System.out.println( avg.func(values) );
        System.out.println( avg.func(new double[0]) );
    }
}
