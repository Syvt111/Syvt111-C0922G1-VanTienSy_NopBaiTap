package bai4;

import java.util.Scanner;

public class CodeGymStudentManage {
    public static void main(String[] args) {
        while (true){
            System.out.println(" 1 .Add student "+
                                " 2. Show all student"+
                                 " 3. Find student"
            +" 4. Exit");
            System.out.println("Enter option");
            Scanner input = new Scanner(System.in);
            int option = Integer.parseInt(input.nextLine());
            switch (option){
                case 1 :
                   AddStudentInformation.addStudent();
                    break;
                case 2 :
                    for (CodeGymStudent st:ReadAndWriteStudent.readFileStudent()
                         ) {
                        System.out.println(st);
                    }
                    break;
                case 3 :
                    FindStudent.findStudent(ReadAndWriteStudent.readFileStudent());
                    break;
                case 4 :
                    System.exit(0);
                    break;
            }
        }
    }
}
