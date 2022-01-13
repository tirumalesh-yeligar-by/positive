package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.QuoteService;

@RestController
@ComponentScan("service")
public class QuotesController {

    @Autowired
    private QuoteService quoteService;

    @GetMapping(value = {"/getQuotes"})
    public ResponseEntity<String> getQuotes(){
        var randomQuote = quoteService.getRandomQuote();
        return new ResponseEntity<>(randomQuote, HttpStatus.OK);
    }
}
