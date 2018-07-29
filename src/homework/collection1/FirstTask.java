package homework.collection1;

import java.util.ArrayList;

public class FirstTask {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(20);

        list.add("this");
        list.add("is");
        list.add("lots");
        list.add("of");
        list.add("fun");
        list.add("for");
        list.add("every");
        list.add("Java");
        list.add("programmer");
        System.out.println(list.toString());

        markLength4(list);
        System.out.println(list.toString());
    }

    public static void markLength4(ArrayList<String> list) {
        String mark = "****";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == mark.length()) {
                list.add(i++, mark);
            }
        }
    }
}
