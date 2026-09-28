import java.util.*;

public class KthLevelPrint {
    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static void kthLevel(Node root, int level, int k) {
        if (root == null)
            return;
        if (level == k)
            System.out.println(root.val + " ");

        kthLevel(root.left, level + 1, k);
        kthLevel(root.right, level + 1, k);
    }

    public static void display(Node root) {
        if (root == null)
            return;
        System.out.println(root.val);
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

        // display(root);
        kthLevel(root, 0, 2);
    }
}
