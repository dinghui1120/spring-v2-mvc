package flyweigght.homework.my;

public class Test {
    public static void main(String[] args) {
        System.out.println("======================打印树节点====================");
        ParentNode pn1 = new ParentNode("A",2);
        ChildNode cn1 = new ChildNode("a1");
        ChildNode cn2 = new ChildNode("a2");
        ChildNode cn3= new ChildNode("a3");

        ParentNode pn2 = new ParentNode("B",3);

        ChildNode cn21 = new ChildNode("b1");
        ChildNode cn22 = new ChildNode("b2");
        ChildNode cn23= new ChildNode("b3");


        ParentNode pn3 = new ParentNode("起始节点",1);
        pn3.addChild(pn1);
        pn1.addChild(cn1);
        pn1.addChild(cn2);
        pn1.addChild(cn3);
        pn1.addChild(pn2);
        pn2.addChild(cn21);
        pn2.addChild(cn22);
        pn2.addChild(cn23);
        pn3.show();
    }
}
