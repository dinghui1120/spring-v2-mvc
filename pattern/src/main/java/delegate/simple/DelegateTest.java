package delegate.simple;

/**
 * 委派模式（Delegate Pattern）的基本作用就是负责任务的调用和分配任务，
 * 跟代理模式很像，可以看做是一种特殊情况下的静态代理的全权代理，
 * 但是代理模式注重过程，而委派模式注重结果。
 * 委派模式在 Spring 中应用非常多，大家常用的 DispatcherServlet 其实就是用到了委派模式。
 *
 * 客户请求（Boss）、委派者（Leader）、被被委派者（Target）
 * 委派者要持有被委派者的引用
 * 代理模式注重的是过程， 委派模式注重的是结果
 * 策略模式注重是可扩展（外部扩展），委派模式注重内部的灵活和复用
 * 委派的核心：就是分发、调度、派遣
 * 委派模式：就是静态代理和策略模式一种特殊的组合
 */
public class DelegateTest {

    public static void main(String[] args) {
        new Boss().command("加密",new Leader());
    }

}
