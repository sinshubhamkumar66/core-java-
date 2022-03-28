class Linkedlist
{
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }

    }
    public void push(int item)
    {
        Node new_node =new Node(item);
        new_node.next=head;
        head=new_node;
    }
    public static boolean detectLoop(Node head){
        // Add code here
        Node low=head;
        Node high=head;
        while(high!=null && high.next!=null)
        {
            low=low.next;
            high=high.next.next;
            if(high==low)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.push(10);
        list.push(20);
        list.push(30);
        list.head.next.next=list.head;
    }
}