package eva3.problem3;

public abstract class Evaluation {
	private final int numberOfQuestions;
	
	public Evaluation(int i) {
		this.numberOfQuestions=i;
	}
	
	abstract void evaluationTiming();
	
	void printNumberOfQuestion() {
		System.out.println("the number of question in evaluation is : "+numberOfQuestions);
	}
	
}
