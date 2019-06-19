package singleton.lazy;

/**
 * double check
 */
public class LazySingletonV3 {
    private LazySingletonV3(){}
    private static LazySingletonV3 instance = null;
    public static LazySingletonV3 getInstance() {
        if (null == instance) {
            synchronized (LazySingletonV3.class) {
                if (null == instance) {
                    instance = new LazySingletonV3();
                }
            }
        }
        return instance;
    }
}
