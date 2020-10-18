package hierarchies;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
	private List<Question> questions;
	private final Scanner key = new Scanner(System.in);

	public Quiz() {
		questions = new ArrayList<Question>();

		questions.add(new TrueFalse("Houston is the capital of Texas.", "F"));
		questions.add(
				new MultipleChoice("The capital of Texas is", "Houston", "San Antonio", "Austin", "Dallas", "Austin"));
		questions.add(new MultipleChoice("The largest city in Texas is", "Houston", "San Antonio", "Austin", "Dallas",
				"Houston"));
		questions.add(new TrueFalse("The tallest mountain in Texas is Guadalupe Peak.", "T"));

		takeTest();
	}

	// prints the entire quiz numbering the questions from 1 to question.size(),
	// takes in user input and checks their answers.
	public void takeTest() {
		List<String> answers = new ArrayList<String>();

		for (int i = 0; i < questions.size(); i++) {
			System.out.print((i + 1) + ". " + questions.get(i).getQuestion() + "\nAnswer: ");
			answers.add(key.next());
			System.out.println();
		}

		checkAnswers(answers);
	}

	public void checkAnswers(List<String> answers) {
		for (int i = 0; i < answers.size(); i++) {
			if (answers.get(i).equalsIgnoreCase(questions.get(i).getAnswerChoice())) {
				System.out.println((i + 1) + ". Correct!");
			} else {
				System.out
						.println((i + 1) + ". Incorrect, the correct answer was " + questions.get(i).getAnswer() + ".");
			}
		}
	}

	public static void main(String[] args) {
		Quiz quiz = new Quiz();
	}
}