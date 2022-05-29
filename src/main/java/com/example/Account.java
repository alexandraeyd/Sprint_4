package com.example;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        boolean isNameApproved = (name.length() >= 3)&&(name.length()<19)&&(name.contains(" "))&&(!name.startsWith(" "))
                &&(!name.endsWith(" "))&&(!name.replaceFirst(" ","").contains(" "));
        return  isNameApproved;
    }

}