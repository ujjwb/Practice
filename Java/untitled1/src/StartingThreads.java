class Worker extends Thread {
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(i+ ". Hello "+this.getId());
        }
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class RunWorker implements Runnable  {
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(i+ ". Hello ");
        }
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class StartingThreads {
    public static void main(String[] args) {
        Worker w1=new Worker();
        w1.start();
        Worker w2=new Worker();
        w2.start();

        
    }
}