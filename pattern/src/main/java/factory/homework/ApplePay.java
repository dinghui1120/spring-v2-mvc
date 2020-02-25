package factory.homework;

public class ApplePay implements Payment{
    @Override
    public void pay() {
        System.out.println("欢迎使用ApplePay");
    }
}
