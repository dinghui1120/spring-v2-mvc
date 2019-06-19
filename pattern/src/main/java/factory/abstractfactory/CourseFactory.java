package factory.abstractfactory;

/**
 * 抽象工厂模式(Abstract Factory Pattern)
 * 创建型模式
 * 指提供一个创建一系列相关或相互依赖对象的接口，无需指定它们具体的类
 * 产品族：是指由同一个工厂生产的，位于不同产品等级结构中的一组产品
 * 产品等级结构：产品的继承结构，也就是抽象产品与具体产品形成的结构
 * 使用场景：创建一系列相关的产品对象需要大量重复的代码，不关心产品类如何被创建
 * 优点：将一系列产品族统一创建，无需关心产品如何被创建
 * 缺点：规定了所有可能被创建的产品集合，产品族中扩展新的产品困难，需要修改抽象工厂的接口。增加了系统的抽象性和理解难度
 */
public interface CourseFactory {
    Note createNote();
    Homework createHomework();
}
