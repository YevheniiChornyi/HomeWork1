package ConcurrencyHW.lesson1;

public class RunnableDemo {

    public static void main(String[] args) {

        System.out.println("Starting Thread 1");
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("number: " + i + " - " + Thread.currentThread().getName());
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t1.start();

        System.out.println("Starting Thread 2");
        Thread t2 = new Thread(new RunTask("Thread-B"));
        t2.start();
    }
}

class RunTask implements Runnable{

    String name;

    public RunTask(String name){
        this.name = name;
    }

    public void run(){
        Thread.currentThread().setName(name);
        for(int i = 0; i < 1000; i++){
            System.out.println("number: " + i + " - " + Thread.currentThread().getName());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}