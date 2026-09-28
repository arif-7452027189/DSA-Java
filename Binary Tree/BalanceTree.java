public class BalanceTree {
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

    static boolean flag;

    public static boolean balance(Node root) {
        if (root == null) {
            return true;
        }
        flag = true;
        checkBalance(root);
        return flag;
    }

    public static int checkBalance(Node root) {
        if (root == null)
            return 0;
        int leftHeight = checkBalance(root.left);
        int rightHeight = checkBalance(root.right);
        if (Math.abs(leftHeight - rightHeight) > 1)
            flag = false;
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static void display(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        display(root.left);
        display(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(50);

        root.left = new Node(30);
        root.right = new Node(70);

        root.left.left = new Node(20);
        root.left.right = new Node(40);

        System.out.println(balance(root));
        System.out.println(checkBalance(root));
    }
}
