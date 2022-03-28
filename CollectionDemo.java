import java.io.*;
import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Vector<Integer>v = new Vector();
        Hashtable<Integer, String> h = new Hashtable();
        v.addElement(5);
        v.addElement(6);
        
        h.put(1, "shubham");
        h.put(2, "kumar");
        System.out.println(arr[0]);
        System.out.println(v.elementAt(0));
        System.out.println(h.get(2));
        System.out.println(arr[3]);



    }
}
