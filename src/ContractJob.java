public class ContractJob extends Job
{
    private double contractValue;
    private double pay;
    private int jobSecurity1;
    private double questionRatingAverage;
    private int jobSecurity2;
    private String jobSecurityFeeling = "Job security is at the current job is: ";
    private int amountOfWorkers;

    public ContractJob(String companyName, String position, int startYear, int endYear, double contractValue, int question1, int question2, int question3, int jobSecurity1, int jobSecurity2, int amountOfWorkers)
    {
        super(companyName, position, startYear, endYear, question1, question2, question3);
        this.contractValue = contractValue;
        this.jobSecurity1 = jobSecurity1;
        this.jobSecurity2 = jobSecurity2;
        this.amountOfWorkers = amountOfWorkers;
    }
    
    @Override
    public void DisplayJobDetails()
    {
        super.DisplayJobDetails();
        calculatePayment();
        System.out.print("Contract amount: $");
        System.out.printf("%5.2f%n", contractValue);
        System.out.println(super.AssessJobSatisfaction() + "\n");
    }

    //Calculate the payment of the contract
    public void calculatePayment()
    {
        contractValue = contractValue / amountOfWorkers;
    }

    public String AssessJobSecurity()
    {
        questionRatingAverage = (jobSecurity1 + jobSecurity2) / 2;
        if(questionRatingAverage < 2)
        {
            jobSecurityFeeling += "Horrible";
        }
        else if(questionRatingAverage < 3)
        {
            jobSecurityFeeling += "Okay";
        }
        else if(questionRatingAverage < 4)
        {
            jobSecurityFeeling += "Alright";
        }
        else if(questionRatingAverage < 5)
        {
            jobSecurityFeeling += "Good";
        }
        else
        {
            jobSecurityFeeling += "Amazing";
        }
        return jobSecurityFeeling;
    }
}
