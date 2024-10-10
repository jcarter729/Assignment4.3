public class PartTimeJob extends Job
{
    private int hoursWorked;
    private double hourlyPay;
    private double payAmount;
    private double overtimePay;
    private int overtimeHours;
    private String coworkerExperience;
    private double questionRatingAverage;
    private int question4;
    private int question5;

    //Sets values from instances for companyName, position, startYear, endYear, hoursWorked, hourlyPay, overtimePay, overtimeHours, question1, question2, and quesiton3
    public PartTimeJob(String companyName, String position, int startYear, int endYear, int hoursWorked, int hourlyPay, int overtimePay, int overtimeHours, int question1, int question2, int question3, int question4, int question5)
    {
        super(companyName, position, startYear, endYear, question1, question2, question3);
        this.hoursWorked = hoursWorked;
        this.hourlyPay = hourlyPay;
        this.overtimePay = overtimePay;
        this.overtimeHours = overtimeHours;
        this.question4 = question4;
        this.question5 = question5;
    }

    //Override DisplayJobDetails from Job class
    //Runs DisplayJobDetails from Job class
    //Then Displays Job Details Specific to PartTimeJob class, such as hourlyPay and overtimePay
    @Override
    public void DisplayJobDetails()
    {
        super.DisplayJobDetails();
        System.out.println("Hours worked: " + (hoursWorked + overtimeHours));
        System.out.println("Hourly pay: " + hourlyPay);
        System.out.println("Overtime worked: " + overtimeHours);
        System.out.println("Overtime pay: " + overtimePay);
        System.out.println("Amount paid: $" + paycheck());
        System.out.println(coworkerExperience());
        System.out.println(super.AssessJobSatisfaction() + "\n");
    }

    //Takes the hours worked (regular and overtime) and multiplies those by regular and overtime pay, respectively
    //Then combines the two to get the pay
    public double paycheck()
    {
        payAmount = hoursWorked * hourlyPay;
        payAmount = payAmount + (overtimePay * overtimeHours);
        return payAmount;
    }

    //Method to get how a part time worker feels about working with their current coworkers
    //Uses rating system based from 1 (worst) to 5 (best)
    public String coworkerExperience()
    {
        coworkerExperience = "I feel ";
        questionRatingAverage = (question4 + question5) / 2;
        if(questionRatingAverage < 2)
        {
            coworkerExperience += "Horrible";
        }
        else if(questionRatingAverage < 3)
        {
            coworkerExperience += "Okay";
        }
        else if(questionRatingAverage < 4)
        {
            coworkerExperience += "Alright";
        }
        else if(questionRatingAverage < 5)
        {
            coworkerExperience += "Good";
        }
        else
        {
            coworkerExperience += "Amazing";
        }
        coworkerExperience +=  " about working with my coworkers";
        return coworkerExperience;
    }
}
