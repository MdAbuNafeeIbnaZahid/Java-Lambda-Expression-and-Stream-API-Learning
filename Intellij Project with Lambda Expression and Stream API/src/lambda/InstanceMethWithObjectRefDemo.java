package lambda;

interface MyInterface
{
    public boolean func(HighTemp ht1, HighTemp ht2);
}

public class InstanceMethWithObjectRefDemo {
    static <T> int count(T[] values, MyFunc<T> f, T v)
    {
        int ret = 0;
        for (T value : values)
        {
            if ( f.func(value, v) )
            {
                ret++;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        HighTemp[] weekDaysHighs = {new HighTemp(89), new HighTemp(82),
                new HighTemp(90), new HighTemp(89),
                new HighTemp(89), new HighTemp(91),
                new HighTemp(84), new HighTemp(83)
        };

        int countOfDays;

        countOfDays = count(weekDaysHighs, HighTemp::sameTemp, new HighTemp(89));
        System.out.println(countOfDays);

        countOfDays = count(weekDaysHighs, HighTemp::lessThanTemp, new HighTemp(90));
        System.out.println(countOfDays);

        MyInterface myInterface = HighTemp::lessThanTemp;
        System.out.println( myInterface.func(new HighTemp(90), new HighTemp(89)) );
    }
}
