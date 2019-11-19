package singleton.serializable;

import java.io.Serializable;

/**
 * 反序列化时导致单例破坏
 *当我们将一个单例创建好，有时候需要将对象序列化写入磁盘。下次使用时，再从磁盘中读取，
 * 反序列化转为内存对象，但反序列化后的对象会重新分配内存，即重新创建，相当于破坏了单例
 *
 * 解决方法：增加 readRosolve()方法即可
 * ObjectInputStream 里如果 readResolve方法存在就使用
 * 这种方法虽然解决了单例被破坏问题，但实际上实例化了两次，只不过新创建的对象没有被返回而已
 * 如果创建对象的频率增大，就意味着内存分配开销也就随之增大
 * 从根本上解决问题可以用注册式单例
 */
public class SerializableSingleton implements Serializable {
    private SerializableSingleton(){}

    private static final SerializableSingleton instance = new SerializableSingleton();

    public static SerializableSingleton getInstance() {
        return instance;
    }

    private Object readResolve(){
        return instance;
    }
}
