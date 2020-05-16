package angler.model.words;

public class WordMapper {

    public static WordDto toDto(Word word){
        WordDto dto = new WordDto();
        dto.setId(word.getId());
        dto.setPolishName(word.getPolishName());
        dto.setEnglishName(word.getEnglishName());
        return dto;
    }

    public static Word toEntity(WordDto wordDto){
        Word entity = new Word();
        entity.setId(wordDto.getId());
        entity.setPolishName(wordDto.getPolishName());
        entity.setEnglishName(wordDto.getEnglishName());
        return entity;

    }
}
