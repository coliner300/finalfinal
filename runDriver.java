import java.util.Scanner;

public class runDriver
{
    public static void main(String[] args)
    {
        //variables
        int answer;
        String first = null;
        Scanner user = new Scanner(System.in);
        Scanner first2 = new Scanner(System.in);

        //create story
        //for each storyline created
        run storyfirst = new run(0, 5, 1);
        run storysecondb = new run(0, 5, 1);
        run storysecondc = new run(0, 5, 1);
        run storysecondd = new run(0, 0, 6);
        run storyseconde = new run(0, 1, 5);
        run storysecondf = new run(0, 5, 2);
        run storysecondg = new run(0, 5, 2);
        run storysecondh = new run(0, 5, 2);
        run storysecondi = new run(0, 1, 18250);//max days story
        run storysecondj = new run(0, 1, 5);
        run storythird = new run(0, 5, 1);
        run storythirda = new run(0, 5, 1);
        run storythirdb = new run(0, 5, 1);
        run storythirdc = new run(0, 5, 1);
        run storythirdd = new run(0, 5, 1);
        run storythirde = new run(0, 5, 1);
        run storythirdf = new run(0, 5, 1);
        run maxDays = new run(0, 0, 6);

        //this is where the storyline is created
        System.out.println("This is a game where you click 1 and 2 to choose options. Enter 3 to sleep a day and enter 4 to eat 1 portion of food.");
        System.out.println(story1.getStory1());
        System.out.println();
        System.out.println(storyfirst.toString());
        System.out.println(story2.getStory2());
        answer = user.nextInt();

        if(answer == 1)
        {
            System.out.println(storysecondb.toString());
            System.out.println(story2.getStory2b());
            answer = 0;
            first = first2.nextLine();
            if(first.equals("Yes") || first.equals("yes"))
            {
                System.out.println(storysecondc.toString());
                System.out.println(story2.getStory2c());
                answer = 0;
                first = null;
                answer = user.nextInt();
                if(answer == 2)
                {
                    System.out.println(storysecondf.toString());
                    System.out.println();
                    System.out.println(story2.getStory2f());
                    answer = 0;
                    answer = user.nextInt();
                    if(answer == 1)
                    {
                        System.out.println(storysecondg.toString());
                        System.out.println();
                        System.out.println(story2.getStory2g());//ending one, chased by zombies
                        System.out.println();
                        System.out.println(story1.getMessage2());
                        if(storysecondg.compareTo(maxDays) == -1)
                        {
                            System.out.println("You didn't survive for the max amount of days. Try again to see if you can get the max amount of days.");
                        } else {
                            System.out.println("You survived for the max amount of days.");
                        }//end else
                        answer = 0;
                    }//end answer1 second if of first if
                    if(answer == 2)
                    {
                        System.out.println(storysecondh.toString());
                        System.out.println();
                        System.out.println(story2.getStory2h());//ending two, followed into apartment
                        System.out.println();
                        System.out.println(story1.getMessage3());
                        if(storysecondh.compareTo(maxDays) == -1)
                        {
                            System.out.println("You didn't survive for the max amount of days. Try again to see if you can get the max amount of days.");
                        } else {
                            System.out.println("You survived for the max amount of days.");
                        }//end else
                        answer = 0;
                    }//end answer2 second if of first if
                }//end answer1 first if
                if(answer == 1)
                {
                    System.out.println(storyseconde.toString());
                    System.out.println();
                    System.out.println(story2.getStory2e());
                    System.out.println();
                    answer = 0;
                    answer = user.nextInt();
                    if(answer == 1)
                    {
                        System.out.println(storysecondi.toString());
                        System.out.println();
                        System.out.println(story2.getStory2i());
                        if(storysecondi.compareTo(maxDays) == -1)
                        {
                            System.out.println("You didn't survive for the max amount of days. Try again to see if you can get the max amount of days.");
                        } else {
                            System.out.println("You survived for the max amount of days.");
                        }//end else
                        answer = 0;
                    }//end first second if
                    if(answer == 2)
                    {
                        System.out.println(storysecondj.toString());
                        System.out.println();
                        System.out.println(story2.getStory2j());
                        System.out.println();
                        System.out.println(story1.getMessage4());
                        if(storysecondj.compareTo(maxDays) == -1)
                        {
                            System.out.println("You didn't survive for the max amount of days. Try again to see if you can get the max amount of days.");
                        } else {
                            System.out.println("You survived for the max amount of days.");
                        }//end else
                        answer = 0;
                    }//end second second if
                }//end answer2 first if
            }
            else if(first.equals("No") || first.equals("no")) {
                System.out.println(storysecondd.toString());
                System.out.println();
                System.out.println(story2.getStory2d());
                System.out.println(story1.getMessage1());
                if(storysecondd.compareTo(maxDays) == -1)
                {
                    System.out.println("You didn't survive for the max amount of days. Try again to see if you can get the max amount of days.");
                } else {
                    System.out.println("You survived for the max amount of days.");
                }//end else
                answer = 0;
                first = null;
            }//end else if
        }//end first if
        if(answer == 2)
        {
            System.out.println(story3.getStory3());
            answer = 0;
            answer = user.nextInt();
            if(answer == 1)
            {
                System.out.println(storythirda.toString());
                System.out.println();
                System.out.println(story3.getStory3a());
                System.out.println();
                answer = 0;
                answer = user.nextInt();
                if(answer == 1)
                {
                    System.out.println(storythirdb.toString());
                    System.out.println();
                    System.out.println(story3.getStory3b());
                    System.out.println();
                    answer = 0;
                    answer = user.nextInt();
                    if(answer == 2)
                    {
                        for(int pew = 0; pew < 5; pew++)
                        {
                            System.out.println("Pew Pew");//makes the imaginary sounds of a pew pew five times
                        }//end for loop
                        System.out.println(storythirdd.toString());
                        System.out.println();
                        System.out.println(story3.getStory3d());
                        System.out.println();
                        System.out.println(story1.getMessage5());
                        System.out.println();
                        if(storythirdd.compareTo(maxDays) == -1)
                        {
                            System.out.println("You didn't survive for the max amount of days. Try again to see if you can get the max amount of days.");
                        } else {
                            System.out.println("You survived for the max amount of days.");
                        }//end else
                        answer = 0;
                    }//end first question third if answer 2
                    if(answer == 1)
                    {
                        for(int swing = 0; swing < 5; swing++)
                        {
                            System.out.println("Swoosh, Smack!");
                        }//end for loop
                        System.out.println(storythirde.toString());
                        System.out.println();
                        System.out.println(story3.getStory3e());
                        System.out.println();
                        if(storythirde.compareTo(maxDays) == -1)
                        {
                            System.out.println("You didn't survive for the max amount of days. Try again to see if you can get the max amount of days.");
                        } else {
                            System.out.println("You survived for the max amount of days.");
                        }//end else
                        System.out.println();
                        answer = 0;
                    }
                }
                if(answer == 2)
                {
                    System.out.println(storythirdc.toString());
                    System.out.println();
                    System.out.println(story3.getStory3c());
                    System.out.println();
                    if(storythirdc.compareTo(maxDays) == -1)
                    {
                        System.out.println("You didn't survive for the max amount of days. Try again to see if you can get the max amount of days.");
                    } else {
                        System.out.println("You survived for the max amount of days.");
                    }//end else
                    answer = 0;
                }//end first second if
            }//end if question 2 answer 1

        }//end second if
        else if(answer ==2)
        {
            System.out.println(storythirdf.toString());
            System.out.println();
            System.out.println(story3.getStory3f());
            System.out.println();
            answer = 0;
            if(storythirdf.compareTo(maxDays) == -1)
            {
                System.out.println("You didn't survive for the max amount of days. Try again to see if you can get the max amount of days.");
            } else {
                System.out.println("You survived for the max amount of days.");
            }//end else
        }//end else if answer 2 layer one
        else if(answer != 1 && answer != 0 || first != "yes" && first != "no")
        {
                System.out.println("Please enter a valid input");
        }//end else if
    }//end of main method
}//end of class runDriver
