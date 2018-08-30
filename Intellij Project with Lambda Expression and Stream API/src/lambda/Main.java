package lambda;

public class Main {
    public static void main(String[] args) {
        MyNumber myNumber = () -> 1.2;
        System.out.println( myNumber.getValue() );

        myNumber = () -> Math.random() * 100;
        System.out.println( myNumber.getValue() );

        NumericTest isEven = (n) -> ( (n & 1) ==0);
        System.out.println( isEven.test(1) );
        System.out.println( isEven.test(2) );

        NumericTest isNonNeg = (n) -> (n>=0);
        System.out.println( isNonNeg.test(1) );
        System.out.println( isNonNeg.test(-1) );
    }
}
