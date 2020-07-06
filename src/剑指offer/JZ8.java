package 剑指offer;

/**
 * @author 宋伟聪
 * @date 2020/7/1 下午 10:46
 */
public class JZ8 {
    int sum=0;
    public int JumpFloor(int target) {
        jump(target);
        return sum;
    }
    public void jump(int target){
        if(target==0) {
            sum++;
            return;
        }
        if(target==-1){
            return;
        }
        JumpFloor(target-1);
        JumpFloor(target-2);
    }
}
