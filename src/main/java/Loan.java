import org.w3c.dom.ls.LSOutput;

public class Loan {
    private String borrower;
    private int amount;
    private boolean isPaid;
    private double interestRate;

    public Loan(String borrower, int amount, double interestRate) {
        this.borrower = borrower;
        this.amount = amount;
        this.interestRate = interestRate;
        this.isPaid = false;
        if (amount > MAX_LOAN_AMOUNT) {
            MAX_LOAN_AMOUNT = amount;
        }
    }

    public static int MAX_LOAN_AMOUNT = 0;

    public void setAsPaid() {
        isPaid = true;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public String getBorrower() {
        return borrower;
    }

    public String getDisplayString() {
        return borrower + ": " + amount;
    }

    public double getProfit() {
        return amount * interestRate;
    }

}
