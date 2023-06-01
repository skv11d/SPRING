package hrm.persistence.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeID;
    private String lastName;
    private String firstName;
    private String middleName;
    private String dateOfBirth;
    private String gender;
    private String address;
    private String phone;
    private String email;
    private String position;
    private String hireDate;
    private int salary;

    public Employee(){}
    public Employee(int employeeID, String lastName, String firstName, String middleName, String dateOfBirth,
                    String gender, String address, String phone, String email,
                    String position, String hireDate, int salary) {
        this.employeeID = employeeID;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.position = position;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", position='" + position + '\'' +
                ", hireDate='" + hireDate + '\'' +
                ", salary=" + salary +
                '}';
    }
}
