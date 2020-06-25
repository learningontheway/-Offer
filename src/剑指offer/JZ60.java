package 剑指offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


/**
 * 把二叉树打印成多行
 */
public class JZ60 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        if(pRoot==null) return res;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(pRoot);
        while (!queue.isEmpty()){
            int len=queue.size();
            ArrayList<Integer> list=new ArrayList<>();
            while (len>0){
                TreeNode temp=queue.poll();
                list.add(temp.val);
                if(temp.left!=null) queue.add(temp.left);
                if(temp.right!=null) queue.add(temp.right);
                len--;
            }
            res.add(list);
        }
        return res;
    }
}
