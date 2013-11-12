/**
 * Created with IntelliJ IDEA.
 * User: teri
 * Date: 12.11.13
 * Time: 20:40
 * To change this template use File | Settings | File Templates.
 */
public class MeinThread implements Runnable{
    public synchronized void run(){
        for (int i=0;i<10;i++)
            System.out.println(i);
    }

    public static void main(String[] args){
        Thread t0=new Thread(new MeinThread());
        t0.start();
        Thread t1=new Thread(new MeinThread());
        t1.start();
    }
}
