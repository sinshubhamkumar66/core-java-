class Super   
{
    void name()
    {
        System.out.println("shubham");
    }
    final void MoNo()
    {
        System.out.println("9304848904");
    }
}
class Child extends Super
{
    void name()
    {
        System.out.println("rupam");
    }
   // void MoNo()     Here Error is encountred
    {
        System.out.println("8002970262");
    }
}

public class FinalKeyword1 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.name();
        obj.MoNo(); 
    }
    
}
