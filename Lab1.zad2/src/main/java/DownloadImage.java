

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;


public class DownloadImage {

    public static void main(String[] args) throws IOException, InterruptedException {

        File image = new File("src/main/java/kotek.png");
        DisplayImage displayImage = new DisplayImage();

        System.out.println("Podaj 1 jeżeli chcesz żeby predefiniowany obraz się wyświetlił, jeżeli chcesz żeby wyświetlił się twój obraz podaj 2:");
        Scanner scan = new Scanner(System.in);
        int opcja = scan.nextInt();

        switch(opcja) {
            case 1:
                URL url1 = new URL("https://wompampsupport.azureedge.net/fetchimage?siteId=7575&v=2&jpgQuality=100&width=700&url=https%3A%2F%2Fi.kym-cdn.com%2Fentries%2Ficons%2Ffacebook%2F000%2F026%2F489%2Fcrying.jpg");

                org.apache.commons.io.FileUtils.copyURLToFile(url1, image);

                displayImage.DisplayImage();
                break;
            case 2:
                System.out.println("Podaj link do twojego obrazka:");
                String link = scan.next();
                URL url2 = new URL(link);
                org.apache.commons.io.FileUtils.copyURLToFile(url2, image);

                displayImage.DisplayImage();


                break;
            default:
                System.out.println("Nie udało się wykonać zadania");
        }

    }
}
