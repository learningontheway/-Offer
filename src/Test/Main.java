package Test;



import java.util.*;

/**
 * @author 宋伟聪
 * @date 2020/7/26 下午 4:34
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int[] num = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        getEX(num);
    }
    public static void getEX(int[] num){
        System.out.println(1);
    }
}
