package proxy.dynamic.jdkproxy;

import proxy.staticproxy.Person;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

public class DynamicProxyTest {
    public static void main(String[] args) {
        try {
            Person persoon = (Person)new JDKMeipo().getInstance(new Customer());
            persoon.findLove();

            byte [] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
            FileOutputStream os = new FileOutputStream("D://$Proxy0.class");
            os.write(bytes);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
