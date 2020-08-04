package 剑指offer;

import org.omg.CORBA.INTERNAL;

import java.util.*;

/**
 * @author 宋伟聪
 * @date 2020/6/25 下午 10:14
 */
public class JZ24 {
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    ArrayList<ArrayList<Integer>> res=new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        findPath(root,target,new ArrayList<Integer>());
        return res;
    }
    public void findPath(TreeNode root,int target,ArrayList<Integer> cur){
        if(target<0||root==null) return;
        cur.add(root.val);
        target-=root.val;
        if(root.left==null&&root.right==null){
            if(target==0)
                res.add(cur);
            return;
        }
        findPath(root.left,target,new ArrayList<>(cur));
        findPath(root.right,target,new ArrayList<>(cur));
    }
}
