package 剑指offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 从上往下打印二叉树
 * @author 宋伟聪
 * @date 2020/6/25 下午 10:10
 */
public class JZ22 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> res=new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int len=queue.size();
            while (len>0){
                TreeNode temp=queue.poll();
                res.add(temp.val);
                if(temp.left!=null) queue.add(temp.left);
                if(temp.right!=null) queue.add(temp.right);
                len--;
            }
        }
        return res;
    }
}
