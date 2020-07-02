package 剑指offer;

/**
 * @author 宋伟聪
 * @date 2020/7/1 下午 10:39
 */
public class JZ6 {
    public int minNumberInRotateArray(int [] array) {
        if(array.length==0) return 0;
        if(array.length==1) return array[0];
        int i=1;
        while(i<array.length){
            if(array[i]<array[i-1])
                break;
            i++;
        }
        return array[i];
    }
}
