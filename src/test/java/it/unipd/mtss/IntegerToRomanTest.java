package it.unipd.mtss;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;



@RunWith(Parameterized.class)

public class IntegerToRomanTest {
    
    private int input;
    private String expectedOutput;
    
    public IntegerToRomanTest(int input, String expectedOutput) {
       this.input = input;
       this.expectedOutput = expectedOutput;
    }

    @Parameters
    public static Collection testConditions() {
       return Arrays.asList(new Object[][] { 
             { 1, "I" }, 
             { 2, "II" } });

}
    
    @Test
    public void test0() {
        
        try {
            String res = IntegerToRoman.convert(input);
            assertEquals(expectedOutput, res);
        } catch (Exception e) {
            System.out.println("Errore");
        }
    }


}




