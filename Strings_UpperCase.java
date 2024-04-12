
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Strings_UpperCase {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("RED", "grEEn", "white", "Orange", "pink");

        List<String> upperCase = stringList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Uppercase Strings: " + upperCase);


        List<String> lowerCase = stringList.stream()
                .map(String ::toLowerCase)
                .collect(Collectors.toList());

        System.out.println("\nLowercase Strings: " + lowerCase );




    }
}
