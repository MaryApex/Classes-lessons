package Employee_task_Galya;

public class SalariedEmployee extends Employee {
    protected String socialSecurityNumber;

    public SalariedEmployee(String socialSecurityNumber, String employeelD) {

    }
    @Override
    public void getFullInfo() {
        System.out.println("Employee SSN is " + socialSecurityNumber);
        System.out.println("Employee ID is " + employeeID);
    }
}
