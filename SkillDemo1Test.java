import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemo1Test {
    @Test
    public void testMultiplication(){
        assertEquals(6, SkillDemo1.multiplication(2, 3)); //now expect 6, the correct answer
    }
}
