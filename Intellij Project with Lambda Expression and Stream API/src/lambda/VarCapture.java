//package lambda;
//
//public class VarCapture {
//
//    int num = 10;
//
//    void checkEffectiveFinal()
//    {
//        MyFunc myLambda = (n) -> {
//            this.num++;
//            return this.num + n;
//        };
//
//        myLambda.func(1);
//        System.out.println(this.num);
//    }
//
//
//    public static void main(String[] args) {
//
////        num--;
//
//
////        num++;
//
//        VarCapture varCapture = new VarCapture();
//        varCapture.checkEffectiveFinal();
//        varCapture.checkEffectiveFinal();
//    }
//}
