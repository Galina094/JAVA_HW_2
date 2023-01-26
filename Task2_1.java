// Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).

/**
 * Task2_1
 */
public class Task2_1 {

    public static void main(String[] args) {
        
        StringBuilder sb1 = new StringBuilder("ABCDE");
        StringBuilder sb2 = new StringBuilder("CD");

        if (sb1.toString()==sb2.toString()) {
            System.out.println("True");            
        } else {
            System.out.println("False");            
        }
   

        System.out.println(sb1.toString().indexOf(sb2.toString()));

        System.out.println(sb1.toString().contains(sb2.toString()));

    }
}