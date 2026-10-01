import java.util.Scanner;

public class Q12ComputerAccountTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama asli: ");
        String realName = scanner.nextLine();
        System.out.print("Username: ");
        String userName = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        Q12ComputerAccount acc = new Q12ComputerAccount(realName, userName, password);
        acc.printRealName();
        acc.printUserName();
        acc.printPassword();

        System.out.print("Password baru: ");
        String newPassword = scanner.nextLine();
        acc.changePassword(newPassword);
        acc.printPassword();

        scanner.close();
    }
}
