public class Main 
{
    public static void main(String[] args)
    {
        //Creating and Testing Instances of Employee Class
        Employee emp1 = new Employee();
        emp1.createPartTimeEmployeeHistory("Walmart", "Cashier", 2016, 2024, 40, 5, 10, 3, 1, 2, 5, 4, 3);
        emp1.displayPartTimeEmployee();
        emp1.createFullTimeEmployeeHistory("JC Penny's", "HR Executive", 1993, 2024, 57843, 3, 5, 5, 4, 1);
        emp1.displayFullTimeEmployee();
        emp1.createContractedEmployeeHistory("Google", "Software Developer", 2019, 2024, 5993942, 1,1,3,1,2,1000);
        emp1.displayContractEmployee();
    } 
}
