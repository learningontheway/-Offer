package 剑指offer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 */
public class JZ2 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("We are friend");
        System.out.println(replaceSpace(sb));
    }
    public static String replaceSpace(StringBuffer str) {
        return str.toString().replaceAll(" ","%20");
    }
}
