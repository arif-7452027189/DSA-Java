import java.util.*;

public class RootLearPath {
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

    public static ArrayList<ArrayList<Integer>> rootLeaf(Node root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        dfs(root, arr, result);
        return result;
    }

    public static void dfs(Node root, ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> result) {
        if (root == null)
            return;
        arr.add(root.val);
        if (root.left == null && root.right == null) {
            ArrayList list = new ArrayList<>();
            list.addAll(arr);
            result.add(list);
        }
        dfs(root.left, arr, result);
        dfs(root.right, arr, result);
        arr.remove(arr.size() - 1);
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
        System.out.println(rootLeaf(root));
    }
}
