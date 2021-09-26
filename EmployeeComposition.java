package chapterEight;

import org.junit.jupiter.api.Test;

import java.util.Date;

public class EmployeeComposition {


    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;

    public EmployeeComposition(String firstName, String lastName, Date birthDate, Date hireDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }

    public  String toString(){

        return String.format("%s, %s Hired: %s Birthdate: %s", lastName, firstName, hireDate, birthDate);
    }

}
