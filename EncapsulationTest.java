

class Encapsulate
{
    private String Name;
    private int Roll_no;
    private int age;
    public int getage()
    {
        return age;

    }
    public String getname()
    {
        return Name;

    }
    public int  getroll()
    {
        return Roll_no;
    }
    public void setage(int newage)
    {
        age=newage;
    }
    public void setname(String newname)
    {
        Name=newname;
    }
    public void setroll(int newroll_no)
    {
        Roll_no=newroll_no;
    }
}
public class EncapsulationTest
{
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        obj.setname("harsh");
        obj.setage(12);
        obj.setroll(101);
        System.out.println(obj.getname());
        System.out.println(obj.getage());
        System.out.println(obj.getroll());
        
    }
}