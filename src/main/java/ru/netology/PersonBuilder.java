package ru.netology;

public class PersonBuilder {
    private String name;
    private String surname;
    private int age = -1;
    private String address;

    public Person build() {
        if (this.age < 0 && this.age != -1) {
            throw new IllegalArgumentException("Возраст не может быть меньше нуля");
        }
        if (this.name == null | this.surname == null) {
            StringBuilder errorMessge = new StringBuilder().append("Не заполнены обязательные данные:");
            if (this.name == null) {
                errorMessge.append("\n- Имя");
            }
            if (this.name == null) {
                errorMessge.append("\n- Фамилия");
            }
            throw new IllegalStateException(errorMessge.toString());
        }
        if (this.address == null) {
            this.address = "";
        }
        return new Person(this.name, this.surname, this.age, this.address);
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }


}
