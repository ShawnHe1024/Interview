package pers.shawn.interview.concurrent.volatileModifier;

public class Volatile implements Runnable {

    private int value;
    private volatile boolean missedIt;
    private long creationTime;

    public Volatile() {
        value = 10;
        missedIt = false;
        creationTime = System.currentTimeMillis();
    }

    @Override
    public void run() {
        print("entering run()");
        while (value < 20) {
            if (missedIt) {
                int current = value;
                Object lock = new Object();
                synchronized (lock) {

                }
                int valueAfterSync = value;
                print("in run() - see value=" + current + ", but rumor has it that it changed!");
                print("in run() - valueAfterSync=" + valueAfterSync);
                break;
            }
        }
        print("leaving run()");
    }

    public void workMethod() throws InterruptedException {
        print("entering workMethod()");
        print("in workMethod() - about to sleep for 2 seconds");
        Thread.sleep(2000);
        missedIt = true;
//        value = 50;
        print("in workMethod() - just set value=" + value);
        print("in workMethod() - about to sleep for 5 seconds");
        Thread.sleep(5000);
//        missedIt = true;
        value = 50;
        print("in workMethod() - just set missedIt=" + missedIt);
        print("in workMethod() - about to sleep for 3 seconds");
        Thread.sleep(3000);
        print("leaving workMethod()");
    }

    private void print(String msg) {
        long interval = System.currentTimeMillis() - creationTime;
        String tmpStr = "   " + (interval/1000.0) + "000";
        int pos = tmpStr.indexOf(".");
        String secStr = tmpStr.substring(pos-2, pos+4);
        String nameStr = "  " + Thread.currentThread().getName();
//        nameStr = nameStr.substring(nameStr.length()-8, nameStr.length());
        System.out.println(secStr + " " + nameStr + ": " + msg);
    }

}
