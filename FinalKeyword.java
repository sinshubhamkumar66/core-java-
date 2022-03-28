class FinalVariable
{
    int a=10;
    final int A =20;
 
}
class FinalKeyword {
    public static void main(String[] args) {
        FinalVariable obj = new FinalVariable();
        System.out.println(obj.a);
       int  A=300;
       System.out.println(obj.a);
        System.out.println(obj.A);
        System.out.println(obj.A);
    }    
}
