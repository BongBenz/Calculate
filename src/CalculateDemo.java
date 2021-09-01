import java.util.Scanner;

public class CalculateDemo {

	public static void main(String[] args) {
		int score;
		Scanner in = new Scanner(System.in);
		
        System.out.print("Input Score : ");
        score = in.nextInt();
        while(score > 100) {
        	System.out.println("Score more than 100, Input again");
        	System.out.print("Input Score : ");
            score = in.nextInt();
        }
        
        CalculateGrade c = new CalculateGrade(score);
        System.out.println("Grade : "+c.calculate());
	}

}
