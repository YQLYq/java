package day10.Account;
public class AccountText {
    private String firstName;
    private String lastName;
    private Account account;

    
    public AccountText(String firstName, String lastName, Account account) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.account = account;
    }


    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public Account getAccount() {
        return this.account;
    }

    
}