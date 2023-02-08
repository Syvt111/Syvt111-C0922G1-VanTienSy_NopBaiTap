package bai4;

import java.util.List;
import java.util.Scanner;

public class FindStudent {
    public static void findStudent(List<CodeGymStudent> studentList) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter student of name to find");
        String name = input.nextLine();
        for (CodeGymStudent st : studentList
        ) {
            if (name.equals(st.getName())) {
                System.out.println(st);
            }
        }

    }

}
