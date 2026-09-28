import java.util.*;

public class DiameterOfTree {

    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    static int max;
    static Node nodeMeter;

    public static int diameter(Node root) {
        max = 0;
        nodeMeter = null;
        level(root);
        System.out.println(nodeMeter.val);
        return max + 1;
    }

    public static int level(Node root) {
        // int max = 0;
        if (root == null)
            return 0;
        int leftMax = level(root.left);
        int rightMax = level(root.right);
        // max = Math.max(max, leftMax + rightMax);
        if (leftMax + rightMax > max) {
            max = leftMax + rightMax;
            nodeMeter = root;
        }
        return 1 + Math.max(leftMax, rightMax);
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
        root.right = new Node(50);
        root.left.left = new Node(30);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        // display(root);
        System.out.println(diameter(root));
    }
}
