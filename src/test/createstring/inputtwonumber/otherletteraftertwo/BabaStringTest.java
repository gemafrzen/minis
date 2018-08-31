package test.createstring.inputtwonumber.otherletteraftertwo;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class BabaStringTest {

    @Test
    void createString_invalid() {
        helperTestMethod(1,5,"", false);
    }

    @Test
    void createString_bbab() {
        helperTestMethod(1,3,"bbab", true);
    }

    @Test
    void createString_baba() {
        helperTestMethod(2,2,"baba", true);
    }

    @Test
    void createString_aababababa() {
        helperTestMethod(6,4,"aababababa", true);
    }

    private void helperTestMethod(int a, int b, String expectedOutput, boolean isValid){
        Optional<String> output = main.createstring.inputtwonumber.otherletteraftertwo.BabaString.createString(a,b);

        boolean isValuePresent = output.isPresent();

        assertEquals(isValid, isValuePresent);
        if(isValuePresent) {
            assertEquals(expectedOutput, output.get());
        }
    }
}