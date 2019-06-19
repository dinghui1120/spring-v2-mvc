package singleton.register;

/**
 * 注册式单例又称为登记式单例
 * 就是将每个实例都登记到某个地方，使用唯一标识获取实例
 * 有两种写法
 * 容器缓存
 * 枚举登记
 */
public enum EnumSingleton {
    INSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }

}
