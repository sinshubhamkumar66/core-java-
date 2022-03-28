import java.util.Scanner;

class Sum
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter first element");
        int a=sc.nextInt();
        System.out.println("enter second element");
        int b=sc.nextInt();
        int d= a+b;
        System.out.println("sum of number is:" +d);

    }
}