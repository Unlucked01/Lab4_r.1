package External_Classes;

import java.util.Iterator;
public class Stack {
    Character[] arr = new Character[1000000]; //хранение массива символов
    int index; //индексация элементов, начиная с 1 элемента

    Stack(){
        index = 1;
    }

    public void push(char value){
        arr[index] = value;
        index++;
    }
    //добавление элементов в стек

//    public Character pop(){
//        if(index == 0){
//            return null;
//        }
//        else {
//            index--;
//            return arr[index+1];
//        }
//    }
    //забрать элемент из стека

    public Iterator<Character> iterator() {
        Iterator<Character> it = new Iterator<Character>() {
            @Override
            public Character next(){ return arr[--index]; } // получение следующего элемента

            @Override
            public boolean hasNext() { return arr[index - 1] != null; } //проверка, есть ли следующий элемент
        };
        return it;
    }
}