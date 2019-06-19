package factory.factorymethod;

import factory.common.Course;
import factory.common.PythonCourse;

public class PythonCourseFactory implements CourseFactory {

    @Override
    public Course create() {
        return new PythonCourse();
    }
}
