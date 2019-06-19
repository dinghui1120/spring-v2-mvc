package factory.factorymethod;

import factory.common.Course;

/**
 * 工厂方法模式(Factory Method Pattern)
 * 指定义一个创建对象的接口，让实现这个接口的类去决定实例化那个类，让类的实例化推迟到子类中进行
 * 创建型设计模式
 * 适用场景：创建对象需要大量重复的代码，不关心产品类如何被创建，一个类通过子类来决定创建哪个对象
 * 优点：用户只需关心所需产品对应的工厂，无需关心创建细节。符合开闭原则、易扩展
 * 缺点：类的个数容易过多，增加代码结构的复杂度，增加系统的抽象性和理解难度
 *
 */
public interface CourseFactory {
    Course create();
}
