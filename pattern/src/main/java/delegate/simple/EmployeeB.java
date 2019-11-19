package delegate.simple;

public class EmployeeB implements Employee {
    @Override
    public void doing(String command) {
        System.out.println("我是雇员A,我现在开始干"+command+"工作");
    }
}
