package Trees;
import java.util.*;
class Node{
    int data;
    Node left,right;
    public Node(int data)
    {
        this.data=data;
    }
}





class TreeCreate {
    Scanner sc=new Scanner(System.in);
    Node createTree()
    {
        System.out.println("enter data : ");
        int data=sc.nextInt();
        if(data==-1)
            return null;
        Node root=new Node(data);
        System.out.println("enter Left for  " +root.data);
        root.left=createTree();
        System.out.println("enter right for  " +root.data);
        root.right=createTree();


        return root;

    }
    public void preOrder(Node root)
    {
        if(root!=null)
        {
            System.out.print(root.data +" ");
            preOrder(root.left);
            preOrder(root.right);
        }
        else return;
    }

    public void inOrder(Node root)
    {
        if(root!=null)
        {
            inOrder(root.left);
            System.out.print(root.data +" ");
            inOrder(root.right);
        }
        else return;
    }


    public void postOrder(Node root)
    {
        if(root!=null)
        {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data +" ");
        }
        else return;
    }





    public static void main(String[] args) {

        TreeCreate ob=new TreeCreate();
        Node root=ob.createTree();
        ob.inOrder(root);
    }
}