
// 2. Напишите программу, чтобы проверить, 
// являются ли две данные строки вращением друг друга (вхождение в обратном порядке).

public class Task2_2 {
    public static void main(String[] args) {
        String str1 = "ABC";
        String str2 = "CBA";

        int x = 0;
        int y = 0;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i)  != (str2.charAt(str1.length()-i-1))) {
                x++;                
            }             
        }

        if (x==0) {
            System.out.println("str2 является вращением str1");
            
        } else {
            System.out.println("str2 не является вращением str1");
        }

        // System.out.println(str1.contains(str2));
        // System.out.println(str1.equals(str2));
        // System.out.println(str1.indexOf(str2));

    }
    
}

