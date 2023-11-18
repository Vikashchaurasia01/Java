import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransactionHistory {
    private Map<String, List<Transaction>> transactionMap;

    public TransactionHistory() {
        transactionMap = new HashMap<>();
    }

    public void addTransaction(Transaction transaction) {
        String userId = transaction.getUserId();

        if (!transactionMap.containsKey(userId)) {
            transactionMap.put(userId, new ArrayList<>());
        }

        List<Transaction> userTransactions = transactionMap.get(userId);
        userTransactions.add(transaction);
    }

    public List<Transaction> getTransactions(String userId) {
        if (transactionMap.containsKey(userId)) {
            return transactionMap.get(userId);
        }

        return new ArrayList<>();
    }
}
