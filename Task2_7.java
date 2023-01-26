
// 7. **Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.

import java.util.Random;

public class Task2_7 {
    
    public static void main(String[] args) {        

        long beginStr = System.currentTimeMillis();        
        String str = "";     

        for (int i = 0; i < 1001; i++) {
            str+=randomChar();
        }
        System.out.println(str);           
        long endStr = System.currentTimeMillis();

        

        long beginStrSB = System.currentTimeMillis();
        StringBuilder strSB = new StringBuilder();

        for (int i = 0; i < 1001; i++) {
            strSB.append(randomChar());
        }
        System.out.println(strSB);  
        long endStrSB = System.currentTimeMillis();
        
        
        System.out.println("Operation time of the StringBuilder = " + (endStrSB-beginStrSB) + " (нс) ");
        System.out.println("Operation time of the String = " + (endStr-beginStr) + " (нс) ");

    }

    private static char randomChar() {
        int rnd = new Random().nextInt(52);
        char start = (rnd<26) ? 'A' : 'a';
        return (char) (start+rnd%26);
    }
}
