import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the marks of five subjects:\n");

       
        float sub_1 = in.nextFloat();
        float sub_2 = in.nextFloat();
        float sub_3 = in.nextFloat();
        float sub_4 = in.nextFloat();
        float sub_5 = in.nextFloat();

      
        CalcPercentGrade(sub_1, sub_2, sub_3, sub_4, sub_5);
    }

    
    private static void CalcPercentGrade(float sub_1, float sub_2, float sub_3, float sub_4, float sub_5) {
        float total;
        float average;
        float percentage;
        char grade;

        
        total = sub_1 + sub_2 + sub_3 + sub_4 + sub_5;
        average = (float)(total / 5.0);
        percentage = (float)((total / 500.0) * 100);


        if (average >= 90)
            grade = 'A';
        else if (average >= 80 && average < 90)
            grade = 'B';
        else if (average >= 60 && average < 80)
            grade = 'C';
        else if (average >= 40 && average < 60)
            grade = 'D';
        else
            grade = 'F';


        System.out.println("\nThe Total marks   = " + total + "/500.0");
        System.out.println("The Average marks = " + average);
        System.out.println("The Percentage    = " + percentage + "%");
        System.out.println("The Grade         = '" + grade + "'");
    }
}


