import java.util.Objects;

public final class Stock {
    private final String ticker;
    private final String name;

    public Stock(String ticker, String name) {
        if (ticker == null || !ticker.matches("\\d{6}")) {
            throw new IllegalArgumentException("종목 코드는 숫자 6자리여야 합니다.");
        }
        this.ticker = ticker;
        this.name = name;
    }

    public String getTicker() { return ticker; }
    public String getName() { return name; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stock)) return false;
        return Objects.equals(ticker, ((Stock) o).ticker);
    }

    @Override
    public int hashCode() { return Objects.hash(ticker); }
}