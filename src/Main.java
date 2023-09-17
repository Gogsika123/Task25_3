import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            int num = input.nextInt();
            bst.insert(num);
        }
        System.out.println("Inorder traversal:");
        bst.inorder();

        input.close();
    }
}