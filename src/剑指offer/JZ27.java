package 剑指offer;


import java.util.ArrayList;
import java.util.BitSet;

/**
 * @author 宋伟聪
 * @date 2020/7/24 上午 10:59
 */
public class JZ27 {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
    }
    public int firstMissingPositive(int[] nums) {
        BitSet bitSet=new BitSet(Integer.MAX_VALUE);
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]>0)
                bitSet.set(nums[i],true);
        }
        return bitSet.nextClearBit(0);
    }

}
