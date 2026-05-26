
public class Example2 {

    public static void main(String args[]) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Dhanvanth";
        myAcc.setpassword("dhanvanth@22");
    }
}

class BankAccount {

    public String username;
    private String password;

    public void setpassword(String pwd) {
        password = pwd;
    }
}
