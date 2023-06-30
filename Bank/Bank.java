package project8;

import java.util.Vector;

public class Bank {
    private Vector<Account> accounts;

    public Bank() {
        accounts = new Vector<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Vector<Account> getAccounts() {
        return accounts;
    }
}
