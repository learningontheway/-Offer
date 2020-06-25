package 剑指offer;

/**
 * @author 宋伟聪
 * @date 2020/6/25 下午 9:58
 */
public class JZ58 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    boolean isSymmetrical(TreeNode pRoot) {
        if(pRoot==null) return true;
        return isSysmetrical(pRoot.left,pRoot.right);
    }
    boolean isSysmetrical(TreeNode left,TreeNode right){
       if(left==null&&right==null) return true;
       if(left==null||right==null) return false;
       if(left.val!=right.val) return false;
        Boolean leftFlag=isSysmetrical(left.left,right.right);
        Boolean rightFlag=isSysmetrical(left.right,right.left);
        return leftFlag&&rightFlag;
    }


}
