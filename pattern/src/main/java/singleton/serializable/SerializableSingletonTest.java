package singleton.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableSingletonTest {
    public static void main(String[] args) {
        SerializableSingleton s1 = null;
        SerializableSingleton s2 = SerializableSingleton.getInstance();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("serializable");
            ObjectOutputStream oos = null;
            oos = new ObjectOutputStream(fileOutputStream);
            oos.writeObject(s2);
            oos.flush();
            oos.close();

            FileInputStream fileInputStream = new FileInputStream("serializable");
            ObjectInputStream ois = new ObjectInputStream(fileInputStream);
            s1 = (SerializableSingleton)ois.readObject();
            ois.close();
            System.out.println(s1);//singleton.serializable.SerializableSingleton@5fd0d5ae
            System.out.println(s2);//singleton.serializable.SerializableSingleton@135fbaa4
            System.out.println(s1==s2);//false
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
