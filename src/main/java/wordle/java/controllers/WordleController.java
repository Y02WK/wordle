package wordle.java.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import wordle.java.model.Player;

@Controller
@RequestMapping(path="/", produces = MediaType.TEXT_HTML_VALUE)
public class WordleController {

    @PostMapping("/guess")
    String updateForm(@RequestBody MultiValueMap<String, String> form, Model model) {
        String savedPredictionsString = form.getFirst("savedPredictions");
        String savedResultsString = form.getFirst("savedResults");
        String guess = form.getFirst("guess");

        // initialize player using saved results and predictions
        Player player = new Player();
        if (savedResultsString != "") {
            int currentGuessIndex = StringUtils.countOccurrencesOf("|", savedResultsString);
            // load previous guesses
            
        }

        // add new guess to predictions


        // check new guess and generate result
        // add to model
        return "index";
    }
}
