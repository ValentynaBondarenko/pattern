package com.luxoft.teacher.factorymethod;

public class DeveloperFactory {
  public  static Developer createDeveloperBySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("java")) {
            return new JavaDeveloper();
        } else if (specialty.equalsIgnoreCase("python")) {
            return new PythonDeveloper();
        } else if (specialty.equalsIgnoreCase("ruby")) {
            return new RubyDeveloper();
        } else throw new RuntimeException("exception");
    }
}
