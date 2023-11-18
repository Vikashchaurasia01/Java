import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {
    private String userId;
    private String type;
    private double amount;
    private LocalDateTime timestamp;

    public Transaction(String userId, String type, double amount) {
        this.userId = userId;
        this.type = type;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
    }

    //@Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedTimestamp = timestamp.format(formatter);
        return String.format("[%s] %s - $%.2f", formattedTimestamp, type, amount);
    }

    public String getUserId() {
        return null;
    }
}
