package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String name = "Yurii";
        String lastName = "Koryshko";
        String json = "{\"name\": \"" + name + "\", \"lastName\": \"" + lastName + "\"}";
        System.out.println(json);
    }
}