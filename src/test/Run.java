package test;

public class Run implements Runnable {
    @Override
    public void run() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i < 100; i++) {
                Thread thread = new Thread();
                    System.out.println(i);
                    thread.start();
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
            }
        };
    }
}
