package Classwork;

public class Threading {

    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println("Main thread is "+ mainThread.getId());

        Thread t1= new Thread();
        t1.setName("UserThread");
        System.out.println("User thread is "+t1.getId());
        System.out.println("The name of this thread is "+ t1.getName());




    }
}
