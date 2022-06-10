package pl.lublin.wsei.java.cwiczenia.console;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class TestNioCopy {
    public static void main(String[] args) throws IOException {
        //long starTime = System.currentTimeMillis();
        long startTime = -System.nanoTime();//dokładniejszy pomiar
        File oryginal = new File("sample_1920x1280.tiff");
        File kopia = new File("img_copy2.tiff");
        Files.copy(oryginal.toPath(), kopia.toPath());
        // System.out.println("Czas kopiowa: " + (System.currentTimeMillis() - startTime)+" ms");
        System.out.println("Czas kopiowania: " + (float)(System.nanoTime() - startTime)/1000000+" ms");
    }
}
    //Czas kopiowania: 2.76874982E9 ms