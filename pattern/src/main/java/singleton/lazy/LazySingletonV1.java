package singleton.lazy;

/**
 * 在调用时才实例化
 * 存在线程安全问题，有时看到实例化对象可能是相同的，实际上是被后面执行的线程覆盖了。
 */
public class LazySingletonV1 {
    private static LazySingletonV1 instabce = null;
    private LazySingletonV1(){}
    public static LazySingletonV1 getInstabce() {
        if (null == instabce) {
            instabce = new LazySingletonV1();
        }
        return instabce;
    }
}
