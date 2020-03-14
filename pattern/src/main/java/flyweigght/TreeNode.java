package flyweigght;

import java.util.ArrayList;
import java.util.List;

public class TreeNode extends Tree {

    private List<Tree> treeList;
    private Integer level;

    public TreeNode(String name, Integer level) {
        super(name);
        this.level = level;
        treeList = new ArrayList<>();
    }

    public void add(Tree tree){
        treeList.add(tree);
    }

    public void remove(Tree tree){
        treeList.remove(tree);
    }


    @Override
    public void show() {
        System.out.println(name);
        for (Tree c : treeList) {
            if (this.level != null) {
                for (Integer i = 0; i < this.level; i++) {
                    System.out.print("  ");
                }
                for (Integer i = 0; i < this.level; i++) {
                    if (i == 0) {
                        System.out.print("+");
                    }
                    System.out.print("-");
                }
            }
            c.show();
        }
    }

}
