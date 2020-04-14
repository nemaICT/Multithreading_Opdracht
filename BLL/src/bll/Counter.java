package bll;

public class Counter extends Thread {

        public Counter(String str)
        {
            super(str);
        }

    @Override
    public void run(){

        for (int i = 1; i <= 100; i++) {
            System.out.println("Loop " + i + ": " + getName());
            try {
                sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("-----------------------");
        System.out.println(getName() + " has finished");
        System.out.println("-----------------------");
   }

}
