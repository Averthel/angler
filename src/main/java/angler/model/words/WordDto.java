package angler.model.words;

import java.util.Objects;

public class WordDto {

    private Long id;
    private String polishName;
    private String englishName;

    public WordDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPolishName() {
        return polishName;
    }

    public void setPolishName(String polishName) {
        this.polishName = polishName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WordDto wordDto = (WordDto) o;
        return Objects.equals(id, wordDto.id) &&
                Objects.equals(polishName, wordDto.polishName) &&
                Objects.equals(englishName, wordDto.englishName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, polishName, englishName);
    }

    @Override
    public String toString() {
        return "WordDto{" +
                "word ='" + polishName + '}';
    }
}