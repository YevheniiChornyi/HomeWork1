package LambdaHW.lesson2;

@FunctionalInterface
public interface CarCondition<T> {
    public boolean test(T t);
}
