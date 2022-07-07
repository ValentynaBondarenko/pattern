package com.luxoft.teacher.factorymethod;

public class CommunityOfDevelopers {
    /**
     * Фабричний меторд: Створює програмістів ["java","python","ruby"]
     * кожен з цих програмістів уміє писати код
     * коли створюється java-programmer, виводиться на екран меседж "I am writing code in Java"
     * коли створюється python-programmer, виводиться на екран меседж "I am writing code in Python"
     * коли створюється ruby-programmer, виводиться на екран меседж "I am writing code in Ruby"
     */
    public static void main(String[] args) {
        Developer java = DeveloperFactory.createDeveloperBySpecialty("java");
        java.writeCode();

        Developer python = DeveloperFactory.createDeveloperBySpecialty("python");
        python.writeCode();

        Developer ruby = DeveloperFactory.createDeveloperBySpecialty("Ruby");
        ruby.writeCode();

    }

}
