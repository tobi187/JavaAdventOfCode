import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Y2022Day1 {

    public static void main(String[] args) throws IOException {
        var inputNumbers = readFile();

        var counter = 0;
        for (var i = 0; i < inputNumbers.size() - 1; i++) {
            if (inputNumbers.get(i) < inputNumbers.get(i + 1))
                counter++;
        }

        System.out.println(counter);
    }

    public static ArrayList<Integer> readFile() throws IOException {
        var path = Path.of("data/Y2022Day1_input.txt");
        var file = Files.readAllLines(path);
        var intList = new ArrayList<Integer>();
        for (var el : file) {
            intList.add(Integer.parseInt(el));
        }
        return intList;
    }

}
