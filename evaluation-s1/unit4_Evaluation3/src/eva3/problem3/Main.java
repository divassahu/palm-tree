package eva3.problem3;

public class Main {
	
	void messageToStudents(Evaluation evaluation) {
		if(evaluation instanceof DsaEvaluation) {
			System.out.println("“Its a DSA Evaluation”");
		}
		else {
			System.out.println("Its a Coding Evaluation”");
		}
		
		evaluation.printNumberOfQuestion();
		evaluation.evaluationTiming();
		
		System.out.println("*********************");
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		Main m1= new Main();
		m1.messageToStudents(new DsaEvaluation(5));
		m1.messageToStudents(new CodingEvaluation(4));
	}
}
