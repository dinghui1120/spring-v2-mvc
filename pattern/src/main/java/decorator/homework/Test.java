package decorator.homework;

public class Test {

    public static void main(String[] args) {
        NavigationBar navigationBar;
        navigationBar = new CommomNavigationBar();
        System.out.println("普通用户："+navigationBar.getName());
        navigationBar = new HomeworkDecorator(navigationBar);
        navigationBar = new GrowWallDecorator(navigationBar);
        System.out.println("VIP用户："+navigationBar.getName());
    }
}
