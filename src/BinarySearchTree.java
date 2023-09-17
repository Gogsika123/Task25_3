import java.util.Stack;
import java.util.Scanner;

public class BinarySearchTree<E extends Comparable<E>> {
    private TreeNode<E> root;
    public void inorder() {
        if (root == null) {
            return;
        }
        Stack<TreeNode<E>> stack = new Stack<>();
        TreeNode<E> current = root;
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            System.out.print(current.data + " ");
            current = current.right;
        }
    }

    public void insert(E num) {
    }
}

class TreeNode<E> {
    E data;
    TreeNode<E> left;
    TreeNode<E> right;
    public TreeNode(E data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

