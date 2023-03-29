package Seminar_4;

import java.util.LinkedList;

public class Task1 {

    public LinkedList<Integer> reverse(LinkedList<Integer> oldList){
        LinkedList<Integer> newList = new LinkedList<Integer>();

        for (int i = oldList.size() - 1; i >= 0 ; i--) {
            newList.add(oldList.get(i));
        }

        return newList;
    }

}
