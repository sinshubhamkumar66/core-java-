class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;

    }
}
class BinaryTreeY
{
    Node root;
    BinaryTreeY()
    {
        root=null;
    }
    void preOrder(Node node)
    {
        if(node==null)
        {
            return;
        }
        System.out.println(node.data+ "->");
        preOrder(node.left);
        preOrder(node.right);

    }
    public static void main(String[] args) {
        BinaryTreeY tree = new BinaryTreeY();
        tree.root = new Node(1);
        tree.root.left = new Node(12);
    tree.root.right = new Node(9);

    // create child nodes of left child
    tree.root.left.left = new Node(5);
    tree.root.left.right = new Node(6);

    System.out.println("In Order traversal");
    tree.preOrder(tree.root);
    }
}