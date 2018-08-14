package 大话数据结构.第3章_线性表;

public class LinkedUtils {


    //声明node结点
    static class Node {
        int data;
        Node next;
    }

    /**
     * 反转链表
     * @param node
     */
    public static Node inverses(Node node){
        //如果结点是空或者是最后一个结点，就直接返回
        //0->1->2->3->4->5->6

        if(node==null ||node.next==null)
            return node;
        //把原来的链表给p
//        Node p=node;
//        Node q=node.next;
//        node.next=null;
//        //以上操作产生结果为
//        //p 0->null
//        //q 1->2->3->4->5->6
//        while (q!=null){
//               Node tmp=q.next;//tmp=2-3-4-5-6
//               q.next=p; //q =1-0-null
//               p=q;//p=1-0-null p=1-0-null  只所以这么写，是为了让q永远指向next
//               q=tmp;//q=2-3-4-5-6
//        }
//        return p;
        Node p = null;
        Node q=node;
        while (q!=null){
            Node tmp=q.next;
            q.next=p;
            p=q;
            q=tmp;
        }
        return p;
    }

    /**
     * 递归反转链表
     */
    public static Node inversesRecursion(Node node){
        //递归到倒数第二个结点
        if(node==null||node.next==null)
            return node;
        Node inverses = inversesRecursion(node.next);
        node.next.next=node;
        node.next=null;
        return inverses;

    }


    public static void main(String []args){
        Node node=new Node();
        Node node1=new Node();
        Node node2=new Node();
        Node node3=new Node();
        node.data=0;
        node1.data=1;
        node2.data=2;
        node3.data=3;
        node.next=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=null;
        Node inverses = inversesRecursion(node);
        System.out.println(inverses);

    }


}
