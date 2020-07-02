package 剑指offer;

/**
 * @author 宋伟聪
 * @date 2020/7/1 下午 10:39
 */
public class JZ7 {
    public int Fibonacci(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<n+1;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
