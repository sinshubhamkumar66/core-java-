import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

import org.omg.PortableInterceptor.INACTIVE;

public class AbstractQueueDemo {
    public static void main(String[] args) {
        AbstractQueue<Integer> AQ = new LinkedBlockingQueue<Integer>();
        AQ.add(10);
        AQ.add(20);
        AQ.add(30);
        AQ.add(40);
        AQ.add(50);
        System.out.println(AQ);
        System.out.println(AQ.remove(3));
        int id = AQ.remove();
        System.out.println(id);
        System.out.println(AQ);

    }
    
}