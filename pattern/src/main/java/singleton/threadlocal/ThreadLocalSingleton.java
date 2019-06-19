package singleton.threadlocal;

/**
 * ThreadLocal线程单例
 * ThreadLocal不能保证其创建的对象是全局唯一
 * 但是能保证每个线程是全局唯一，天生的线程安全
 * ThreadLocal将所有的对象放在ThreadLocalMap中，为每一个线程都提供一个对象，实际上，是以空间换时间来实现线程间隔离的
 */
public class ThreadLocalSingleton {

    private ThreadLocalSingleton(){}

    private static final ThreadLocal<ThreadLocalSingleton> threadLocal = new ThreadLocal<ThreadLocalSingleton>(){

        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    public static ThreadLocalSingleton getInstance() {
        return threadLocal.get();
    }
}
