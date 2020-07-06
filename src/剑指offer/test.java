package 剑指offer;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * @author 宋伟聪
 * @date 2020/7/6 下午 2:33
 */
public class test {
    public static void main(String[] args) {
        System.out.println(GetLeastNumbers_Solution(new int[]{1,3,8,5,4,9},3));
    }
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        for(int i=0;i<input.length;i++){
            queue.add(input[i]);
        }
        ArrayList<Integer> res=new ArrayList<>();
        for (int i = 0; i <k ; i++) {
            res.add(queue.poll());
        }
        return  res;
    }
}
