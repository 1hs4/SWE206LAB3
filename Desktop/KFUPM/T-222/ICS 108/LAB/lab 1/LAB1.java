import java.util.Scanner;

public class LAB1 
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your old GPA with total credits(you can put 0): ");
        double GPA = input.nextDouble();
        int totalCredits = input.nextInt();
        System.out.println("Enter the number of courses: ");
        int courseNum = input.nextInt();
        double points = GPA * totalCredits;
       
        for(int i=1; i < courseNum+1; i++){
            System.out.println("Enter letter grade, credit hours for course number "+i);
            String grade = input.next();
            int credit = input.nextInt();
            totalCredits+= credit ;
            switch(grade){
                case "A+" -> points+= 4.0*credit;
                case "A" -> points+= 3.75*credit;
                case "B+" -> points+= 3.5*credit;
                case "B" -> points+= 3.0*credit;
                case "C+" -> points+= 2.5*credit;
                case "C" -> points+= 2*credit;
                case "D+" -> points+= 1.5*credit;
                case "D" -> points+= 1.0*credit;
                case "F" -> points+= 0.0*credit;
                default -> System.out.println("you did not enter a vaild grade ");

            }
        
        }
        GPA = points/totalCredits ;
        System.out.println("GPA = " + GPA);
        input.close();
    }



}