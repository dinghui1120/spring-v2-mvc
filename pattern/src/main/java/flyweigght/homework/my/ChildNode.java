package flyweigght.homework.my;

public class ChildNode extends Node {
    public ChildNode(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println(this.xpath);
    }
}
