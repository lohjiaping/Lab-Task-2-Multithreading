package Week_04;

public class Multithreading {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Thread t = new Thread(new NumberPrinter(), "Thread " + i);
            t.start();
        }
    }
}

   class NumberPrinter implements Runnable {
       @Override
       public void run() {
           try {
               for (int i = 0; i <= 5; i++) {
                   System.out.println(Thread.currentThread().getName() + " is printing number: " + i + " from the list");
                   Thread.sleep(1000);
               }
           } catch (InterruptedException e) {
               System.out.println(Thread.currentThread().getName() + " was interrupted.");
           }
       }
   }
