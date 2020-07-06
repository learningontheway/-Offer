package 剑指offer;

/**
 * @author 宋伟聪
 * @date 2020/7/6 下午 4:57
 */
public class JZ17 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root2==null||root1==null) return false;
        return isSame(root1,root2)||HasSubtree(root1.left,root2)||HasSubtree(root1.right,root2);
    }
    public boolean isSame(TreeNode node1,TreeNode node2){
        if(node2==null) return true;
        if(node1==null) return false;
        if(node2.val!=node1.val) return false;
        return isSame(node1.left,node2.left)&&isSame(node1.right,node2.right);
    }
}
