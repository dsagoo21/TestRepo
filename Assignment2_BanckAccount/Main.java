import java.util.Scanner;  // Import the Scanner class
 
class Main {
    public void runApp() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which function would you like to use?");
        System.out.println("Show Account Balance[A]");
        System.out.println("Deposit Money[B]");
        System.out.println("Withdraw Money[C]");
        System.out.println("Exit[D]");
        String option = scanner.nextLine();

        BankAccount bankAccount = new BankAccount();
        switch (option) {
            case "A":
                System.out.println("Account Balance: " + bankAccount.getBalance());
                break;

            case "B":
                System.out.println("Input the amount:");
                String dAmount = scanner.nextLine();
                bankAccount.deposit(Double.valueOf(dAmount));
                break;

            case "C":
                System.out.println("Input the amount:");
                String wAmount = scanner.nextLine();
                bankAccount.withdraw(Double.valueOf(wAmount));
                break;

            default:
                System.out.println("You've exited.");
        }
    }
    public static void main(String[] args) {
        Main m = new Main();
        m.runApp();
    }
    
}