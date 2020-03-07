package decorator.homework;

public class HomeworkDecorator extends NavigationBarDecorator {

    public HomeworkDecorator(NavigationBar navigationBar) {
        super(navigationBar);
    }

    @Override
    public String getName() {
        return super.getName()+" + 作业";
    }
}
