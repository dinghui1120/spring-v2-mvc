package flyweigght.homework.share;

public class TreeLeaf extends Tree {

    public TreeLeaf(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println(name);
    }

}
