import org.junit.Test;
import static org.junit.Assert.*;

public class TestClass {


    @Test
    public void test_M_Equal_Y_With_X_Smallest() {
        TestMe theClass = new TestMe();
        //tests that m == y since x < y < z
        assertEquals(theClass.mid(5, 10, 15), 10);

    }

    @Test
    public void test_M_Equal_Y_With_X_Greatest() {
        TestMe theClass = new TestMe();
        //tests that m ==y since x > y > z
        assertEquals(theClass.mid(15, 10, 5),10);
    }


    @Test
    public void test_M_Equal_X_With_Y_Smallest() {
        TestMe theClass = new TestMe();
        //tests that m == x since y < x < z
        assertEquals(theClass.mid(1, 0, 2), 1);
    }

    @Test
    public void test_M_Equal_X_With_X_Greatest(){
        TestMe theClass = new TestMe();
        //tests that m == x since y < z < x
        assertEquals(theClass.mid(2, -1, 1), 1);
    }

    @Test
    public void test_M_Equal_Z(){
        TestMe theClass = new TestMe();
        //tests that m == x since y = z = x
        assertEquals(theClass.mid(0,0,0), 0);
    }
}
