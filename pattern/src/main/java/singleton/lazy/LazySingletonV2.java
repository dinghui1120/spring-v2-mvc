package singleton.lazy;

/**
 * 解决了线程安全问题
 * 在线程数量比较多情况下，如果 CPU 分配压力上升，会导致大批
 * 量线程出现阻塞，从而导致程序运行性能大幅下降
 */
public class LazySingletonV2 {
    private LazySingletonV2(){}
    private static LazySingletonV2 instance = null;
    public static LazySingletonV2 getInstance(){
        if (null == instance) {
            synchronized (LazySingletonV2.class) {
                instance = new LazySingletonV2();
            }
        }
        return instance;
    }
}
