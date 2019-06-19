package factory.abstractfactory;

public class PythonCourseFactory implements CourseFactory {
    @Override
    public Note createNote() {
        return new PythonNote();
    }

    @Override
    public Homework createHomework() {
        return new PythonHomework();
    }
}
