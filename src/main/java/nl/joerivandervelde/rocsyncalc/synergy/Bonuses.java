package nl.joerivandervelde.rocsyncalc.synergy;

import net.steppschuh.markdowngenerator.table.TableRow;
import nl.joerivandervelde.rocsyncalc.wonder.Wonder;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Bonuses {

    public int economy;
    public int military;
    public int research;
    public Wonder[] forWonders;

    @Override
    public String toString() {
        return "| " + economy + " | " + military + " | " + research + " | " + Stream.of(forWonders).map(String::valueOf).collect(Collectors.joining(" | ")) + " |";
    }

    public TableRow asRow() {
        TableRow<String> tableRow = new TableRow<>();
        tableRow.setColumns(Arrays.asList(economy+"", military+"", research+"", forWonders[0].toString(), forWonders[1].toString(), forWonders[2].toString(), forWonders[3].toString(), forWonders[4].toString(), forWonders[5].toString(), forWonders[6].toString(), forWonders[7].toString()));
        return tableRow;
    }
}
