package singleton.lazy;

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
