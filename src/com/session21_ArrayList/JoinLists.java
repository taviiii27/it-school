package com.session21_ArrayList;



import java.util.ArrayList;

public class JoinLists {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Red");
        list1.add("Green");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Blue");
        list2.add("Yellow");

        ArrayList<String> joinedList = new ArrayList<>(list1);
        joinedList.addAll(list2);

        System.out.println("Joined list: " + joinedList);
    }
}

