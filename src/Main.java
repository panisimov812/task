import java.util.HashMap;

public class Main {

    /*
   Напишите функцию findAmount, которая принимает на вход String
    и возвращает наиболее часто встречающуюся букву во фразе.
   Если максимумов несколько, верните ту букву, которая располагается ближе к началу текста Не импортировать никаких библиотек для решения данной задач
    */
    public static void main(String[] args) {

        System.out.println(findAmount("hellottt"));
    }

    public static char findAmount(String s) {
        HashMap<Character, Integer> map = new HashMap<>(); // создал мапу
        char max_char = s.charAt(0); // инициализируем наиболее часто встречающуюся букву
        int max_count = 0; // переменная для повторяющейся буквы

        for (int i = 0; i < s.length(); i++) { // прохожусь по str
            char b = s.charAt(i); // возвраща значение по указанному индексу - у нас идет перебор
            map.put(b, map.getOrDefault(b, 0) + 1); // заполняю мапу

            //проверяю                  или                         И
            if (map.get(b) > max_count || (map.get(b) == max_count && s.indexOf(b) < s.indexOf(max_char))) {
                max_count = map.get(b);
                max_char = b;
            }
        }
        return max_char;
    }
}

