import External_Classes.*;

public class Main {
    public static void main(String[] args) {
        UI.print_Intro(); //Вывод задания и номера бригады

        String result = UI.wordToStack(UI.get_word()); //получаем обработанную строку из стека

        System.out.println(result); //вывод в консоль

        FileWriter.Write(result); //запись в файл
    }

}
