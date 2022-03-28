class Test
{
    String Name;
    int age;
    Test()
    {
        System.out.println("this is called constructor");
    }
}
class ConstructorTest
{
    public static void main(String[] args) {
        Test t1 = new Test();
        System.out.println(t1.Name);
        System.out.println(t1.age);
    }
}