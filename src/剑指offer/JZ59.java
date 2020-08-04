package 剑指offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author 宋伟聪
 * @date 2020/7/11 下午 11:18
 */
public class JZ59 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer> > res=new ArrayList<>();
        if(pRoot==null) return res;
        Boolean flag=true;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(pRoot);
        while(!queue.isEmpty()){
            int len=queue.size();
            ArrayList<Integer> list=new ArrayList<>();
            while(len>0){
                TreeNode temp=queue.poll();
                if(flag){
                    list.add(temp.val);
                }else{
                    list.add(0,temp.val);
                }
                if(temp.left!=null)
                    queue.add((temp.left));
                if(temp.right!=null)
                    queue.add(temp.right);
                len--;
            }
            res.add(list);
            flag=flag?false:true;
        }
        return res;
    }
}
