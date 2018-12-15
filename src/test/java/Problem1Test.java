import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class Problem1Test {


    private Problem1 problem = new Problem1();

    @Test
    public void solve() {
        assertEquals(problem.solve(10), 23);
    }

    @Test
    public void solve_2() {
        assertEquals(problem.solve(1000), 233168);
    }
}