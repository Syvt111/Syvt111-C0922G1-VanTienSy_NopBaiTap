package models;

public class Employee extends Person{
    private String level;
    private String position ;
    private int salary ;

    public Employee(int id, String name, String birthDate, String gender, String cmndNumber, String phoneNumber, String email, String level, String position, int salary) {
        super(id, name, birthDate, gender, cmndNumber, phoneNumber, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +", id=" + super.getId() + ", name = " + super.getName() +
                ", birthDate='" + super.getBirthDate() + '\'' +
                ", gender='" + super.getGender() + '\'' +
                ", cmndNumber='" + super.getCmndNumber() + '\'' +
                ", phoneNumber='" + super.getPhoneNumber() + '\'' +
                ", Email='" + super.getEmail() + '\'' +
                "level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
    public String formatCsvEmployee(){
        return super.getId() +"," + super.getName() +","+ super.getBirthDate() +","+ super.getGender() +
                "," + super.getCmndNumber() +","+super.getPhoneNumber() +","+ super.getEmail() +","+ level +","+ position +
                ","+ + salary ;

    }
}
