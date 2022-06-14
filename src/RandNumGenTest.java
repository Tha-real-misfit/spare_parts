import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RandNumGenTest {
    @Test()
    public void differentNumber() {
        RandNumGen mytest = new RandNumGen();
        Integer finalNumber = mytest.orders(0);
        int total = String.valueOf(finalNumber).length();
        assertTrue(total == 6);

    }
}
