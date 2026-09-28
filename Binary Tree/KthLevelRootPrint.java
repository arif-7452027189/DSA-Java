import java.util.*;

public class KthLevelRootPrint {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void kthLevel(Node root, int level, int k) {
        if (root == null) {
            return;
        }
        if (level == k) {
            System.out.println(root.data + " ");
            return;
        }
        kthLevel(root.left, level + 1, k);
        kthLevel(root.right, level + 1, k);
    }

    public static int countLevel(Node root) {
        if (root == null)
            return 0;
        int leftLevel = countLevel(root.left);
        int rightLvel = countLevel(root.right);
        return Math.max(leftLevel, rightLvel) + 1;

    }

    public static void display(Node root) {
        if (root == null)
            return;
        System.out.println(root.data);
        display(root.left);
        display(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(10);

        root.left = new Node(20);
        root.right = new Node(30);

        root.left.left = new Node(40);
        root.left.right = new Node(50);

        root.right.left = new Node(60);
        root.right.right = new Node(70);

        root.left.left.left = new Node(80);
        root.left.left.right = new Node(90);

        root.left.right.left = new Node(100);
        root.left.right.right = new Node(110);

        root.right.left.left = new Node(120);
        root.right.left.right = new Node(130);

        root.right.right.left = new Node(140);
        root.right.right.right = new Node(150);
        
        // display(root);
        // kthLevel(root, 0, 2);
        display(root);
        System.out.println(countLevel(root));
    }
}
