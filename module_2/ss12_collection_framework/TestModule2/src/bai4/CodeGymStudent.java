package bai4;

public class CodeGymStudent {
    private String codeStudent ;
    private String name ;
    private String phoneNumber ;
    private String birthday ;
    private String className ;

    public CodeGymStudent() {

    }

    public CodeGymStudent(String codeStudent, String name, String phoneNumber, String birthday, String className) {
        this.codeStudent = codeStudent;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
        this.className = className;
    }

    public String getCodeStudent() {
        return codeStudent;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getClassName() {
        return className;
    }

    public void setCodeStudent(String codeStudent) {
        this.codeStudent = codeStudent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "CodeGymStudent{" +
                "codeStudent='" + codeStudent + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", birthday='" + birthday + '\'' +
                ", className='" + className + '\'' +
                '}';
    }
    public String csvFormat(){
        return this.codeStudent +","+name+","+phoneNumber+","+birthday+","+className;
    }
}
