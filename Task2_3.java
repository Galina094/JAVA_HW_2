
// 3. *Напишите программу, чтобы перевернуть строку с помощью рекурсии.

public class Task2_3 {

    public static void main(String[] args) {

    
        StringBuilder sb = new StringBuilder("ABCDE");
        System.out.println(sb.reverse());

        // здесь тоже самое, но используем изначально тип String.
        String str = "ABCDE";
        StringBuilder strSb = new StringBuilder(str);
        System.out.println(strSb.reverse());
    }

    

    
    
}
