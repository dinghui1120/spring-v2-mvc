package factory.factorymethod;

import factory.common.Course;
import factory.common.JavaCourse;

public class JavaCourseFactory implements CourseFactory {

    @Override
    public Course create() {
        return new JavaCourse();
    }
}
