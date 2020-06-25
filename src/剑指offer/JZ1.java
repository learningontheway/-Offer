package 剑指offer;

/**
 * 二维数组中的查找
 * @author songweicong3
 * @date 2020/6/23 18:15
 */
public class JZ1 {
    public boolean Find(int target, int [][] array){
        int i=0;
        int j=array[0].length-1;
        while(i<array.length&&j>=0){
            if(array[i][j]==target)
                return true;
            else if(array[i][j]<target){
                i++;
            }else{
                j--;
            }
        }
        return false;
    }
}
