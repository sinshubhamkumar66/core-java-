import java.io.*;
public class StringTest1 {
    public static void main(String[] args) {
        String s="shubham";
        StringBuffer str = new StringBuffer(" kumar");
        str.append("kkk");
        str.insert(5, "for");
        System.out.println(str);
        int p = s.length();
        System.out.println(s);
        System.out.println(p);
        System.out.println(str);
        

        
    }
    
}
