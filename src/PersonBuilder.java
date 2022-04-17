public class PersonBuilder {

    private String name;
    private String surname;
    private Integer age;
    private String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(Integer age) {
        if (age < 0) throw new IllegalArgumentException("Некорректный возраст");
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        Person person;
        if (name == null || name.isEmpty()) throw new IllegalStateException("Не указанно имя");
        if (surname == null || name.isEmpty()) throw new IllegalStateException("Не указанна фамилия");
        if (age != null) {
            person = new Person(name, surname, age);
        } else {
            person = new Person(name, surname);
        }
        if (address != null && !address.isEmpty()) person.setAddress(address);
        return person;
    }
}