public class Grading {
    private double quiz1;
    private double quiz2;
    private double quiz3;
    private double midterm;
    private double finalExam;
    private double numericGrade;
    private char letterGrade;
    
    public void setQuiz1(double q1) {
        quiz1 = q1;
    }
    
    public void setQuiz2(double q2) {
        quiz2 = q2;
    }
    
    public void setQuiz3(double q3) {
        quiz3 = q3;
    }
    
    public void setMidterm(double m) {
        midterm = m;
    }
    
    public void setFinalExam(double f) {
        finalExam = f;
    }
    
    public void evalNumGrade() {
        double quizzes;
		quizzes = ((quiz1/10*100)+(quiz2/10*100)+(quiz3/10*100))/3;
		
		double numGrade = (quizzes*0.25)+(midterm*0.35)+(finalExam*0.4);
		numericGrade = (Math.round(numGrade*10d)/10d);
    }
    
    public void evalLetGrade() {
        char tempGrade;
		if (numericGrade < 60) {
			tempGrade = 'F';
		}
		else if (numericGrade < 70) {
			tempGrade = 'D';
		}
		else if (numericGrade < 80) {
			tempGrade = 'C';
		}
		else if (numericGrade < 90) {
			tempGrade = 'B';
		}
		else {
			tempGrade = 'A';
		}
		
		letterGrade = tempGrade;
    }
    
    public double getNumeric() {
        return numericGrade;
    }
    
    public char getLetter() {
        return letterGrade;
    }
    
    public boolean equals(Grading b) {
		if (quiz1 == b.quiz1 && quiz2 == b.quiz2 && quiz3 == b.quiz3 &&
		midterm == b.midterm && finalExam == b.finalExam &&
		numericGrade == b.numericGrade && letterGrade == b.letterGrade) {
			return true;
		}
		
		return false;
	}
	
	public String toString() {
		return ("Quiz 1: " + quiz1 + "\nQuiz 2: " + quiz2 + "\nQuiz 3: " +
		quiz3 + "\nMidterm: " + midterm + "\nFinal: " + finalExam +
		"\nNumeric Grade: " + numericGrade + "\nLetter Grade: " +
		letterGrade);
	}
}