package com.wanda.demos.jianzhiOffer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 二叉排序树
 *
 * @author ZhiFei
 */
public class SortBinaryTree {
    public static TreeNode buildBinaryTree(Queue<Integer> queue) {
        if (queue.peek() == null || queue.peek() == -1) {
            queue.poll();
            return null;
        }
        TreeNode root = new TreeNode(queue.poll());
        System.out.println(queue.toString());
        if(queue.peek()!=null&&root.val>=queue.peek()){
            root.left = buildBinaryTree(queue);
            root.right = buildBinaryTree(queue);
        }else {
            root.right = buildBinaryTree(queue);
        }
        return root;
    }

    public static TreeNode biuld(int[] arr) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i : arr) {
            queue.add(i);
        }
        return buildBinaryTree(queue);
    }

    public static void bianli(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + ",");
        bianli(root.left);
        bianli(root.right);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -1, 5, -1, 2, 8, 9};
        TreeNode root = biuld(arr);
        bianli(root);
    }
}
