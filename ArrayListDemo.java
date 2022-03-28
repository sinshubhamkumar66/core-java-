import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
        int n=5;
        ArrayList<Integer>arrlist = new ArrayList<Integer>(n);
        for(int i =0; i<n; i++)
        {
            arrlist.add(i);
            
            System.out.println(+arrlist.get(i));
            arrlist.add(5);
            System.out.println(+arrlist.get(i));
        }
    }
}
