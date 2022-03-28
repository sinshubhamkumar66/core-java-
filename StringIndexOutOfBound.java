public class StringIndexOutOfBound {
    public static void main(String[] args) {
        try
        {
        String str="shubham";
        System.out.println(str.charAt(8));
        }catch(StringIndexOutOfBoundsException e)
        {
            System.out.println("string index out of bounds exception e");
        }
    }
    
}
