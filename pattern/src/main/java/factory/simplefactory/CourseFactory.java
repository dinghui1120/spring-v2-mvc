package factory.simplefactory;

import factory.common.Course;
import factory.common.JavaCourse;
import factory.common.PythonCourse;
import org.apache.commons.lang3.StringUtils;

/**
 * 简单工厂模式(Simple Factory Pattern)
 * 指由一个工厂对象决定创建出哪一种产品实例
 * 创建型模式
 *适用场景：工厂类负责创建的对象较少，客户端只需要传入工厂类的参数，对如何创建对象的逻辑不需要关心
 * 优点：只需要传入正确的参数，就可以获取想要的对象，无需关心创建的细节
 * 缺点：增加新产品需要修改判断逻辑，不易于扩展过于复杂的产品结构
 */
public class CourseFactory {

    public static Course createVersion1(String name){
        if (StringUtils.isNotEmpty(name)) {
            if("java".equals(name)){
                return new JavaCourse();
            } else if ("python".equals(name)) {
                return new PythonCourse();
            }
        }
        return null;
    }

    public static Course createVersion2(String name){
        if(StringUtils.isNotEmpty(name)){
            try {
                return (Course) Class.forName(name).newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static Course createVersion3(Class<? extends Course> clazz) {
        if (null != clazz) {
            try {
                return clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
