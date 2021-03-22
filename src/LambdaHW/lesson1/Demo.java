package LambdaHW.lesson1;

public class Demo {

    public static void main(String[] args) {
        Human tom = new Human();
        walker(tom);

        Robot wale = new Robot();
        walker(wale);

        Walkable walk = () -> System.out.println("Custom object walking...");
        walker(walk);

        ALambda helloVar = () -> System.out.println("Hello There");
        Calculate sumVar = (a,b) -> a+b;
        System.out.println(sumVar.compute(4,6));

        StringWorker<String> reverser = (s) ->  {
            String result = "";
            for (int i = s.length() - 1; i >= 0; i--){
                result += s.charAt(i);
            }
            return result;
        };
        System.out.println(reverser.work("Vehicle"));
    }

    public static void walker(Walkable walkableEntity){
        walkableEntity.walk();
    }
}
interface Calculate{
    int compute(int a, int b);
}

interface StringWorker<T>{
    T work(T str);
}