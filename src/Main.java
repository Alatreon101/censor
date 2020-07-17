import java.util.Scanner;

/*
 *
 */

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        //input = input.toLowerCase();
        System.out.println(input.replaceAll("(?iu)\\bбяка\\b", " - вырезано цензурой!"));
    }
}
