package 剑指offer;

/**链表中环的入口节点
 * @author 宋伟聪
 * @date 2020/7/7 上午 11:04
 */
public class JZ55 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead.next==null) return null;
        ListNode fast=pHead.next.next;
        ListNode low=pHead.next;
        while(fast!=low){
            if(fast.next!=null){
                low=low.next;
                fast=fast.next.next;
            }
            else break;
        }
        if(fast.next==null) return null;
        low=pHead;
        while(low!=fast){
            low=low.next;
            fast=fast.next;
        }
        return fast;
    }
}
