package singleton.lazy;

/**
 * 这种方式兼顾饿汉式内存浪费问题也兼顾synchronized性能问题
 * 内部类在方法调用之前初始化，巧妙的避免了线程安全问题
 */
public class LazyInnerClassSingleton {
    private LazyInnerClassSingleton(){
        //反射会破坏单列
        if (LazyHolder.instance != null) {
            throw new RuntimeException("不允许创建多个实例");
        }
    }
    public static final LazyInnerClassSingleton getInstance() {
        return LazyHolder.instance;
    }
    //没使用内部类是不会加载的
    private static class LazyHolder{
        private static final LazyInnerClassSingleton instance = new LazyInnerClassSingleton();
    }
}
