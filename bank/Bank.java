package bank;

class Account {

    public String name;
    protected String email;
    private String password;

    // getters & setters
    public String getPassword() {
        return this.password;

    }

    public void setPassword(String pass) {
        this.password = pass;
    }
}

public class Bank {

    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "hemant ";
        account1.email = "hemantgamil.com";
        account1.setPassword("hema");
        System.out.println(account1.getPassword());
    }

}
