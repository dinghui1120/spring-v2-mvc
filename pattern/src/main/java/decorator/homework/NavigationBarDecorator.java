package decorator.homework;

public class NavigationBarDecorator implements NavigationBar {

    private NavigationBar navigationBar;

    public NavigationBarDecorator(NavigationBar navigationBar) {
        this.navigationBar = navigationBar;
    }

    @Override
    public String getName() {
        return navigationBar.getName();
    }
}
