import java.util.HashMap;
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer>mp = new HashMap<>();
        mp.put("shubham", 1);
        mp.putIfAbsent("rupam", 2);
        mp.put("khushi",3);
        mp.put("rupam", 3);
        System.out.println(mp);
        System.out.println("size of map is:" +mp.size());
        if(mp.containsKey("khushi"))
        {
            Integer a= mp.get("khushi");
            System.out.println("value for key khushi is "+a);
        }

    }
    
}
