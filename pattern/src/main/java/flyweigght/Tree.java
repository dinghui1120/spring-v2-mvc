package flyweigght;

public abstract class Tree {

    protected String name;

    public Tree(String name) {
        this.name = name;
    }

    public abstract void show();
}
