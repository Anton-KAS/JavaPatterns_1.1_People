package ru.netology;

public class Person {
    private String name;
    private String surname;
    private int age;
    private String address;

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(this.surname)
                .setAge(0)
                .setAddress(this.address);
    }

    public void happyBithday() {
        if (this.hasAge()) {
            this.age++;
        }
    }

    public boolean hasAge() {
        return this.age != -1;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean hasAddress() {
        return this.address.length() > 0;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getAge() {
        return this.age;
    }

    public String getAddress() {
        return this.address;
    }

    @Override
    public String toString() {
        return this.name + " " + this.surname;
    }

}
