/**
 * OOPSBannerApp
 *
 * UC4: Refactored banner using String array and enhanced for-loop
 * to improve modularity and reusability.
 *
 * @author Shukkur
 * @version 4.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = {

                String.join("", " *****   ", " *****   ", " *****   ", " ***** "),
                String.join("", "*     * ", "*     * ", "*     * ", "*     *"),
                String.join("", "*     * ", "*     * ", "*     * ", "*      "),
                String.join("", "*     * ", "*     * ", " *****  ", " *****  "),
                String.join("", "*     * ", "*     * ", "*       ", "     *  "),
                String.join("", "*     * ", "*     * ", "*     * ", "*     * "),
                String.join("", " *****   ", " *****   ", " *****   ", " ***** ")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}