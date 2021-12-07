package Test;
import static com.company.Word.words;
import static org.junit.jupiter.api.Assertions.*;
import com.company.Word;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WordTest {
    Word word;
    @BeforeEach
    void setUp() {
        word = new Word();
    }

    @Test void words() {
        assertEquals("cat", words[0], "WordTest method not working.");
    }

    @Test
    void word() {
    }


    @AfterEach
    void tearDown() {
    }
}
