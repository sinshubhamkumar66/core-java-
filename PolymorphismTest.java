class Test
{
    static int multiply(int a,  int b)
    {
        return a*b;

    }
    static double multiply(double c, double d)
    {
        return c*d;
    }
}
public class PolymorphismTest {
    public static void main(String[] args) {
      
        System.out.println(Test.multiply(1, 2));
        System.out.println(Test.multiply(5, 6));
    }
    
}
