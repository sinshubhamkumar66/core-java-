import java.util.*;
 public class ListDemo
{
    public static void main(String[] args) {
        List<Integer>l1 = new ArrayListDemo<Integer>();
        l1.add(0 ,1);
        l1.add(1 ,2);
        System.out.println(l1);
        List<Integer>l2 = new ArrayListDemo<Integer>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        System.out.println(l2);
        l1.addAll(2, l2);
        System.out.println(l1);
        //remove from the list at the index 3
        l1.remove(3);
        System.out.println(l1);
        System.out.println(l1.get(3));
        //replace index 0 with another element 
        l1.set(0, 5);
        System.out.println(l1);
        
    }
}