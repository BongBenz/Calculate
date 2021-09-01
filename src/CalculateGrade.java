
public class CalculateGrade {
    private int score;
    public CalculateGrade(int score) {
        this.score = score;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    
    public char calcuate() {
        char grade;
        
        if(score >= 80) {
            grade = 'A';
        }else if(score >= 70) {
            grade = 'B';
        }else if(score >= 60) {
            grade = 'C';
        }else if(score >= 50) {
            grade = 'D';
        }else {
            grade = 'F';
        }
        
        return grade;
    }
    
}
