import java.util.Objects;

public class Transaction {

    private int accountNum;
    private String date;
    private Double amount;

    public Transaction(int accountNum, String date, Double amount) {
        this.accountNum = accountNum;
        this.date = date;
        this.amount = amount;
    }

    public Transaction() {
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "accountNum=" + accountNum +
                ", date='" + date + '\'' +
                ", amount=" + amount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return accountNum == that.accountNum && Objects.equals(date, that.date) && Objects.equals(amount, that.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNum, date, amount);
    }
}
