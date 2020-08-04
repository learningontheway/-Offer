package 剑指offer;

/**
 * 删除链表中重复的节点
 * @author 宋伟聪
 * @date 2020/7/7 上午 10:20
 */
public class JZ56 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode deleteDuplication(ListNode pHead){
        if(pHead==null||pHead.next==null){
            return pHead;
        }
        ListNode Head=new ListNode(0);
        Head.next=pHead;
        ListNode pre=Head;
        ListNode last=pHead;
        while(last!=null){
            if(last.next!=null&&last.val==last.next.val){
                while(last.next!=null&&last.val==last.next.val){
                    last=last.next;
                }
                last=last.next;
                pre.next=last;
            }else{
                pre=pre.next;
                last=last.next;
            }
        }
        return Head.next;
    }

}
