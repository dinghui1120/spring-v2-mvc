package decorator.homework;

public class GrowWallDecorator extends NavigationBarDecorator {

    public GrowWallDecorator(NavigationBar navigationBar) {
        super(navigationBar);
    }

    @Override
    public String getName() {
        return super.getName()+" + 成长墙";
    }
}
