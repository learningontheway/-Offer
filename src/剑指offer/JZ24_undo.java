package 剑指offer;

import org.omg.CORBA.INTERNAL;

import java.util.*;

/**
 * @author 宋伟聪
 * @date 2020/6/25 下午 10:14
 */
public class JZ24_undo {
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    static ArrayList<ArrayList<Integer>> res=new ArrayList<>();
    public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if(root==null) return res;
        ArrayList<Integer> list=new ArrayList<>();
        list.add(root.val);
        findPath(root,list,0,target);
        return res;
    }
    public static void findPath(TreeNode root,ArrayList<Integer> cur,int sum,int target){
        if(root.left==null&&root.right==null) {
            if(target==sum){
                res.add(cur);
                return ;
            }
        }
        if(root.left!=null){
            cur.add(root.left.val);
            sum+=root.left.val;
            findPath(root.left,cur,sum,target);
            sum-=root.left.val;
            cur.remove((Integer)root.left.val);
        }
        if(root.right!=null){
            cur.add(root.right.val);
            sum+=root.left.val;
            findPath(root.right,cur,sum,target);
            sum-=root.left.val;
            cur.remove((Integer)root.right.val);
        }

    }
}
