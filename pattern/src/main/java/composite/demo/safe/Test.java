package composite.demo.safe;


public class Test {
    public static void main(String[] args) {
        System.out.println("============安全组合模式===========");

        File qq = new File("QQ.exe");

        Folder office = new Folder("办公软件",2);
        File word = new File("Word.exe");
        office.add(word);

        Folder wps = new Folder("金山软件",3);
        wps.add(new File("WPS.exe"));
        office.add(wps);

        Folder root = new Folder("根目录",1);
        root.add(qq);
        root.add(office);
        System.out.println("----------show()方法效果-----------");
        root.show();
    }
}