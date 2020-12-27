package com.company;
import org.jetbrains.annotations.NotNull;
import java.util.*;
import com.company.RomanNumeral;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    static RomanNumeral Numeral = new RomanNumeral();
    public static void main(String[] args) throws Exception {
        System.out.println("Example: \n----------------\n Input:\n 1 + 2\n Output:\n 3\n----------------");
        int i = 1;
        while (i>0) {
            System.out.println("Input:");
            Scanner scan = new Scanner(System.in);
            String rim2;
            String c;
            String rim;
            int summa;
            int summa2;
            summa = 0;
            summa2 = 0;
            rim = scan.next();
            c = scan.next();
            rim2 = scan.next();
            if (rim.matches("[-+]?\\d+") && rim2.matches("[-+]?\\d+")) {
                int rin = Integer.parseInt(rim);
                int rin2 = Integer.parseInt(rim2);
                arab(rin, rin2, c);
            } else {
                Rime(rim, rim2, c, summa, summa2);
            }
        }
    }
    public static void arab(int rin,int rin2, String c){
        if(rin>=0&&rin<=10&&rin2>=0&&rin2<=10){
        if(c.equals("+")){
            System.out.println("Output: \n" + (rin + rin2));
        }
        if(c.equals("-")){
            System.out.println("Output: \n" +( rin - rin2));
        }
        if(c.equals("*")){
            System.out.println("Output: \n" + (rin * rin2));
        }
        if(c.equals("/")){
            System.out.println("Output: \n" + (rin / rin2));
        }
        }else{throw new IllegalArgumentException("Numbers isn't included in 0-10");}
    }
    public static void Rime(String rim,String rim2, String c,int summa,int summa2){
        for (int i = 0; (i < rim.length()); i++) {
            if (((i < (rim.length() - 1)) && ((rim.charAt(i) == 'I') && (rim.charAt((i + 1)) != 'I')))) {
                // TODO: Warning!!! continue If
            } else if ((rim.charAt(i) == 'I')) {
                summa++;
            } else if ((rim.charAt(i) == 'V')) {
                if (((i > 0) && (rim.charAt((i - 1)) == 'I'))) {
                    summa += 4;
                } else {
                    summa += 5;
                }

            } else if ((rim.charAt(i) == 'X')) {
                if (((i > 0) && (rim.charAt((i - 1)) == 'I'))) {
                    summa += 9;
                } else if (((i < (rim.length() - 1)) && ((rim.charAt((i + 1)) == 'L') || (rim.charAt((i + 1)) == 'C')))) {
                    // TODO: Warning!!! continue If
                } else {
                    summa += 10;
                }

            } else if ((rim.charAt(i) == 'L')) {
                if (((i > 0) && (rim.charAt((i - 1)) == 'X'))) {
                    summa += 40;
                } else {
                    summa += 50;
                }

            } else if ((rim.charAt(i) == 'C')) {
                if (((i > 0) && (rim.charAt((i - 1)) == 'X'))) {
                    summa += 90;
                } else if (((i < (rim.length() - 1)) && ((rim.charAt((i + 1)) == 'D') || (rim.charAt((i + 1)) == 'M')))) {
                    // TODO: Warning!!! continue If
                } else {
                    summa += 100;
                }

            } else if ((rim.charAt(i) == 'D')) {
                if (((i > 0) && (rim.charAt((i - 1)) == 'C'))) {
                    summa += 400;
                } else {
                    summa += 500;
                }

            } else if ((rim.charAt(i) == 'M')) {
                if (((i > 0) && (rim.charAt((i - 1)) == 'C'))) {
                    summa += 900;
                } else {
                    summa += 1000;
                }

            }
        }
        for (int i = 0; (i < rim2.length()); i++) {
            if (((i < (rim2.length() - 1)) && ((rim2.charAt(i) == 'I') && (rim2.charAt((i + 1)) != 'I')))) {
                // TODO: Warning!!! continue If
            } else if ((rim2.charAt(i) == 'I')) {
                summa2++;
            } else if ((rim2.charAt(i) == 'V')) {
                if (((i > 0) && (rim2.charAt((i - 1)) == 'I'))) {
                    summa2 += 4;
                } else {
                    summa2 += 5;
                }

            } else if ((rim2.charAt(i) == 'X')) {
                if (((i > 0) && (rim2.charAt((i - 1)) == 'I'))) {
                    summa2 += 9;
                } else if (((i < (rim2.length() - 1)) && ((rim2.charAt((i + 1)) == 'L') || (rim2.charAt((i + 1)) == 'C')))) {
                    // TODO: Warning!!! continue If
                } else {
                    summa2 += 10;
                }

            } else if ((rim2.charAt(i) == 'L')) {
                if (((i > 0) && (rim2.charAt((i - 1)) == 'X'))) {
                    summa2 += 40;
                } else {
                    summa2 += 50;
                }

            } else if ((rim2.charAt(i) == 'C')) {
                if (((i > 0) && (rim2.charAt((i - 1)) == 'X'))) {
                    summa2 += 90;
                } else if (((i < (rim2.length() - 1)) && ((rim2.charAt((i + 1)) == 'D') || (rim2.charAt((i + 1)) == 'M')))) {
                    // TODO: Warning!!! continue If
                } else {
                    summa2 += 100;
                }

            } else if ((rim2.charAt(i) == 'D')) {
                if (((i > 0) && (rim2.charAt((i - 1)) == 'C'))) {
                    summa2 += 400;
                } else {
                    summa2 += 500;
                }

            } else if ((rim2.charAt(i) == 'M')) {
                if (((i > 0) && (rim2.charAt((i - 1)) == 'C'))) {
                    summa2 += 900;
                } else {
                    summa2 += 1000;
                }
            }
        }
        if (summa>=0&&summa<=10&&summa2>=0&&summa2<=10) {
            Rimesum(summa, summa2, c);
        } else {
            throw new IllegalArgumentException("Numbers isn't included in I-X");
        }
    }
    public static void Rimesum(int summa,int summa2, String c) {
        int result = 0;
        if(summa>=0&&summa<=10&&summa2>=0&&summa2<=10){
        if (c.equals("+")) {
            result = summa + summa2;
        }
        if (c.equals("-")) {
            result = summa - summa2;
        }
        if (c.equals("*")) {
            result = summa * summa2;
        }
        if (c.equals("/")) {
            result = summa / summa2;
        }
        }else{throw new IllegalArgumentException("Numbers isn't included in I-X");}
        Rome(result);
    }

    public static void Rome (int result)
    {
        String res = String.valueOf(result);
        try {
            char c = res.charAt( 0 );

            if ( Character.isDigit( c ) )
            {
                int int_value = Integer.parseInt( res );

                System.out.println("Output: \n " + Numeral.convertIntegerToRoman(int_value));
            }
            else {

                System.out.println("Output: \n " + Numeral.convertRomanToInt(res));
            }
        }
        catch( NumberFormatException e)
        {
        }
    }

}
