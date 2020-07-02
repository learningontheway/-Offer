package 剑指offer;

/**
 * @author 宋伟聪
 * @date 2020/7/1 下午 11:08
 */
public class JZ9 {
    public int JumpFloorII(int target) {
        if(target<0) return -1;
        if(target==0) return 0;
        if(target==1) return 1;
        return JumpFloorII(target-1)*2;
    }
}
