package eva3.problem6;

public class ArtStudent implements Student{
	private int hindiMarks;
	private int englishMarks;
	private int historyMarks;
	
	public int getHindiMarks() {
		return hindiMarks;
	}
	public void setHindiMarks(int hindiMarks) {
		this.hindiMarks = hindiMarks;
	}
	
	public int getEnglishMarks() {
		return englishMarks;
	}
	public void setEnglishMarks(int englishMarks) {
		this.englishMarks = englishMarks;
	}
	
	public int getHistoryMarks() {
		return historyMarks;
	}
	public void setHistoryMarks(int historyMarks) {
		this.historyMarks = historyMarks;
	}
	
	@Override
	public double findPercentage() {
			double percentage=(hindiMarks+ englishMarks + historyMarks)/3;
			return percentage;
		}
	}

