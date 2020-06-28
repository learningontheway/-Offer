package 剑指offer;

import java.util.ArrayList;

/**
 * @author 宋伟聪
 * @date 2020/6/28 下午 9:35
 */
public class JZ3 {
    public class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list=new ArrayList<>();
        while(listNode!=null){
            list.add(0,listNode.val);
            listNode=listNode.next;
        }
        return list;
    }
}
