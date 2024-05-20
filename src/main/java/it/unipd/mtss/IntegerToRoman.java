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


        return out;
    }

    public static String convert(int number) throws Exception{
        if(number > 0 && number <= 6){
            return table.get(number);
        }
        else{
            throw new Exception("Il numero non può essere convertito");
        }
    }



}
