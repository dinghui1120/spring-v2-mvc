package factory.common;

public class JavaCourse implements Course {
    @Override
    public void note() {
        System.out.println("java笔记");
    }
}
