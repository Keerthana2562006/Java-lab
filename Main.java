package sample;

// Child class extends Thread
class Child extends Thread {
    public void run() {
        System.out.println("this is run method");
    }
}

public class Main {
    public static void main(String[] args) { // Correct main method declaration
        Child c = new Child();
        c.start();
    }
}