
public class main {

    // Static helper method for O
    public static String[] getOPattern() {
        return new String[]{
                " ***  ",
                "*   * ",
                "*   * ",
                "*   * ",
                " ***  "
        };
    }

    // Static helper method for P
    public static String[] getPPattern() {
        return new String[]{
                "***** ",
                "*    *",
                "***** ",
                "*     ",
                "*     "
        };
    }

    // Static helper method for S
    public static String[] getSPattern() {
        return new String[]{
                " **** ",
                "*     ",
                " **** ",
                "     *",
                " **** "
        };
    }

    public static void main(String[] args) {

        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        // Assemble banner lines
        String[] banner = new String[o.length];

        for (int i = 0; i < o.length; i++) {
            banner[i] = String.join(" ",
                    o[i],
                    o[i],
                    p[i],
                    s[i]
            );
        }

        // Print using enhanced for loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
