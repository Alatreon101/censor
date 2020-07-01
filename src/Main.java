import java.util.Scanner;

/*
 *
 */

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        final String[] split = input.split(" ");

        for (int i = 0; i < split.length; i++) {

            if ("бяка".equals(split[i].toLowerCase())) {
                split[i] = "вырезано цензурой";
            }
        }

        System.out.println(String.join(" ", split));
    }
}
