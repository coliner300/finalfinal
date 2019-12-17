public class run implements Comparable<run>
{
    //1. Instance variables
    public int food = 0;//indicates how much food until death
    public int answer = 0;//indicates where to send the story+
    public int days = 0;//amount of days lived
    public static int countStory = 0;
    private static int maxDays = 18250;//the max amount of day you can live in the game

    //2. Constructors
        public run()
    {
        food = 0;
        answer = 0;
        days = 0;
        countStory++;
    }//end zero arg constructor

    public run(int newAnswer, int newFood,  int newDays)
    {
        food = newFood;
        answer = newAnswer;
        days = newDays;
    }//end three arg constructor

    public run(int answer, int food, int days, int countStory)
    {
        this.food = food;
        this.answer = answer;
        this.days = days;
        this.countStory = countStory;
    }//end multi arg constructor

    public static int getCountStory()
    {
        return countStory;
    }//end getCountStory

    public int getFood()
    {
        return food;
    }//end getFood
    public int getAnswer()
    {
        return answer;
    }//end getAnswer
    public int getDays()
    {
        return days;
    }//end getDays
    public void setFood(int newFood)
    {
        food = newFood;
    }//end setFood
    public void setDays(int newDays)
    {
        days = newDays;
    }//end setDays
    public void setAnswer(int newAnswer)
    {
        answer = newAnswer;
    }//end setAnswer

    public String toString()
    {
        String output = "";
        output += "\nFood left: " + food;
        output += "\nYou survived for " + days + " day(s)";
        return output;
    }//end toString

    @Override
    public int compareTo(run someRun)
    {
        if(this.days < someRun.maxDays)
        {
            return -1;
        }
        if(this.days == someRun.maxDays)
        {
            return 0;
        }
        return 1;
    }//end compareTo
}//end class run
