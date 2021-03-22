package ConcurrencyHW.lesson3;

public class Sequence {

    private int value = 0;

    public int getNext(){
        synchronized (this) {
            value = value + 1;
            return value;
        }
    }
}
