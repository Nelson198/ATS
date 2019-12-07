package Model;

import Exceptions.*;
import Utils.Point;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Parser {
    private List<String> file;
    private static final Logger LOGGER = Logger.getLogger( Parser.class.getName() );

    public Parser() {
        this.file = new ArrayList<>();
    }

    public Parser(String db, UMCarroJa model) {
        try {
            this.file = Files
                    .readAllLines(Paths.get(db), StandardCharsets.UTF_8)
                    .stream()
                    .map(String::trim)
                    .filter(s -> !s.startsWith("--"))
                    .filter(s -> s.contains(":") && s.contains(","))
                    .map(e -> this.parseLine(e, model))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            LOGGER.log(Level.ALL, e.toString(), e);
        }
    }

    private String parseLine(String l, UMCarroJa model){
        String[] pLine = l.split(":");
        String categoria = pLine[0];
        String[] content = pLine[1].split(",");
        try {
            switch (categoria) {
                case "NovoProp":
                    if (content.length != 4)
                        break;
                    model.addUser(new Owner(
                            content[2],
                            content[0],
                            content[3],
                            Integer.parseInt(content[1]),
                            content[2]
                    ));
                    break;
                case "NovoCliente":
                    if (content.length != 6)
                        break;
                    model.addUser(new Client(
                            new Point(Double.parseDouble(content[4]), Double.parseDouble(content[5])),
                            content[2],
                            content[2],
                            content[0],
                            content[3],
                            Integer.parseInt(content[1])
                    ));
                    break;
                case "NovoCarro":
                    if (content.length != 10) {
                        break;
                    }
                    model.addCar(
                            content[2],
                            new StringBuilder()
                                    .append(content[3])
                                    .append("@gmail.com")
                                    .toString(),
                            Car.CarType.fromString(content[0]),
                            Double.parseDouble(content[4]),
                            Double.parseDouble(content[5]),
                            Double.parseDouble(content[6]),
                            Integer.parseInt(content[7]),
                            new Point(Double.parseDouble(content[8])
                                    , Double.parseDouble(content[9])),
                            content[1]
                    );
                    break;
                case "Aluguer":
                    if (content.length != 5)
                        break;
                    aluguerTryCatch(model, content);
                    break;
                case "Classificar":
                    if (content.length != 2)
                        break;
                    model.rate(content[0], Integer.parseInt(content[1]));
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + categoria);
            }
        }
        catch (InvalidUserException
                | UserExistsException
                | CarExistsException
                | UnknownCarTypeException
                | UnknownCompareTypeException
                | InvalidCarException e) {
            LOGGER.log(Level.ALL, e.toString(), e);
        }
        return l;
    }

    private void aluguerTryCatch(UMCarroJa model, String[] content) throws UnknownCompareTypeException, InvalidUserException, UnknownCarTypeException {
        try {
            model.rental(new StringBuilder()
                            .append(content[0])
                            .append("@gmail.com")
                            .toString(),
                    new Point(Double.parseDouble(content[1])
                            , Double.parseDouble(content[2])),
                    content[4], Car
                            .CarType
                            .fromString(content[3]));
        } catch (NoCarAvaliableException e) {
            LOGGER.log(Level.ALL, e.toString(), e);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || this.getClass() != o.getClass()) return false;

        Parser parser = (Parser) o;
        return this.file.equals(parser.file);
    }

    @Override
    public int hashCode() {
        return Objects.hash(file);
    }
}
