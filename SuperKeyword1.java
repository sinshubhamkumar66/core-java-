class Perent
{
    void message()
    {
        System.out.println("this is perent class");
    }
}
class Child extends Perent
{
    void message()
    {
        System.out.println(" this is child class");
    }
     void Display(){
        //message();
         super.message();
     }
}

public class SuperKeyword1
{
    public static void main(String[] args) {
        Child obj = new Child();
        obj.Display();

        
    }
}