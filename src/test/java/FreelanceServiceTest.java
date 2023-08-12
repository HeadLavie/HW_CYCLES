import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.services.FreelanceService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FreelanceServiceTest {

    @ParameterizedTest

 // @CsvSource({
//    "3, 10000, 3000, 20000",
//    "2, 100000, 60000, 150000"
//   })

    @CsvFileSource(files = "src\test\resources\freelance.csv")
    public void testCalcCount(int expected, int income, int expenses, int threshhold) {
        FreelanceService service = new FreelanceService();

        //int expected = 2;
        int actual = service.calcFreelance(income, expenses, threshhold);

        Assertions.assertEquals(expected,actual);
    }

}
