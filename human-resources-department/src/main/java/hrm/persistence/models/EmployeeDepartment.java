package hrm.persistence.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class EmployeeDepartment {

    @Id
    private int employeeID;
    @Id
    private int departmentID;
    private String startDate;
    private String endDate;

    public EmployeeDepartment(){}
    public EmployeeDepartment(int employeeID, int departmentID, String startDate, String endDate) {
        this.employeeID = employeeID;
        this.departmentID = departmentID;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "EmployeeDepartment{" +
                "employeeID=" + employeeID +
                ", departmentID=" + departmentID +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
