package proxy.staticproxy;

public class Father {
    public Son son;

    public Father(Son son) {
        this.son = son;
    }

    public void findLove() {
        before();
        son.findLove();
        after();
    }

    public void before() {
        System.out.println("开始前准备工作");
    }

    public void after() {
        System.out.println("结束收尾");
    }
}
