import java.util.Objects;

public final class Account {
    private final String accountNumber;
    private final String ownerName;
    private final long balance;

    public Account(String accountNumber, long balance, String ownerName) {
        if (accountNumber == null || !accountNumber.matches("\\d{3}-\\d{3}")) {
            throw new IllegalArgumentException("계좌번호 형식이 틀립니다.");
        }
        if (balance < 0) throw new IllegalArgumentException("잔액은 0원 이상이어야 합니다.");

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
    }

    public String getAccountNumber() { return accountNumber; }
    public long getBalance() { return balance; }
    public String getOwnerName() { return ownerName; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return balance == account.balance && Objects.equals(accountNumber, account.accountNumber);
    }

    @Override
    public int hashCode() { return Objects.hash(accountNumber, balance); }
}