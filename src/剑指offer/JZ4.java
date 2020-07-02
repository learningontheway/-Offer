package 剑指offer;

import java.util.HashMap;

/**
 * @author 宋伟聪
 * @date 2020/6/29 下午 10:38
 */
public class JZ4{
    public static void main(String[] args) {
     reConstructBinaryTree(new int[]{1,2,4,7,3,5,6,8},new int[]{4,7,2,1,5,3,8,6});
    }
      public static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }
    static HashMap<Integer,Integer> hashMap=new HashMap<>();
    public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length==0) return null;
        int n=pre.length;

        for (int i = 0; i < n; i++) {
            hashMap.put(in[i],i);
        }
        return buildTree(pre,in,0,n-1,0,n-1);
    }
    public static TreeNode buildTree(int[] pre,int[] in,int preL,int preR,int inL,int inR){
        if(preL>preR||inL>inR) return null;
        TreeNode root=new TreeNode(pre[preL]);
        int index=hashMap.get(pre[preL]);
        root.left=buildTree(pre,in,preL+1,preL+index-inL,inL,index-1);
        root.right=buildTree(pre,in,preL+index-inL+1,preR,index+1,inR);
        return root;
    }
}
