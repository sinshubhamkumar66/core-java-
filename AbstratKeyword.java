abstract class Super
{
    void name()
    {
        System.out.println("this is name");rrr
    }
}
class Child extends Super
{
    void age()
    {
        System.out.println("15");
    }
}
class Child1 extends Super
{
    void id()
    {
        System.out.println("101");
    }
}
class AbstratKeyword
{
    public static void main(String[] args) {
        Super  s = new Child1();
        s.name();
        
        
    }
}