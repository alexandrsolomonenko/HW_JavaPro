package hw_16_11_2023.vttFiles;
//Есть архив VttFiles.zip (см. в группе дискорд) с набором vtt-файлов (субтитры к аудиодорожкам).
//Из субтитров нужно собрать единый файл txt для последующего создания документа со скриптами
//аудиодорожек. В txt поместите только тексты из субтитров. Все лишние записи (время, WEBVTT)
//должны быть удалены.

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        File vttFile = new File("D:\\VttFiles.zip");
        File outputFile = new File("D:\\file.txt");

        List<String> lines = new ArrayList<>();
        try (LineIterator it = FileUtils.lineIterator(vttFile, "UTF-8")) {
            while (it.hasNext()) {
                String line = it.nextLine();
                if (!line.isEmpty() && !line.startsWith("WEBVTT") && !line.matches("\\d{2}:\\d{2}:\\d{2}\\.\\d{3}")) {
                    lines.add(line);
                }
            }
        }

        FileUtils.writeLines(outputFile, lines, false);
    }
}
