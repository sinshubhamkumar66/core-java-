class Test
{
    String Name;
    int age;
    int roll_no;
    //create prameterized constructor
    Test( String Name, int age, int roll_no)
    {
        this.Name=Name;
        this.age=age;
        this.roll_no=roll_no;
    }
}

public class ConstructorTest1 {
    public static void main(String[] args) {
        Test t1 =new Test("shubham", 15, 101);
        System.out.println(t1.Name);
        System.out.println(t1.age);
        System.out.println(t1.roll_no);

    }

}
