import java.util.HashMap;

import org.omg.PortableInterceptor.INACTIVE;
public class HashMapDemo1 {
    public static void main(String[] args) {
        HashMap<Integer, String>map1 = new HashMap<>();
        //initilization HashMap useing generic
        HashMap<Integer, String>map2 = new HashMap<Integer, String>(map1);
        map1.put(1, "shubham");
        map1.put(2, "rupam");
        map1.put(3, "khushi");
        map1.put(4, "ravi");
        map1.put(2, "skk");
        map1.remove(4);
      
        System.out.println("map1 is:" +map1);
        System.out.print("map2 is:" +map2);
    }
}
