package dat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void math(){

        int x = 10;

        int y = 5 + 5;

        assertEquals(x,y);
    }


    @Test
    void errorMath(){

        //int x = 10;
        //int y = 6 + 5;
        //assertEquals(x,y);
    }

}