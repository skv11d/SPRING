package hrm.persistence.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class EmployeePositionHistory {

    @Id
    private int employeeID;
    @Id
    private int positionID;
    private String startDate;
    private String endDate;

    public EmployeePositionHistory(){}
    public EmployeePositionHistory(int employeeID, int positionID, String startDate, String endDate) {
        this.employeeID = employeeID;
        this.positionID = positionID;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "EmployeePositionHistory{" +
                "employeeID=" + employeeID +
                ", positionID=" + positionID +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
