////////////////////////////////////////////////////////////////////
// Luca Monetti 2069429
// Victoria Nesterenco 2080818
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.util.Map;
import java.util.TreeMap;

public class RomanPrinter {

    private static Map<Character, String[]> table = createMap();

    private static Map<Character, String[]> createMap() {
        Map<Character, String[]> out = new TreeMap<Character, String[]>();
        out.put('I', new String[]{
                "  _____  ",
                " |_   _| ",
                "   | |   ",
                "   | |   ",
                "  _| |_  ",
                " |_____| "
        });
        out.put('V', new String[]{
                "__      __",
                "\\ \\    / /",
                " \\ \\  / / ",
                "  \\ \\/ /  ",
                "   \\  /   ",
                "    \\/    ",
        });
        out.put('X', new String[]{
                "__   __",
                "\\ \\ / /",
                " \\ V / ",
                "  > <  ",
                " / . \\ ",
                "/_/ \\_\\"
        });
        out.put('L', new String[]{
                "  _      ",
                " | |     ",
                " | |     ",
                " | |     ",
                " | |____ ",
                " |______|",
        });
        out.put('C', new String[]{
                "   _____ ",
                "  / ____|",
                " | |     ",
                " | |     ",
                " | |____ ",
                "  \\_____|"
        });
        out.put('D', new String[]{
                "  _____  ",
                " |  __ \\",
                " | |  | |",
                " | |  | |",
                " | |__| |",
                " |_____/ "
        });

        return out;
    }

    public static String print(int num){
        try {
            return printAsciiArt(IntegerToRoman.convert(num));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "";
        }
    }
    private static String printAsciiArt(String romanNumber){

        String[] tempArr = {"", "", "", "", "", ""};
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < romanNumber.length(); i++) {
            String[] value = table.get(romanNumber.charAt(i)).clone();

            for (int j = 0; j < value.length; j++) {
                tempArr[j] = tempArr[j] + value[j];
            }
        }

        for (String s : tempArr) {
            res.append(s).append("\n");
        }

        return res.toString();
    }
}
