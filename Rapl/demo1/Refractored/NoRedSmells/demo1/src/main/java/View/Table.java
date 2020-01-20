package View;

import Utils.StringBetter;

import javax.management.Attribute;
import javax.management.AttributeList;
import java.util.List;

public class Table<T> implements ITable{
    private final List<Attribute> linLabl;
    private final List<Attribute> colLabl;
    private final List<List<String>> iT;
    private final StringBuilder builder;

    public Table(List<List<String>> iT, AttributeList linLabel, AttributeList colLabel) {
        this.linLabl = linLabel.asList();
        this.colLabl = colLabel.asList();
        this.iT = iT;
        this.builder = new StringBuilder();
    }

    private void printSeparatorLine(int[] sizeCols) {
        StringBetter sif = new StringBetter("-");
        for (int j = 0; j <= sizeCols.length - 1; j++)
            this.builder.append("+").append(sif.repeat(sizeCols[j]).toString());
        this.builder.append("+\n");
    }

    @Override
    public String toString() {
        builder.setLength(0);
        int col = this.colLabl.size();
        int lin = this.linLabl.size();
        StringBetter spac = new StringBetter(" ");

        /*find appropriate size for columns*/
        int[] sizeCols = new int[col + 1];
        int labelSize = 0;
        for (Attribute s : this.linLabl) labelSize = (labelSize < s.toString().length() ? s.toString().length() : labelSize);
        sizeCols[0] = labelSize + 2;
        for (int j = 0; j < col; j++) {
            sizeCols[j + 1] = this.colLabl.get(j).toString().length() + 2;
            for (int i = 0; i < lin; i++)
                sizeCols[j + 1] = (sizeCols[j + 1] < this.iT.get(i).get(j).toString().length() + 2) ?
                        this.iT.get(i).get(j).toString().length() + 2 : sizeCols[j + 1];
        }

        /*print label row*/
        this.printSeparatorLine(sizeCols);
        builder.append("|");
        builder.append(spac.repeat(sizeCols[0]));
        for (int j = 0; j < col; j++) {
            builder.append("| ").append(this.colLabl.get(j));
            builder.append(spac.repeat(sizeCols[j + 1] - this.colLabl.get(j).toString().length() - 1));
        }
        builder.append("|\n");
        this.printSeparatorLine(sizeCols);

        /* print contents*/
        for (int i = 0; i < lin; i++) {
            builder.append("| ").append(this.linLabl.get(i));
            builder.append(spac.repeat(sizeCols[0] - this.linLabl.get(i).toString().length() - 1));
            for (int j = 0; j < col; j++) {
                builder.append("| ").append(this.iT.get(i).get(j).toString());
                builder.append(spac.repeat(sizeCols[j + 1] - this.iT.get(i).get(j).toString().length() - 1));
            }
            builder.append("|\n");
            this.printSeparatorLine(sizeCols);
        }

        return builder.toString();
    }
}
