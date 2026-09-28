import java.util.*;

public class LevelOrderTraversal {
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

    public static void levelOrderTraversal(Node root) {
        if (root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (q.size() > 0) {
            Node front = q.remove();
            System.out.print(front.val + " ");
            if (front.left != null) {
                q.add(front.left);
            }
            if (front.right != null) {
                q.add(front.right);
            }
        }
    }

    public static void display(Node root) {
        if (root == null)
            return;
        System.out.print(root.val + " ");
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
        levelOrderTraversal(root);
        // display(root);
    }
}
