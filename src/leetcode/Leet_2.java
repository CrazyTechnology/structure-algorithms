package leetcode;

public class Leet_2 {
    /**
     * 未解决
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode tempList=new ListNode(0);
       while (l1.next!=null && l2.next!=null){
           int x= l1.val;
           int y=l2.val;
           int curr=tempList.val;
           int sum=x+y+curr;
           tempList.next=new ListNode(sum%10);

       }


       return  tempList;
    }
}


 class ListNode {
      int val;
     ListNode next;
      ListNode(int x) { val = x; }
 }