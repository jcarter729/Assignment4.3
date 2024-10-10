

public class Employee 
{
    PartTimeJob part = null;
    FullTimeJob full = null;
    ContractJob contract = null;

    //Creating and Testing Instances of PartTimeJob Class
    public void createPartTimeEmployeeHistory(String companyName, String position, int startYear, int endYear, int hoursWorked, int hourlyPay, int overtimePay, int overtimeHours, int question1, int question2, int question3, int question4, int question5)
    {
        part = new PartTimeJob(companyName, position, startYear, endYear, hoursWorked, hourlyPay, overtimePay, overtimeHours, question1, question2, question3, question4, question5);
    }

    public void createFullTimeEmployeeHistory(String companyName, String position, int startYear, int endYear, double salary, int question1, int question2, int question3, int question4, int question5)
    {
        full = new FullTimeJob(companyName, position, startYear, endYear, salary ,question1, question2, question3, question4, question5);
    }

    public void createContractedEmployeeHistory(String companyName, String position, int startYear, int endYear, double contractValue, int question1, int question2, int question3, int jobSecurity1, int jobSecurity2, int amountOfWorkers)
    {
        contract = new ContractJob(companyName, position, startYear, endYear, contractValue, question1, question2, question3, jobSecurity1, jobSecurity2, amountOfWorkers);
    }

    public void displayPartTimeEmployee()
    {
        part.DisplayJobDetails();
    }

    public void displayFullTimeEmployee(PartTimeJob emp)
    {
        full.DisplayJobDetails();
    }

    public void displayContractEmployee(PartTimeJob emp)
    {
        contract.DisplayJobDetails();
    }
}
