import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Part2 {

    public Part2() {

    }

    public List<String> readFile() {
        List input = Collections.emptyList();
        try {
            input = Files.readAllLines(Paths.get("./input.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return input;
    }

    public int calculateTotal(List<String> input) {
        int total = 0;
        for (String line: input) {
            total += this.calculateDivisibleValuesOnLine(line);
        }

        return total;
    }

    protected int calculateDivisibleValuesOnLine(String line) {
        String[] cells = line.trim().split("\t");
        ArrayList<Integer> cellValues = new ArrayList();
        for (String cell: cells) {
            cellValues.add(Integer.parseInt(cell.trim()));
        }

        for (Integer number: cellValues) {
            for (int i = 0; i < cellValues.size(); i++) {
                if (number % cellValues.get(i) != 0) {
                    continue;
                }

                int division = number / cellValues.get(i);
                if (division == 1) {
                    continue;
                }

                return division;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        Part2 part2 = new Part2();
        int total = part2.calculateTotal(part2.readFile());
        System.out.println(total);
    }
}
