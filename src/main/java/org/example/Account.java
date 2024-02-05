package org.example;

import java.math.BigDecimal;
import java.util.Objects;

public class Account {
    private String accountNumber;
    private BigDecimal accountBalance;
    private Client client;

    public Account(String accountNumber, BigDecimal accountBalance, Client client) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.client = client;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        if (!Objects.equals(accountNumber, account.accountNumber))
            return false;
        if (!Objects.equals(accountBalance, account.accountBalance))
            return false;
        return Objects.equals(client, account.client);
    }

    @Override
    public int hashCode() {
        int result = accountNumber != null ? accountNumber.hashCode() : 0;
        result = 31 * result + (accountBalance != null ? accountBalance.hashCode() : 0);
        result = 31 * result + (client != null ? client.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountBalance=" + accountBalance +
                ", client=" + client +
                '}';
    }
}
