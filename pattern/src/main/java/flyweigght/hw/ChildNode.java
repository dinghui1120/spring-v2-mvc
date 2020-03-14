package flyweigght.hw;

public class ChildNode extends Node {
    public ChildNode(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println(this.xpath);
    }
}
