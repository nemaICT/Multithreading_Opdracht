package runApp;

import bll.Counter;

import java.util.ArrayList;
import java.util.List;

public class ThreadExecutor implements ThreadExecuterble {

    // create list of counters
    private List<Counter> counters = new ArrayList<>();

    @Override
    public void runApp() {

       // fill in list with five counter objects
        int count = 1;
        while(count <= 5)
        {
            counters.add(new Counter("Counter " + count));
            count++;
        }
        // initialise and start threads
        System.out.println("Starting threads");
        for (Counter counter:counters) {
            Thread thread = new Thread(counter);
            thread.start();
        }
//        // create threads
//        Thread thread1 = new Thread(new Counter("Counter 1"));
//        Thread thread2 = new Thread(new Counter("Counter 2"));
//        Thread thread3 = new Thread(new Counter("Counter 3"));
//        Thread thread4 = new Thread(new Counter("Counter 4"));
//        Thread thread5 = new Thread(new Counter("Counter 5"));
//
//        thread1.start();
//        thread2.start();
//        thread3.start();
//        thread4.start();
//        thread5.start();
    }
}
