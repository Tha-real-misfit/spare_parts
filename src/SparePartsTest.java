import org.junit.jupiter.api.Test;
import java.io.File;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SparePartsTest {

    @Test
    void fileCreation() {File file = new File("C:\\Users\\chapp\\Downloads\\w9 - java\\spare_parts\\infofile.txt");
        System.out.println(file.exists());
        assertTrue(file.exists());
    }
}