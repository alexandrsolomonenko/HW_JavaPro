package hw_23_11_2023.copyPicture;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class Main {
    public static void main(String[] args) {
        try {
            // Получение HTML-документа
            Document document = Jsoup.connect("https://doodles.google/").get();

            // Получение всех элементов img
            Elements images = document.select("img");

            // Скачивание первых пяти картинок
            for (int i = 0; i < 5; i++) {
                Element image = images.get(i);
                String imageUrl = image.absUrl("src");

                // Скачивание файла
                URL url = new URL(imageUrl);
                URLConnection connection = url.openConnection();
                InputStream inputStream = connection.getInputStream();
                OutputStream outputStream = new FileOutputStream("image" + i + ".jpg");

                byte[] buffer = new byte[2048];
                int length;

                while ((length = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, length);
                }

                inputStream.close();
                outputStream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
