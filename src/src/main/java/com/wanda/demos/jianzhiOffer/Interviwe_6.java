package com.wanda.demos.jianzhiOffer;

/**
 *反转链表
 *
 * @author ZhiFei
 */
public class Interviwe_6 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        LinkedNode head=null;
        head=buildLinked(head,arr);
        bianli(head);
    }

    /**
     * 构建链表
     * @param head
     * @param arr
     * @return
     */
    public static LinkedNode buildLinked(LinkedNode head, int[] arr){
        LinkedNode curNode=null,preNode=null;
        curNode = head;
        for (int value : arr) {
            curNode = new LinkedNode(value);
            curNode.next = preNode;
            preNode=curNode;
        }
        return curNode;
    }

    /**
     * 遍历链表
     * @param head
     */
    public static void  bianli(LinkedNode head){
        LinkedNode curNode=null;
        curNode=head;
        while (curNode!=null){
            System.out.println(curNode.val);
            curNode=curNode.next;
        }
    }
}
