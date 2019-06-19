package singleton.register;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EnumSingletonTest {
    public static void main(String[] args) {
        EnumSingleton s1 = null;
        EnumSingleton s2 = EnumSingleton.getInstance();
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("EnumSingleton");
            ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);
            oos.writeObject(s2);
            oos.flush();
            oos.close();

            FileInputStream fileInputStream = new FileInputStream("EnumSingleton");
            ObjectInputStream ois = new ObjectInputStream(fileInputStream);
            s1 = (EnumSingleton)ois.readObject();
            ois.close();
            System.out.println(s1);//INSTANCE
            System.out.println(s2);//INSTANCE
            System.out.println(s1==s2);//true
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
