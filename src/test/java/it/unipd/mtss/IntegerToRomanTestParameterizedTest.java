package it.unipd.mtss;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;



@RunWith(Parameterized.class)
public class IntegerToRomanTestParameterizedTest {
    
    private int input;
    private String expectedOutput;
    
    public IntegerToRomanTestParameterizedTest(int input, String expectedOutput) {
       this.input = input;
       this.expectedOutput = expectedOutput;
    }

    @Parameters
    public static Collection testConditions() {
       return Arrays.asList(new Object[][] { 
             { 1, "I" }, 
             { 2, "II"}, 
             { 5, "V" }, 
             { 7, "VII"},
             { 10, "X" },
             { 13, "XIII"},
             { 20, "XX"},
             { 24, "XXIV"},
             { 30, "XXX"},
             { 35, "XXXV"},
             { 40, "XL"},
             { 45, "XLV"},
             { 50, "L"},
             { 55, "LV"},
             { 60, "LX"},
             { 65, "LXV"},
             { 75, "LXXV"},
             { 85, "LXXXV"},
             { 95, "XCV"},
             { 150, "CL"},
             { 250, "CCL"},
             { 350, "CCCL"},
             { 450, "CDL"}
            });

}
    
    @Test
    public void testWithParameters() {
        
        try {
            String res = IntegerToRoman.convert(input);
            assertEquals(expectedOutput, res);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

   


}






