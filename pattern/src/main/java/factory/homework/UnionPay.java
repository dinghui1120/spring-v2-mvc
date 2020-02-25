package factory.homework;

public class UnionPay implements Payment {
    @Override
    public void pay() {
        System.out.println("欢迎使用UnionPay");
    }
}
