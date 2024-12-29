package Trees;
import Trees.*;
import com.sun.source.tree.Tree;

public class SizeOfTree extends TreeCreate {

    public int sizeOfTree(Node root) {
        if(root == null) return 0;
        else return 1 + sizeOfTree(root.left) + sizeOfTree(root.right);
    }

    public static void main(String[] args) {

        SizeOfTree tree = new SizeOfTree();
        Node root=tree.createTree();
        tree.inOrder(root);
        int size=tree.sizeOfTree(root);
        System.out.println();
        System.out.println(size);

    }
}
