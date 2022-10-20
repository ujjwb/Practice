

class PrintWorker extends Thread{
    private final static Integer printTill=20;
    private static Integer counter=1;
    String type;
    private Object lock=new Object();


    PrintWorker(String type){
        this.type=type;
    }

    @Override
    public void run(){
        try{
            while(counter <=printTill){
                synchronized (lock){
                    if(shouldWait(type,counter)){
                        lock.wait();
                    }
                    System.out.println(counter);
                    counter++;
                    lock.notifyAll();
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private Boolean shouldWait(String type1,Integer number){
        if(type1.equals("ODD") && number%2==0)
            return true;
        if(type1.equals("EVEN") && number %2!=0)
            return true;
        return false;
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        new PrintWorker("ODD").start();
        new PrintWorker("EVEN").start();

    }
}
