package hrm.persistence.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class EmployeeDivision {

    @Id
    private int employeeID;
    @Id
    private int divisionID;
    private String startDate;
    private String endDate;

    public EmployeeDivision(){}
    public EmployeeDivision(int employeeID, int divisionID, String startDate, String endDate) {
        this.employeeID = employeeID;
        this.divisionID = divisionID;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "EmployeeDivision{" +
                "employeeID=" + employeeID +
                ", divisionID=" + divisionID +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
