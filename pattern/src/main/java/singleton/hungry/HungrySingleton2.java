package singleton.hungry;

/**
 * 在类加载时就创建对象
 * 优点：线程安全，在线程还没出现就实例化了，不存在访问安全问题，执行效率较高，在用户体验上，比懒汉式更好
 * 缺点：不管用不用，类加载时就实例化，浪费内存空间
 */
public class HungrySingleton2 {

    private static final HungrySingleton2 instance;
    static {
        instance = new HungrySingleton2();
    }
    private HungrySingleton2(){}
    public static HungrySingleton2 getInstance(){
        return instance;
    }
}
