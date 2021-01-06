import ij.IJ;
import ij.ImagePlus;
import ij.process.ImageProcessor;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DownloadAndDisplayImage {
    public static void main(String[] args) throws IOException, InterruptedException {
        URL link = new URL("https://bi.im-g.pl/im/f4/a5/18/z25845492IER,Robert-Maklowicz.jpg");
        File zdjecie = new File("src/main/java/maklowicz.jpg");

        org.apache.commons.io.FileUtils.copyURLToFile(link,zdjecie);

        ImagePlus image = IJ.openImage("src/main/java/maklowicz.jpg");

        ImageProcessor process = image.getProcessor();
        process.blurGaussian(3);

        image.show();
        TimeUnit.SECONDS.sleep(10);
        image.close();
    }
}
