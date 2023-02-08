package models;

public class Customer extends Person{
    private String customerType ;
    private String address ;

    public Customer(int id, String name, String birthDate, String gender, String cmndNumber, String phoneNumber, String email, String customerType, String address) {
        super(id, name, birthDate, gender, cmndNumber, phoneNumber, email);
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +", id=" + super.getId() +
                ", name='" + this.getName() + '\'' +
                ", birthDate='" +super.getBirthDate() + '\'' +
                ", gender='" + super.getGender() + '\'' +
                ", cmndNumber='" + super.getGender() + '\'' +
                ", phoneNumber='" + super.getCmndNumber() + '\'' +
                ", Email='" + super.getEmail() + '\'' +
                "customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public String formatCsvCustomer(){
        return super.getId() +"," + super.getName() +","+ super.getBirthDate() +","+ super.getGender() +
                "," + super.getCmndNumber() +","+super.getPhoneNumber() +","+ super.getEmail() +","+ customerType +","+ address ;
    }
}

