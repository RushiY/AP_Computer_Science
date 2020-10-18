package hierarchies;

public class TrueFalse implements Question {
	private String question;
	private String answer;

	public TrueFalse(String q, String a) {
		question = q;
		if (a.equalsIgnoreCase("T")) {
			answer = "true";
		} else {
			answer = "false";
		}
	}

	@Override
	public String getQuestion() {
		String output = "T/F " + question + "\n";
		return output;
	}

	@Override
	public String getAnswer() {

		return answer;
	}

	public String getAnswerChoice() {
		if (answer.contentEquals("true")) {
			return "T";
		} else {
			return "F";
		}
	}

}
