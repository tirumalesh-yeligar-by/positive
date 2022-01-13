package service;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.stream.Collectors;


import static java.nio.file.Files.lines;
import static java.nio.file.Paths.get;

@Service
public class QuoteService {

    private static final String quoteFilePath = "C:\\Users\\1027354\\Downloads\\positive\\src\\main\\resources\\quotes.txt";

    public String getRandomQuote() {
        try (var stream = lines(get(quoteFilePath))) {
            return stream.collect(Collectors.joining());
        } catch (IOException e) {
            System.out.println("Unable to read a file " + e);
        }
        return "";
    }

}
