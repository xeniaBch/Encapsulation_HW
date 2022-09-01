package task;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class TaskTest {
    Task task = new Task();

    @Test
    void taskTestTrue(){
        assertEquals(Task.squareWithoutMultiply(4), 16);
    }

    @Test
    void taskTestBoundaryMin(){
        assertEquals(Task.squareWithoutMultiply(1), 1);
    }

    @Test
    void taskTestBigValue(){
        assertEquals(Task.squareWithoutMultiply(1000), 1000000);
    }

    @Test
    void taskTestWrongInput(){
        assertEquals(Task.squareWithoutMultiply(-25), 0);
    }


    @Test
    void taskTestFalse(){
        assertNotEquals(Task.squareWithoutMultiply(5), 10);
    }

}
