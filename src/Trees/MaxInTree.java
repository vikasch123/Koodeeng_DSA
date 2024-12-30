package Trees;
import Trees.*;
//import javax.swing.tree.TreeNode;

public class MaxInTree {
public int maxInTree(Node root) {
    if (root == null) return 0;
    return Math.max(Math.max(maxInTree(root.left), maxInTree(root.right)), root.data);
}


public static void main(String[] args) {
    TreeCreate obj = new TreeCreate();
    Node root=obj.createTree();
    obj.inOrder(root);

    MaxInTree tree = new MaxInTree();
    int max=tree.maxInTree(root);
    System.out.println();
    System.out.println(max);
}
}
