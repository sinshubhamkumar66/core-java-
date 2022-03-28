import java.util.*;

public class IterationList {
    public static void main(String[] args) {
        List<Integer>l1 =new ArrayListDemo<Integer>();
        l1.add(0,1);
        l1.add(1,2);
        l1.add(2,3);
        l1.add(3,4);
        l1.add(4,5);
        for(int i=0; i<l1.size(); i++)
        {
            System.out.println(+l1.get(i));
        }
        for(Integer it : l1)
        {
            System.out.println(it);
        }
    }
    
}
