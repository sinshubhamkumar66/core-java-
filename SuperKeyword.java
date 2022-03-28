class vechile{
    int speed_max =120;

}
class car extends vechile
{
    int speed_max=180;
    void Display()
    {
        System.out.println("speed is:" +super.speed_max);
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        car obj = new car();
        obj.Display();

    }
    
}
