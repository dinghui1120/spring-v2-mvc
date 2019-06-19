package prototype.deepclone;

public class DeepCloneTest {
    public static void main(String[] args) {
        try {
            QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
            QiTianDaSheng clone = (QiTianDaSheng)qiTianDaSheng.clone();
            System.out.println("深克隆："+(qiTianDaSheng.jinGuBang ==clone.jinGuBang));//false
            QiTianDaSheng shallow = new QiTianDaSheng();
            QiTianDaSheng shallowClone = shallow.shallowClone(shallow);
            System.out.println("浅克隆："+(shallow.jinGuBang == shallowClone.jinGuBang));//true
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
