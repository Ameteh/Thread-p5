
public class Interthread961benar {
    public static void main(String args[]) throws Exception {
        SharedData sd = new SharedData();
        new Producer(sd);
        new Consumer(sd);
    }
}