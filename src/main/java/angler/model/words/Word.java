package angler.model.words;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
@Table(name = "word")
public class Word {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max = 32)
    private String polishName;

    @NotNull
    @Size(max = 32)
    private String englishName;

    public Word() {
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
        Word word = (Word) o;
        return Objects.equals(id, word.id) &&
                Objects.equals(polishName, word.polishName) &&
                Objects.equals(englishName, word.englishName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, polishName, englishName);
    }

    @Override
    public String toString() {
        return "Word{" +
                "word ='" + polishName + '}';
    }
}