package prototype.simple;

import java.util.ArrayList;
import java.util.List;

public class SimplePrototypeTest {
    public static void main(String[] args) {
        ConcretePrototypeA a = new ConcretePrototypeA();
        a.setName("jack");
        a.setAge(18);
        List<String> habbiesList = new ArrayList<>();
        a.setHabbies(habbiesList);
        Client client = new Client(a);
        ConcretePrototypeA prototypeClone = (ConcretePrototypeA)client.startClone();
        System.out.println(a);
        System.out.println(prototypeClone);
        System.out.println("原型对象："+a.getHabbies());
        System.out.println("克隆对象:"+prototypeClone.getHabbies());
        System.out.println(a.getHabbies() == prototypeClone.getHabbies());
    }
}
