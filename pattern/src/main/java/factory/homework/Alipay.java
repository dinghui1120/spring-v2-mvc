package factory.homework;

public class Alipay implements Payment {

    @Override
    public void pay() {
        System.out.println("欢迎使用Alipay");
    }

}
