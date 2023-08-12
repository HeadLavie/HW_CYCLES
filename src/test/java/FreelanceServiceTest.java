import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.FreelanceService;

public class FreelanceServiceTest {

    @Test
    public void shouldCalcCount() {
        FreelanceService service = new FreelanceService();

        int expected = 2;
        int actual = service.calcFreelance(100000, 60000, 150000);

        Assertions.assertEquals(expected, actual);
    }

}
