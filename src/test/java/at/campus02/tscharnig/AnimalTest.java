package at.campus02.tscharnig;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    int a;
    boolean b = true;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        a = 1; b = false;
    }

    @Test
    void myFirstTest() {
        assertTrue(a > 0);

    }
    @Test
    void mySecondTest(){
        assertTrue(b == false);
    }

}