package prototype.simple;

import java.util.List;

public class ConcretePrototypeA implements Prototype {
    private String name;
    private Integer age;
    private List<String> habbies;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getHabbies() {
        return habbies;
    }

    public void setHabbies(List<String> habbies) {
        this.habbies = habbies;
    }

    @Override
    public Prototype clone() {
        ConcretePrototypeA concretePrototypeA = new ConcretePrototypeA();
        concretePrototypeA.setName(this.name);
        concretePrototypeA.setAge(this.age);
        concretePrototypeA.setHabbies(this.habbies);
        return concretePrototypeA;
    }
}
