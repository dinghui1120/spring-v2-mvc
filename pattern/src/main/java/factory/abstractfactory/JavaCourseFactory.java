package factory.abstractfactory;

public class JavaCourseFactory implements CourseFactory {
    @Override
    public Note createNote() {
        return new JavaNote();
    }

    @Override
    public Homework createHomework() {
        return new JavaHomework();
    }
}
