package streamAPI_2;

public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener anotherListener = System.out::println;

        Worker worker = new Worker(listener, anotherListener);
        worker.start();
    }
}