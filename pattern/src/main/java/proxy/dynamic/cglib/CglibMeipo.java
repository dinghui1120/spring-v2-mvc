package proxy.dynamic.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * CGLib 动态代理执行代理方法效率之所以比 JDK 的高是因为 Cglib 采用了 FastClass 机
 * 制，它的原理简单来说就是：为代理类和被代理类各生成一个 Class，这个 Class 会为代
 * 理类或被代理类的方法分配一个 index(int 类型)。这个 index 当做一个入参，FastClass
 * 就可以直接定位要调用的方法直接进行调用，这样省去了反射调用，所以调用效率比 JDK
 * 动态代理通过反射调用高。
 *
 *
 * CGLib 和 JDK 动态代理对比
 * 1.JDK 动态代理是实现了被代理对象的接口，CGLib 是继承了被代理对象。
 * 2.JDK 和 CGLib 都是在运行期生成字节码，JDK 是直接写 Class 字节码，CGLib 使用 ASM
 * 框架写 Class 字节码，Cglib 代理实现更复杂，生成代理类比 JDK 效率低。
 * 3.JDK 调用代理方法，是通过反射机制调用，CGLib 是通过 FastClass 机制直接调用方法，
 * CGLib 执行效率更高
 *
 * 静态代理和动态的本质区别
 * 1、静态代理只能通过手动完成代理操作，如果被代理类增加新的方法，代理类需要同步
 * 新增，违背开闭原则。
 * 2、动态代理采用在运行时动态生成代码的方式，取消了对被代理类的扩展限制，遵循开
 * 闭原则。
 * 3、若动态代理要对目标类的增强逻辑扩展，结合策略模式，只需要新增策略类便可完成，
 * 无需修改代理类的代码。
 *
 * 代理模式的优缺点
 * 使用代理模式具有以下几个优点：
 * 1、代理模式能将代理对象与真实被调用的目标对象分离。
 * 2、一定程度上降低了系统的耦合度，扩展性好。
 * 3、可以起到保护目标对象的作用。
 * 4、可以对目标对象的功能增强。
 * 当然，代理模式也是有缺点的：
 * 1、代理模式会造成系统设计中类的数量增加。
 * 2、在客户端和目标对象增加一个代理对象，会造成请求处理速度变慢。
 * 3、增加了系统的复杂度。
 */
public class CglibMeipo implements MethodInterceptor {

    public Object getInstance(Class<?> clazz){
        Enhancer enhancer = new Enhancer();
        //要把哪个设置为即将生成的新类的父类
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object object = methodProxy.invokeSuper(o, objects);
        after();
        return object;
    }

    public void before() {
        System.out.println("开始前，准备工作");
    }

    public void after() {
        System.out.println("收尾");
    }
}
