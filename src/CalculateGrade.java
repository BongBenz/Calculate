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
    
    public String calculate() {
        String grade;
        
        if(score >= 80) {
            grade = "A";
        }else if(score >= 75) {
            grade = "B+";
        }else if(score >= 70) {
            grade = "B";
        }else if(score >= 65) {
            grade = "C+";
        }else if(score >= 60) {
            grade = "C";
        }else if(score >= 55) {
            grade = "D+";
        }else if(score >= 50) {
            grade = "D";
        }else {
            grade = "F";
        }
        
        return grade;
    }
    
}
