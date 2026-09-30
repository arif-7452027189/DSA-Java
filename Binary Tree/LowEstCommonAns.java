import java.util.*;

public class LowEstCommonAns {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node lca(Node root, int p, int q) {
        if (root == null)
            return null;
        if (root.data == p || root.data == q) {
            return root;
        }
        boolean leftExitInP = exits(root.left, p);
        boolean rightExitInQ = exits(root.right, q);
        if (leftExitInP && !rightExitInQ)
            return lca(root.left, p, q);
        if (!leftExitInP && rightExitInQ)
            return lca(root.right, p, q);
        else
            return root;

    }

    public static boolean exits(Node root, int val) {
        if (root == null)
            return false;
        if (root.data == val)
            return true;
        return exits(root.left, val) || exits(root.right, val);

    }

    public static void display(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + "  ");
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
        display(root);
    }
}
