package builder.simple;


public class Person {

    private String name;
    private int age;

    private Person(Builder builder) {
        name = builder.name;
        age = builder.age;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String name;
        private int age;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    public static void main(String[] args) {
        Person person = Person.builder().age(1).build();
    }

}
