package Employee_task_Galya;

public class ContractEmployee extends Employee {
    protected String federalTaxIDMember = "123456";

    public ContractEmployee (String federalTaxIDMember, String employeeID){

    }

    @Override
    public void getFullInfo() {
        System.out.println("Employee FIN is " + federalTaxIDMember);
        System.out.println("Employee ID is " + employeeID);
    }
}
