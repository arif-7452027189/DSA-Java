import java.util.*;

public class SubTreeLieInTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean subTreeLieInTree(Node root, Node subRoot) {
        if (root == null)
            return false;
        if (root.data == subRoot.data) {
            if (isIdentical(root, subRoot))
                return true;
        }
        return subTreeLieInTree(root.left, subRoot) || subTreeLieInTree(root.right, subRoot);
    }

    public static boolean isIdentical(Node root, Node subRoot) {
        if (root == null && subRoot == null)
            return true;
        if (root == null || subRoot == null || root.data != subRoot.data) {
            return false;
        }
        if (!isIdentical(root.left, subRoot.left))
            return false;
        if (!isIdentical(root.right, subRoot.right))
            return false;
        return true;
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
        display(root);
        System.out.println();
        Node subRoot = new Node(20);
        subRoot.left = new Node(40);
        subRoot.right = new Node(50);
        subRoot.left.right = new Node(60);
        display(subRoot);
        // subTreeLieInTree(root, subRoot);
        System.out.println(subTreeLieInTree(root, subRoot));
    }
}
