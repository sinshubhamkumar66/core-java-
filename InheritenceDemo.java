class One
{
    public void print_greek()
    {
        System.out.println("geek");
    }
}
class Two extends One{
    public void print_for()
    {
        System.out.println("for");
    }
}
class Three extends Two
{
    public void print_geek1()
    {
        System.out.println("geek");
    }
}
public class InheritenceDemo {
    public static void main(String[] args) {
        Three obj_one = new Three();
        obj_one.print_greek();
        obj_one.print_for();
        obj_one.print_geek1();
    }
    
}
