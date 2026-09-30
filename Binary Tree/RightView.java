import java.util.*;

public class RightView {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static ArrayList<Integer> rightView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        view(root, 0, ans);
        return ans;
    }

    public static void view(Node root, int level, ArrayList<Integer> ans) {
        if (root == null)
            return;
        if (level >= ans.size())
            ans.add(root.data);
        else
            ans.set(level, root.data);

        view(root.left, level + 1, ans);
        view(root.right, level + 1, ans);
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
        root.right = new Node(50);
        root.left.left = new Node(30);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        display(root);
        System.out.println(rightView(root));
    }
}
