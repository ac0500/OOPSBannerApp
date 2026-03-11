/**
 * OOPS Banner App - UC7
 * Store Character Pattern in an Inner Static Class
 */
public class main {

    /**
     * Inner Static Class to store character and its pattern
     */
    static class CharacterPattern {

        private char character;
        private String[] pattern;

        /**
         * Constructor
         * @param character Character to store
         * @param pattern 7-line pattern
         */
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         * @return pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to print banner
     */
    public static void printBanner(CharacterPattern[] patterns) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (CharacterPattern cp : patterns) {
                line.append(cp.getPattern()[row]).append("  ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        CharacterPattern O = new CharacterPattern('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        CharacterPattern P = new CharacterPattern('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        CharacterPattern S = new CharacterPattern('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        CharacterPattern[] word = {O, O, P, S};

        printBanner(word);
    }
}