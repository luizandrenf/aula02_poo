package org.example;

public class Person {
    private String name;
    private Integer age;
    private Float height;
    private Float weight;

    private CPF cpf;

    // Atributo do tipo classe representa
    // uma relação enre a classe Person
    // e a classe CPF

    public Person(){}

    public Person(String name, Integer age, Float height, Float weight, CPF cpf) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.cpf = cpf;
    }

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

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public String getCpf() {
        return cpf.getNumber();
    }

    public void setCpf(String cpf) {
        CPF newCPF = new CPF(cpf);
        this.cpf = newCPF;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", cpf=" + cpf.getNumber() +
                '}';
    }
}
