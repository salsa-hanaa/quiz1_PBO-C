// Encapsulates account credentials behind getter-style accessors so the
// internal fields are never exposed or mutated directly.
public class Q12ComputerAccount {
    private String realName;
    private String userName;
    private String password;

    public Q12ComputerAccount(String realName, String userName, String password) {
        this.realName = realName;
        this.userName = userName;
        this.password = password;
    }

    public void printRealName() { System.out.println("Real Name: " + this.realName); }
    public void printUserName() { System.out.println("Username: " + this.userName); }
    public void printPassword() { System.out.println("Password: " + this.password); }

    public void changePassword(String newPassword) {
        this.password = newPassword;
    }
}
