import java.util.Scanner;

public class Language {
    public static void main(String[] args) {
        for (; ; ) {
            Scanner in = new Scanner(System.in);
            String eng = "Good afternoon!";
            String fr = "Bonjour!";
            String ger = "Guten Tag!";
            String rus = "Добрый день!";


            System.out.print("\nEnter Your language: ");
            String leng = in.nextLine();

            if (leng.equals( "English")) {
                System.out.println("language English: " + eng);
            } else if (leng.equals("French")) {
                System.out.println("language French: " + fr);
            } else if (leng.equals("German")) {
                System.out.println("language German: " + ger);
            } else if (leng.equals("Russian")) {
                System.out.println("language Russian: " + rus);
            }
        }

    }
}
