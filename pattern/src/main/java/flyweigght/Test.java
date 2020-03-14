package flyweigght;

public class Test {

    public static void main(String[] args) {
        TreeNode root = new TreeNode("根节点",1);
        Tree rootLeaf = new TreeLeaf("根节点下叶节点1");
        TreeNode node1 = new TreeNode("支结点",2);
        Tree leaf1 = new TreeLeaf("支结点1下叶节点1");
        Tree leaf2 = new TreeLeaf("支结点1下叶节点2");
        node1.add(leaf1);
        node1.add(leaf2);
        root.add(node1);
        root.add(rootLeaf);
        root.show();
    }
}
