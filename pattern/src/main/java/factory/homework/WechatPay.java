package factory.homework;

public class WechatPay implements Payment {
    @Override
    public void pay() {
        System.out.println("欢迎使用WechatPay");
    }
}
