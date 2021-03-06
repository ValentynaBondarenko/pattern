package com.luxoft.lections.factorymethod;

public class AccountFactory {
    public static AbstractAccount newAccount(String accountType) {
        if (accountType.equalsIgnoreCase("CHECKING")) {
            return new CheckingAccount(0.0, 0.0);
        } else if (accountType.equalsIgnoreCase("SAVING")) {
            return new SavingAccount(0.0);
        } else throw new RuntimeException("exception");
    }

    public static void main(String[] args) {
        //get an object of CheckingAccount
        AbstractAccount account1 = AccountFactory.newAccount("CHECKING");
        System.out.println(account1.getClass().getSimpleName());

        //get an object of SavingAccount
        AbstractAccount account2 = AccountFactory.newAccount("SAVING");
        System.out.println(account2.getClass().getSimpleName());

    }

}

