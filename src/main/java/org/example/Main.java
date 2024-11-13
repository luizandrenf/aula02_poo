package org.example;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        init();
    }

    public static void init(){
        Person person = new Person();
        dataInput(person);
        showData(person);
    }

    public static void dataInput(Person person){
        person.setName(JOptionPane.showInputDialog("Digite seu nome"));
        person.setAge(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade")));
        person.setHeight(Float.parseFloat(JOptionPane.showInputDialog("Digite sua altura")));
        person.setWeight(Float.parseFloat(JOptionPane.showInputDialog("Digite sua peso")));
        person.setCpf(JOptionPane.showInputDialog("Digite seu cpf"));
    }

    public static void showData(Person person) {
        StringBuilder outputMessage = new StringBuilder();
        outputMessage.append("Nome: ").append(person.getCpf());
        outputMessage.append("\n");
        outputMessage.append("Idade: ").append(person.getAge());
        outputMessage.append("\n");
        outputMessage.append("Altura: ").append(person.getHeight());
        outputMessage.append("\n");
        outputMessage.append("Peso: ").append(person.getWeight());
        outputMessage.append("\n");
        outputMessage.append("CPF: ").append(person.getCpf());
        outputMessage.append("\n");

        JOptionPane.showMessageDialog(null, outputMessage);
    }
}