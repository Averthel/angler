package angler.controller;

import angler.model.words.Word;
import angler.model.words.WordDto;
import angler.model.words.WordMapper;
import angler.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
public class WordController {

    private WordService wordService;

    @Autowired
    public WordController(WordService wordService){
        this.wordService = wordService;
    }

    @PostMapping("/save")
    public String saveWord(@ModelAttribute WordDto wordDto){
        wordService.save(wordDto);
        return "/successMessage";
    }

    @GetMapping("/show")
    public String showAll(Model model){
        List<WordDto> allWords = wordService.findAll();
        model.addAttribute("allWords", allWords);
        return "showAll";
    }
}
