import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Part1 {

    public Part1() {

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

    public int calculateFileChecksum(List<String> input) {
        int checksum = 0;
        for (String line: input) {
            checksum += this.calculateLineChecksum(line);
        }

        return checksum;
    }

    protected int calculateLineChecksum(String line) {
        String[] cells = line.trim().split("\t");
        ArrayList<Integer> cellValues = new ArrayList();
        for (String cell: cells) {
            cellValues.add(Integer.parseInt(cell.trim()));
        }

        return Collections.max(cellValues) - Collections.min(cellValues);
    }

    public static void main(String[] args) {
        Part1 part1 = new Part1();
        int checksum = part1.calculateFileChecksum(part1.readFile());
        System.out.println(checksum);
    }
}
