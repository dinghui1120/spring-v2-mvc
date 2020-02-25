package factory.homework;

public class WechatPayFactory implements PaymentFactory {
    @Override
    public Payment payType() {
        return new WechatPay();
    }
}
