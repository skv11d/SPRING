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
public class Division {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int divisionID;
    private String divisionName;

    public Division(){}
    public Division(int divisionID, String divisionName) {
        this.divisionID = divisionID;
        this.divisionName = divisionName;
    }

    @Override
    public String toString() {
        return "Division{" +
                "divisionID=" + divisionID +
                ", divisionName='" + divisionName + '\'' +
                '}';
    }
}
