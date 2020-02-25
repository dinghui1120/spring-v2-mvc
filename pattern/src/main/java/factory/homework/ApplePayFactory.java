package factory.homework;

public class ApplePayFactory implements PaymentFactory {
    @Override
    public Payment payType() {
        return new ApplePay();
    }
}
