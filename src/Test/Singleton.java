package Test;

/**
 * @author 宋伟聪
 * @date 2020/7/7 下午 3:46
 */
public class Singleton {
    private Singleton(){}
    public static synchronized Singleton getSingleton(){
        return SingletonHolder.singleton;
    }
    private static class SingletonHolder{
        private static final Singleton singleton=new Singleton();
    }
}
