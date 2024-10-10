public class FullTimeJob extends Job
{
    private double salary;
    private double pay;
    private String workLifeBalance;
    private double questionRatingAverage;
    private int question4;
    private int question5;

    public FullTimeJob(String companyName, String position, int startYear, int endYear, double salary, int question1, int question2, int question3, int question4, int question5)
    {
        super(companyName, position, startYear, endYear, question1, question2, question3);
        this.salary = salary;
        this.question4 = question4;
        this.question5 = question5;
    }

    @Override
    public void DisplayJobDetails()
    {
        super.DisplayJobDetails();
        getMonthlyPay();
        System.out.print("Average Monthly Check: $");
        System.out.printf("%5.2f%n", pay);
        System.out.println(evaluateWorkLifeBalance());
        System.out.println(super.AssessJobSatisfaction() + "\n");
    }

    //Gets the monthly pay of a full time employee
    public double getMonthlyPay()
    {
        pay = salary / 12;
        return pay;
    }

    //Method to get how a full time worker feels about their work life balance
    //Uses rating system based from 1 (worst) to 5 (best)
    public String evaluateWorkLifeBalance()
    {
        workLifeBalance = "I have a(n) ";
        questionRatingAverage = (question4 + question5) / 2;
        if(questionRatingAverage < 2)
        {
            workLifeBalance += "Horrible";
        }
        else if(questionRatingAverage < 3)
        {
            workLifeBalance += "Okay";
        }
        else if(questionRatingAverage < 4)
        {
            workLifeBalance += "Alright";
        }
        else if(questionRatingAverage < 5)
        {
            workLifeBalance += "Good";
        }
        else
        {
            workLifeBalance += "Amazing";
        }
        workLifeBalance +=  " work/life balance";
        return workLifeBalance;
    }


}
