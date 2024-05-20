package it.unipd.mtss;


import org.junit.Test;

public class IntegerToRomanTest {
    @Test (expected = Exception.class)
    public void test0() throws Exception {
        String res = IntegerToRoman.convert(0);
    }
}
