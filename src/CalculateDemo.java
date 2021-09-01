import java.util.Scanner;
public class CalculateDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("Input Score ");
        int score = in.nextInt();
        CalculateGrade c = new CalculateGrade(score);
        System.out.println("grade "+c.calculate());
	}

}
