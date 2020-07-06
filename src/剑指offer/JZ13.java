package 剑指offer;

import java.util.*;

/**
 * @author 宋伟聪
 * @date 2020/7/4 下午 10:32
 */
public class JZ13 {
    public void reOrderArray(int [] array) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j <array.length-1-i ; j++) {
                if(array[j]%2==1&&array[j+1]%2==0){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
}
