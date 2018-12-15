import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Problem2Test {

    private Problem2 problem = new Problem2();

    @Test
    public void testSolve() {

        assertEquals(problem.solve(4000000), 4613732);
    }
}