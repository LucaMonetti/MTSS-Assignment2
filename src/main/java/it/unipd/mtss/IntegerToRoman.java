////////////////////////////////////////////////////////////////////
// Luca Monetti 2069429
// Victoria Nesterenco 2080818
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.util.Map;
import java.util.TreeMap;

public class IntegerToRoman {
    private static Map<Integer, String> table = createMap();

    private static Map<Integer, String> createMap() {

        Map<Integer, String> out = new TreeMap<Integer, String>();
        out.put(1, "I");
        out.put(2, "II");
        out.put(3, "III");
        out.put(4, "IV");
        out.put(5, "V");
        out.put(6, "VI");
        out.put(7, "VII");
        out.put(8, "VIII");
        out.put(9, "IX");
        out.put(10, "X");

        out.put(20, "XX");
        out.put(30, "XXX");
        out.put(40, "XL");
        out.put(50, "L");
        out.put(60, "LX");
        out.put(70, "LXX");
        out.put(80, "LXXX");
        out.put(90, "XC");
        out.put(100, "C");

        out.put(200, "CC");
        out.put(300, "CCC");
        out.put(400, "CD");
        out.put(500, "D");

        out.put(600, "DC");
        out.put(700, "DCC");
        out.put(800, "DCCC");
        out.put(900, "CM");
        out.put(1000, "M");


        




        return out;
    }

    public static String convert(int number) throws Exception{

        if(number <= 0 || number > 1000){
            throw new Exception("Il numero non può essere convertito");
            
        }
        int migliaia = number / 1000;
        number = number % 1000;
        int centinaia = number / 100;
        number = number % 100;
        int decine = number / 10;
        int unita = number % 10;

        String r = "";
        r = r + ((migliaia > 0) ? table.get(migliaia * 1000): "");

        r = r + ((centinaia > 0) ? table.get(centinaia * 100): "");

        r = r + ((decine > 0) ? table.get(decine * 10): "");

        r = r + ((unita > 0) ? table.get(unita): "");

        return r;


    }



}
