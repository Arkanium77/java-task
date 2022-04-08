package cz.acamar.tasks;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1Tests {

    private final Task1 task1 = new Task1();

    @ParameterizedTest
    @MethodSource("stringsAndLastWordLength")
    void test_lastWordLength(String str, int lastWordLength) {
        assertEquals(lastWordLength, task1.lengthOfLastWord(str));
    }

    private static Stream<Arguments> stringsAndLastWordLength() {
        return Stream.of(
                Arguments.of("Hello world", 5),
                Arguments.of("   fly me   to   the moon  ", 4),
                Arguments.of("William Shakespeare was an English   playwright", 10),
                Arguments.of("one_word", 8),
                Arguments.of("                             ", 0),
                Arguments.of("", 0),
                /*
                This method does not accept "alternative" Whitespace Characters
                (such as NSBP or unicode whitespace characters https://qwerty.dev/whitespace/)
                as spaces, because this was not mentioned in the problem statement.

                If they HAD to be treated as spaces, I would have used a regular expression
                 */
                Arguments.of("                              ", 1)

        );
    }
}
