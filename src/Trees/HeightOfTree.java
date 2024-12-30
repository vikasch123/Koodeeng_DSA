package Trees;
import Trees.*;
public class HeightOfTree {



    public static int height(Node root) {
        if (root == null) return 0;
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    public static void main(String[] args) {
        System.out.println("Creating a Binary Tree");
        TreeCreate tree = new TreeCreate();
        Node root=tree.createTree();
        System.out.println("---Inorder Traversal of Binary Tree---");
        tree.inOrder(root);
        System.out.println("---Preorder Traversal of Binary Tree---");
        tree.preOrder(root);
        System.out.println("---Postorder Traversal of Binary Tree---");
        tree.postOrder(root);
        System.out.println();
        System.out.println("Height of the binary tree");
        int ht=height(root);
        System.out.println(ht);
    }


}
