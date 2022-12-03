package External_Classes;

import java.util.Iterator;
import java.util.Scanner;
public class UI {
    public static void print_Intro(){ //Вывод задания и номера бригады
        System.out.println("Изгарев Копылов Бригада №3");
        System.out.println("Задание:\n" +
                "Определить класс External_Classes.Stack. Объявить объект класса. \n" +
                "Ввести последовательность символов и вывести ее в обратном порядке. \n" +
                "Результаты преобразования сохранить в файл. Создать итератор для коллекции.");
    }
    public static String get_word(){ // Получаем введённое слово
        Scanner sk = new Scanner(System.in);
        String word = sk.nextLine();
        return word;
    }

    public static String wordToStack(String word) { //Передаём символы в стек и используя итератор возвращаем в обратном порядке
        Stack stack = new Stack();
        for (char w : word.toCharArray()) {
            stack.push(w);
        }

        Iterator<Character> i = stack.iterator();

        String res = "";

        while (i.hasNext()) {
            res += i.next().toString();
        }
        return res;
    }
}
