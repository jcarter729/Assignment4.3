public abstract class Job 
{
    private String companyName;
    private String position;
    private int startYear;
    private int endYear;
    private String jobSatisfaction = "Job satisfaction is ";
    private double questionRatingAverage;
    private int question1;
    private int question2;
    private int question3;

    //Sets values from instances for companyName, position, startYear, endYear, question1, question2, and quesiton3 
    public Job(String companyName, String position, int startYear, int endYear, int question1, int question2, int question3)
    {
        this.companyName = companyName;
        this.position = position;
        this.startYear = startYear;
        this.endYear = endYear;
        this.question1 = question1;
        this.question2 = question2;
        this.question3 = question3;
    }

    //Displays the details of an employee's job 
    public void DisplayJobDetails()
    {
        System.out.println("Name of Company: " + companyName);
        System.out.println("Position in Company: " + position);
        System.out.println("Time in company: " + CalculatingJobDuration() + " years");
    }

    //Calculates how long an Employee has been working within the company
    public int CalculatingJobDuration()
    {
        return endYear - startYear;
    }

    //Takes the Score of Three Job Satisfaction Questions with a number range between 1 to 5 (5 being best, 1 being worst)
    //Gets the Average of the Questions' Scores, and decides Job Satisfaction Score based on the average
    public String AssessJobSatisfaction()
    {
        questionRatingAverage = (question1 + question2 + question3) / 3;
        if(questionRatingAverage < 2)
        {
            jobSatisfaction += "Horrible";
        }
        else if(questionRatingAverage < 3)
        {
            jobSatisfaction += "Okay";
        }
        else if(questionRatingAverage < 4)
        {
            jobSatisfaction += "Alright";
        }
        else if(questionRatingAverage < 5)
        {
            jobSatisfaction += "Good";
        }
        else
        {
            jobSatisfaction += "Amazing";
        }
        return jobSatisfaction;
    }
}
