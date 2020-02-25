package factory.homework;

public class AlipayFactory implements PaymentFactory {

    @Override
    public Payment payType() {
        return new Alipay();
    }
}
