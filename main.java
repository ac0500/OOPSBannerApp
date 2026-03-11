public class main {

    public static void main(String[] args) {

        // Inline array initialization
        String[] banner = {

                String.join(" ",
                        " OOO  ",
                        " OOO  ",
                        "PPPPP ",
                        " SSSS "
                ),

                String.join(" ",
                        "O   O ",
                        "O   O ",
                        "P    P",
                        "S     "
                ),

                String.join(" ",
                        "O   O ",
                        "O   O ",
                        "PPPPP ",
                        " SSSS "
                ),

                String.join(" ",
                        "O   O ",
                        "O   O ",
                        "P     ",
                        "     S"
                ),

                String.join(" ",
                        " OOO  ",
                        " OOO  ",
                        "P     ",
                        " SSSS "
                )
        };

        // Enhanced for loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}