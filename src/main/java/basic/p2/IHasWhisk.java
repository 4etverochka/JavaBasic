package basic.p2;

public interface IHasWhisk {
    public int getNum();

    public default int getInt() {
        return  10;
    }

    static int calculate() {
        return 100 + 1111;
    }
}
