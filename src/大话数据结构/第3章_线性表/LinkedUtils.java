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
        if(node==null ||node.next==null)
            return node;
        Node p=node;
        Node q=node.next;
        node.next=null;
        while (q!=null){
               Node tmp=q.next;
               q.next=p;
               p=q;
               q=tmp;
        }
        return p;
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
        Node inverses = inverses(node);
        System.out.println(inverses);

    }


}
