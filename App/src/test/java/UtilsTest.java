import model.Student;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

public class UtilsTest {



    @Test
    public void shouldReturnNull() {
        final Student student = null;
        assertNull(Utils.getNullOrValue(student, () -> student.getName()));

    }

    @Test
    public void whyThrowException() {
        final Student student = null;

        try {
            Utils.getNullOrValue(student, student::getName);
            fail();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
