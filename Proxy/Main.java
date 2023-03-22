package Proxy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(final String[] arguments) {
        Image image1 = new ProxyImage("Koira");
        Image image2 = new ProxyImage("Kissa");

        List<Image> photoAlbum = new ArrayList<>();
        photoAlbum.add(image1);
        photoAlbum.add(image2);

        for (Image image : photoAlbum) {
            image.showData();
        }

        // load and display image1
        image1.displayImage();

        // image 1 doesn't need to be loaded
        for (Image image : photoAlbum) {
            image.displayImage();
        }
    }
}
