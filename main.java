public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to OOPSBannerApp - UC4");
        System.out.println();
        String[] banner = new String[5];

        banner[0] = String.join("  ", "   ***        ***     *****     ****    ");
        banner[1] = String.join("  ", " **   **    **   **   **   **  **    ");
        banner[2] = String.join("  ", " **   **    **   **   ******    ****   ");
        banner[3] = String.join("  ", " **   **    **   **   **           **");
        banner[4] = String.join("  ", "   ***        ***     **        ****  ");

        for (String row : banner) {
            System.out.println(row);
        }
    }
}
