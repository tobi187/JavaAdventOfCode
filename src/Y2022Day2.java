import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Y2022Day2 {

    public int depth;
    public int forwardPos;

    public void workflow() throws IOException {
        var path = Path.of("data/Y2022Day2_input.txt");
        var data = Files.readAllLines(path);
        for (var el : data) {
           destructureInput(el);
        }
        System.out.println(depth);
        System.out.println(forwardPos);
        System.out.println(forwardPos * depth);

    }

    public void destructureInput(String input) {
        var parts = input.split(" ");
        var amount = Integer.parseInt(parts[1]);
        switch (parts[0]) {
            case "forward" -> forwardPos += amount;
            case "down" -> depth += amount;
            case "up" -> depth -= amount;
        }
    }
}
