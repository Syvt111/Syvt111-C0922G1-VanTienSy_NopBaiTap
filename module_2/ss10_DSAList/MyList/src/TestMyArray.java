public class TestMyArray {
    private static class Student {
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student a = new Student(1, "Huy");
        Student b = new Student(2, "Ngo");
        Student c = new Student(3, "Hoan");
        Student d = new Student(4, "Truc");
        Student e = new Student(5, "Hong");
        Student f = new Student(5, "My");
        Student cong = new Student(5, "cong");

        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
//        MyArrayList<Student> newMyArrayList = new MyArrayList<>();
        studentMyArrayList.add(a);
        studentMyArrayList.add(b);
        studentMyArrayList.add(c);
        studentMyArrayList.add(d);
        studentMyArrayList.add(e);
        studentMyArrayList.add(f,2);
        System.out.println(studentMyArrayList.size());
//        studentMyArrayList.size();
//        System.out.println(studentMyArrayList.size());
//        System.out.println(studentMyArrayList.get(2).getName());

        for (int i = 0; i < studentMyArrayList.size(); i++) {
            Student student = (Student) studentMyArrayList.elements[i];
            System.out.println(student.getId());
            System.out.println(student.getName());
        }
//        System.out.println(studentMyArrayList.indexOf(c));
//        System.out.println(studentMyArrayList.contains(f));
//        newMyArrayList = studentMyArrayList.clone();
//        newMyArrayList.remove(1);
//        for (int i = 0; i < newMyArrayList.size();i++){
//            System.out.println(newMyArrayList.get(i).getName());
//
//        }


    }
}
