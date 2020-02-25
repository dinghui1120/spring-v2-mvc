package factory.homework;

public class UnionPayFactory implements PaymentFactory {
    @Override
    public Payment payType() {
        return new UnionPay();
    }
}
