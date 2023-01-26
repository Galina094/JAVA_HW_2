
// 4. Дано два числа, например 3 и 56, необходимо 
//составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().

public class Task2_4 {
    public static void main(String[] args) {

        int a = 3;
        int b = 56;

        StringBuilder sum = new StringBuilder("3 + 56");
        StringBuilder diff = new StringBuilder("3 - 56");
        StringBuilder div = new StringBuilder("3 / 56");
        StringBuilder mult = new StringBuilder("3 * 56");

        System.out.println(sum.append(" = ").append(a+b));
        System.out.println(diff.append(" = ").append(a-b));
        System.out.println(div.append(" = ").append((float)a/b));
        System.out.println(mult.append(" = ").append(a*b));

        // 6. *Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().

        // System.out.println( sum.replace(6, 9, " equally "));
        // System.out.println( diff.replace(6, 9, " equally "));
        // System.out.println( div.replace(6, 9, " equally "));
        // System.out.println( mult.replace(6, 9, " equally "));

        // 5. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().

        sum.deleteCharAt(7);
        System.out.println(sum.insert(7, "equally"));
        diff.deleteCharAt(7);
        System.out.println(diff.insert(7, "equally"));
        div.deleteCharAt(7);
        System.out.println(div.insert(7, "equally"));
        mult.deleteCharAt(7);
        System.out.println(mult.insert(7, "equally"));




    }
    
}
