import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemo1Test {
    @Test
    public void testMultiplication(){
        assertEquals(5, SkillDemo1.multiplication(2, 3)); //initially fails
    }
}
