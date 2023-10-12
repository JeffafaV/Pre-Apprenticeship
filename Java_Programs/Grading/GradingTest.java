class GradingTest {
	public static void main(String[] args) {
		Grading student1 = new Grading();
		student1.setQuiz1(6);
		student1.setQuiz2(7);
		student1.setQuiz3(8);
		student1.setMidterm(75);
		student1.setFinalExam(90);
		student1.evalNumGrade();
		student1.evalLetGrade();
		
		System.out.println("First student's grade: ");
		System.out.println(student1);
		System.out.println(student1.getLetter() + " " + student1.getNumeric());
		
		Grading student2 = new Grading();
		student2.setQuiz1(7);
		student2.setQuiz2(6.5);
		student2.setQuiz3(5);
		student2.setMidterm(90);
		student2.setFinalExam(95);
		student2.evalNumGrade();
		student2.evalLetGrade();
		
		System.out.println("Second student's grade: ");
		System.out.println(student2);
		System.out.println(student2.getLetter() + " " + student2.getNumeric());
		
		Grading student3 = new Grading();
		student3.setQuiz1(6);
		student3.setQuiz2(7);
		student3.setQuiz3(8);
		student3.setMidterm(75);
		student3.setFinalExam(90);
		student3.evalNumGrade();
		student3.evalLetGrade();
		
		System.out.println("Third student's grade: ");
		System.out.println(student3);
		System.out.println(student3.getLetter() + " " + student3.getNumeric());
		
		System.out.println("Comparing student 1 and 2:");
		if (student1.equals(student2))
		{
			System.out.println("Students have same score");
		}
		else
		{
			System.out.println("Students don't have same score");
		}
		System.out.println("Comparing student 1 and 3:");
		if (student1.equals(student3))
		{
			System.out.println("Students have same score");
		}
		else
		{
			System.out.println("Students don't have same score");
		}
	}
}