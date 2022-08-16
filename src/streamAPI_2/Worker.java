package streamAPI_2;

public class Worker {

    private final OnTaskDoneListener callback;
    private final OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 0; i < 50; i++) {
            if (i == 33) {
                errorCallback.onError("Task " + i + " has error");
            }
            callback.onDone("Task " + i + " is done");
        }
    }
}