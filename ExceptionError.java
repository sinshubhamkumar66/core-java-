import javax.sound.midi.MidiChannel;

public class ExceptionError
{
    public static void main(String[] args) {
        try
        {
            int a =10;
            int b =0;
            int c=a/b;
           // System.out.println("result is: " +c);


        }
        catch(ArithmeticException e)
        {
            System.out.println("can't devide by zero ");
        }
        
    }
}
