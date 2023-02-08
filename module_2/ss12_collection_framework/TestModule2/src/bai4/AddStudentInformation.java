package bai4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddStudentInformation {
    public static List<CodeGymStudent>addStudent(){
        List<CodeGymStudent> studentList = new ArrayList<>();
        Scanner input = new Scanner(System.in);

            System.out.println("Enter code student ");
            String codeStudent = input.nextLine();
            System.out.println("Enter name ");
            String name = input.nextLine();
            System.out.println("Enter phone number ");
            String phoneNumber ;
            while (true) {
                try {
                    phoneNumber = input.nextLine();
                    for (CodeGymStudent student : studentList
                    ) {
                        if (phoneNumber.equals(student.getPhoneNumber())) {
                            throw new DuplicationPhoneNumberException();
                        }
                    }
                    break;

                } catch (DuplicationPhoneNumberException e) {
                    System.err.println(e.getMessage());
                }
            }
            System.out.println("Enter birthday ");
            String birthday = input.nextLine();
            System.out.println("Enter class name ");
            String classNane = input.nextLine();
            CodeGymStudent codeGymStudent = new CodeGymStudent(codeStudent,name,phoneNumber,birthday,classNane);
            studentList.add(codeGymStudent);
            ReadAndWriteStudent.writeFileStudent(studentList);


        return studentList ;
    }
}
