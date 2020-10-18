package hierarchies;

public class MultipleChoice implements Question {
	private String question;
	private String choiceA;
	private String choiceB;
	private String choiceC;
	private String choiceD;
	private String answer;

	public MultipleChoice(String q, String c1, String c2, String c3, String c4, String a) {
		question = q;
		choiceA = c1;
		choiceB = c2;
		choiceC = c3;
		choiceD = c4;
		if (choiceA.contentEquals(a)) {
			answer = choiceA;
		} else if (choiceB.contentEquals(a)) {
			answer = choiceB;
		} else if (choiceC.contentEquals(a)) {
			answer = choiceC;
		} else {
			answer = choiceD;
		}
	}

	@Override
	public String getQuestion() {
		return question + "\n\ta. " + choiceA + "\n\tb. " + choiceB + "\n\tc. " + choiceC + "\n\tD. " + choiceD + "\n";
	}

	@Override
	public String getAnswer() {
		return answer;
	}

	@Override
	public String getAnswerChoice() {
		if (choiceA.contentEquals(answer)) {
			return "A";
		} else if (choiceB.contentEquals(answer)) {
			return "B";
		} else if (choiceC.contentEquals(answer)) {
			return "C";
		} else {
			return "D";
		}
	}

}
