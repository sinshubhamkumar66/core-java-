final class Super
{
    void name()
    {
        System.out.println("hii gini");
    }
}
class Child extends Super{ // error here beacuse we cannot iherit final class to sub class
    
    void display()
    {
        System.out.println("this is gini");
    }

}
public class FinalKeyword2 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.name();
        obj.display();
    }
    
}
