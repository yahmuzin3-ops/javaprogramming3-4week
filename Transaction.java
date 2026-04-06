import java.time.LocalDateTime;
import java.util.Objects;

public final class Transaction {
    private final LocalDateTime transactionAt;
    private final long amount;
    private final String type;

    public Transaction(long amount, String type) {
        if (amount <= 0) throw new IllegalArgumentException("금액은 0보다 커야 합니다.");
        if (!"DEPOSIT".equals(type) && !"WITHDRAW".equals(type)) {
            throw new IllegalArgumentException("유효하지 않은 거래 유형입니다.");
        }
        this.transactionAt = LocalDateTime.now();
        this.amount = amount;
        this.type = type;
    }

    public long getAmount() { return amount; }
    public String getType() { return type; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transaction)) return false;
        Transaction t = (Transaction) o;
        return amount == t.amount && Objects.equals(type, t.type);
    }

    @Override
    public int hashCode() { return Objects.hash(amount, type); }
}