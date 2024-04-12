import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindStringBeginWithSpecificLetter {

    public static void  main(String[] args){

        List<String> listOfStrings = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
        char startingLetter = 'B';

        long findString = listOfStrings.stream()
                .filter(s -> s.startsWith(String.valueOf(startingLetter)))
                .count();

        System.out.println("String with starting letter " + startingLetter + " :"  + findString);
        char startingLetter1 = 'G';

        long findString1 = listOfStrings.stream()
                .filter(s -> s.startsWith(String.valueOf(startingLetter1)))
                .count();

        System.out.println("\nString with starting letter " + startingLetter1 + " :"  + findString1);
    }
}
