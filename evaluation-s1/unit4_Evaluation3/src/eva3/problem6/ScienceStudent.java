package eva3.problem6;

public class ScienceStudent implements Student{
	private int physicsMarks;
	private int chemistryMarks;
	private int mathsMarks;
	private int biologyMarks;
	
	public int getPhysicsMarks() {
		return physicsMarks;
	}
	public void setPhysicsMarks(int physicsMarks) {
		this.physicsMarks = physicsMarks;
	}
	
	public int getChemistryMarks() {
		return chemistryMarks;
	}
	public void setChemistryMarks(int chemistryMarks) {
		this.chemistryMarks = chemistryMarks;
	}
	
	public int getMathsMarks() {
		return mathsMarks;
	}
	public void setMathsMarks(int mathsMarks) {
		this.mathsMarks = mathsMarks;
	}
	
	public int getBiologyMarks() {
		return biologyMarks;
	}
	public void setBiologyMarks(int biologyMarks) {
		this.biologyMarks = biologyMarks;
	}
	
	@Override
	public double findPercentage() {
			double percentage=(physicsMarks+ chemistryMarks + biologyMarks + mathsMarks)/4;
			return percentage;
		}
	}

