package org.utils.stringutils;

import org.junit.jupiter.api.Test;
import org.utils.exceptions.InvalidStringInputException;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StringParserTest {

    // 3 part format
    // methodBeingTested_conditionToTest_expectedOutcome
    @Test
    void splitString_oneSeparator_expectTwoParts() throws InvalidStringInputException {

        // set up lines
        StringParser sp = new StringParser();
        String inputString = "Hello|world";
        String separator = "\\|"; // "\\" escape character
        ArrayList<String> stringParts =  sp.splitString(inputString, separator);

        // actual test
        assertEquals(2, stringParts.size());
    }

    @Test
    void splitString_nullString_expectException() throws InvalidStringInputException {

        // set up lines
        StringParser sp = new StringParser();
        String inputString = null;
        String separator = "\\|"; // "\\" escape character
        // ArrayList<String> stringParts =  sp.splitString(inputString, separator);

        // actual test
        // assertEquals(2, 0);

        assertThrows(InvalidStringInputException.class,
                () -> sp.splitString(inputString, separator));
    }
}
