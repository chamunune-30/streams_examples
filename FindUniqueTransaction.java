import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindUniqueTransaction {

    public static void main(String[] args) {

        List<Transaction> transactions = List.of(new Transaction(1,"2024-05-05", 84.4),
                new Transaction(1,"2024-05-05", 84.4),
                new Transaction(2,"2024-06-05", 85.0));

       List<Transaction> uniqueTransactions = transactions.stream()
               .distinct()
               .collect(Collectors.toList());

        uniqueTransactions.forEach(System.out::println);
    }
}
