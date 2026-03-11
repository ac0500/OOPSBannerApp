import java.util.HashMap;
import java.util.Map;

/**
 * OOPS Banner App - UC8
 * Using HashMap to Store Character Patterns
 */
public class main {

    /**
     * Utility Method to Build Character Patterns
     */
    public static Map<Character, String[]> buildCharacterMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        map.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        map.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        return map;
    }

    /**
     * Utility Method to Print Banner
     */
    public static void printBanner(String word, Map<Character, String[]> map) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = map.get(ch);

                if (pattern != null) {
                    line.append(pattern[row]).append("  ");
                }
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> characterMap = buildCharacterMap();

        String word = "OOPS";

        printBanner(word, characterMap);
    }
}