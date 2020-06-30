class BankAccount{
    // creates fields
    private String accountNumber = "123456789";
    private double balance = 50.0;
    private String customerName = "Jason";
    private String email = "lauran.0020@gmail.com";
    private String phoneNumber = "9131231234";

    public double getBalance() {
        return this.balance;
    }

    // creates methods
    public void deposit(double amount) {
        balance += amount;
        System.out.println("New Balance: " + balance);
        System.out.println("Customer Nanem: " + customerName);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Funds");
        }
        else {
            balance -= amount;
            System.out.println("New Balance: " + balance);
            System.out.println("Customer Nanem: " + customerName);

        }
    }

    public void printInfo() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
    }
}
