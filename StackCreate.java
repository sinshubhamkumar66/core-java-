import java.util.Stack;

public class StackCreate {
    static final int MAX=1000;
    int top;
    int a[]=new int [MAX];
    boolean isEmpty()
    {
        return(top<0);
    }
    StackCreate()
    {
        top = -1;
    }
    boolean push(int x)
    {
        if(top>=(MAX-1))
        {
            System.out.println("stack is overflow");
            return false;
        }
        else
        {
            a[++top]=x;
            System.out.println("push into stack");
            return true ;
        }
    }
    int pop()
    {
        if(top<0)
        {
            System.out.println("stack is underflow");
            return 0;

        }
        else{
            int x=a[top--];
            return x;
        }
    }
    void printstack()
    {
        for(int i=top; i>-1; i--)
        {
            System.out.println(" "+a[i]);
        }
    }

    public static void main(String[] args) {
        StackCreate stack = new StackCreate();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.printstack();
        System.out.println("pop into stack");
        stack.pop();
        stack.printstack();
        

    }
    
}
