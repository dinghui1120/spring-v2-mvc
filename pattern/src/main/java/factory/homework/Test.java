package factory.homework;

public class Test {
    public static void main(String[] args) {
        Payment payment = new AlipayFactory().payType();
        payment.pay();
    }
}
