import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Sarcasm {

    public static void main(String[] args) {
        final var text = "this does not align with our core values";

        var resultUpperCase = applyFunction(text.toLowerCase(), Character::toUpperCase);
        System.out.println(resultUpperCase);
    }

    private static String applyFunction(String text, Function<Character, Character> function) {
        return IntStream.range(0, text.length())
                .mapToObj(i -> (i % 2 == 0) ? function.apply(text.charAt(i)) : text.charAt(i))
                .map(Object::toString)
                .collect(Collectors.joining());
    }
}
