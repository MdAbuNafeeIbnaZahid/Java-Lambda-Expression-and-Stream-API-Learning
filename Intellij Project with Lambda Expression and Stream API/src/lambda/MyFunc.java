package lambda;

public interface MyFunc<T> {
    boolean func(T v1, T v2);
}


class HighTemp
{
    private int hTemp;

    public HighTemp(int hTemp) {
        this.hTemp = hTemp;
    }

    public int gethTemp() {
        return hTemp;
    }

    public void sethTemp(int hTemp) {
        this.hTemp = hTemp;
    }

    boolean sameTemp(HighTemp ht2)
    {
        return hTemp == ht2.gethTemp();
    }

    boolean lessThanTemp(HighTemp ht2)
    {
        return hTemp < ht2.gethTemp();
    }
}