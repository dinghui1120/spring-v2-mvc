package flyweigght.hw;

public abstract class Node {
    protected String name;
    protected String xpath="";

    public Node(String name) {
        this.name = name;
    }

    public abstract void show();
}
