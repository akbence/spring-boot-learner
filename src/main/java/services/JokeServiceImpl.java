package services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService{

    private final ChuckNorrisQuotes quotes;

    public JokeServiceImpl() {
        this.quotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getRandomJoke(){
        return quotes.getRandomQuote();
    }
}
