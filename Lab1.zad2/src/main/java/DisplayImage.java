import ij.IJ;
import ij.ImagePlus;
import ij.process.ImageProcessor;

import java.util.concurrent.TimeUnit;

public class DisplayImage {

    public void DisplayImage() throws InterruptedException {

        ImagePlus image = IJ.openImage("src/main/java/kotek.png");

        ImageProcessor process = image.getProcessor();
        process.blurGaussian(3);

        image.show();
        TimeUnit.SECONDS.sleep(10);
        image.close();
    }
}

