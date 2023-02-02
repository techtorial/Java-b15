package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_RemoveNamesAhmed {
    /*
Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
 */
    public static List<String> remove(List<String> list){
        list.removeAll(Arrays.asList("Ahmed"));
        return list;
    }

    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("Ahmed");
        names.add("Kutman");
        names.add("Efe");
        names.add("Bogdan");
        names.add("Kuba");
        names.add("Ahmed");
        System.out.println(names);//[Ahmed, Kutman, Efe, Bogdan, Kuba, Ahmed]
        System.out.println(remove(names));//[Kutman, Efe, Bogdan, Kuba]
    }
}
