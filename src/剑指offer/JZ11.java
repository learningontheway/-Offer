package 剑指offer;

/**
 * @author 宋伟聪
 * @date 2020/7/4 下午 10:32
 */
public class JZ11 {
    public int NumberOf1(int n) {
        int count=0;
        while(n!=0){
            count++;
            n=n&(n-1);
        }
        return count;
    }
}
