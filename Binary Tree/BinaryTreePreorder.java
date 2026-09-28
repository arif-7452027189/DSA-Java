import java.util.*;

/*
Question:
Binary Tree - Preorder Traversal

Given a binary tree, print the nodes in preorder traversal.

Preorder Traversal:
Root -> Left -> Right

Example:

        1
       / \
      2   3
     / \
    4   5

Output:
1 2 4 5 3

Approach:
First visit the root node, then recursively visit the left subtree,
and finally recursively visit the right subtree.

Time Complexity: O(n)
Space Complexity: O(n)
*/

public class BinaryTreePreorder {

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

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        preorder(root);
    }
}

// bottom print levewise travesal

// class Solution {
// public List<List<Integer>> levelOrderBottom(TreeNode root) {
// List<List<Integer>> ans = new ArrayList<>();

// helper(root, 0, ans);

// Collections.reverse(ans);

// return ans;
// }
// public static void helper(TreeNode root, int level, List<List<Integer>> ans)
// {
// if(root == null) return;
// if(ans.size() == level) {
// ans.add(new ArrayList<>());
// }

// ans.get(level).add(root.val);
// helper(root.left, level + 1, ans);
// helper(root.right, level +1, ans);
// }
// }