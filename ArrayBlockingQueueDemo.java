import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
public class ArrayBlockingQueueDemo
{
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> Abq = new ArrayBlockingQueue<Integer>(5);
        Abq.add(10);
        Abq.add(20);
        Abq.add(40);
        Abq.add(30);
        Abq.add(50);
        // Abq.add(60);
        System.out.println(Abq);
        boolean cheak = Abq.remove(2);
        System.out.println("removing item is " +cheak);
        System.out.println("peak element is " +Abq.peek());
    }
}
