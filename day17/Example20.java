/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-04-22 15:53:37
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-04-23 12:39:54
 */
package day17;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Example20 {
  public static void main(String[] args) throws IOException {
    Path dicrectoryPath = Paths.get("Text");
    Files.createDirectories(dicrectoryPath);
    Path filePath = Paths.get("Text/test.txt");
    Files.createFile(filePath);
    List<String> list = new ArrayList<>();
    Files.write(filePath, list, StandardOpenOption.APPEND);
    List<String> lines = Files.readAllLines(filePath);
    System.out.println(Files.size(filePath));
    System.out.println(lines);
  }
}