
public class StackDemo {
    static final int MAX=1000;
    int top;
    int a[]= new int [MAX];

    boolean isEmpty()
    {
        return (top < 0);

    }
     void Stack()
    {
        top=-1;

    }
    boolean push (int x)
    {
        if(top >=(MAX - 1))
        {
            System.out.println("stack overflow");
            return false;

        }
        else
        {
            a[++top]=x;
            System.out.println(x+ "pushed stack");
            return true;
        }
    }
    boolean pop (int x)
    {
        if(top<0)
        {
            System.out.println("stack is underflow");
            return false;

        }
        else
        {
            a[top--]= x;
            return true;

        }
    }
    int peek()
    {
        if(top<0)
        {
        
        System.out.println("stack is underflow");
        return 0;
        }
        else
        {
            int X=a[top];
            return X;
        }
    }
    void print()
    {
        for(int i= top; i>-1; i--)
        {
            System.out.println("" +a[i]);
        }
    }



    public static void main(String[] args) {
        StackDemo obj = new StackDemo();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        System.out.println(obj.pop(10)+ " poped from stack");
        System.out.println(obj.peek()+ "peek top of the element");
        System.out.println("totl element int stack");
        obj.print();

        
    }
    
}
