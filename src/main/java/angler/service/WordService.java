package angler.service;

import angler.model.words.Word;
import angler.model.words.WordDto;
import angler.model.words.WordMapper;
import angler.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class WordService {

    private WordRepository wordRepository;

    @Autowired
    public WordService(WordRepository wordRepository) {
        this.wordRepository = wordRepository;
    }

    public WordDto save(WordDto wordDto){
        Word wordEntity = WordMapper.toEntity(wordDto);
        Word savedWord = wordRepository.save(wordEntity);
        return WordMapper.toDto(savedWord);
    }

    public List<WordDto> findAll(){
        return wordRepository.findAll()
                .stream()
                .map(WordMapper::toDto)
                .collect(Collectors.toList());
    }
}