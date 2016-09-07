package TestingPurposes;

import java.util.*;
import java.util.Random;

public class QuestionAnswers {
	HashMap<String,String> qa = new HashMap<>();
	
	/**
	 * Maps question to answer/
	 */
	void put(String question, String answer) {
		qa.put(question, answer);
	}
	
	/**
	 * Queries if question maps to answer
	 */
	boolean testAnswer(String question, String answer) {
		//Test to see if the question exists
		//And if the answer is equal to that question
		if (qa.containsKey(question) && qa.get(question).equals(answer)) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Gives out a random question from the key set
	 */
	String getRandomQuestion() {
		//Select random number and iterate through keys until
		// the random number is met. Then return the question at that value
		
		Random r = new Random();
		int randNum = r.nextInt(qa.size());
		int count = 0;
		Iterator i = qa.keySet().iterator();
		while (i.hasNext()) {
			if (count == randNum) {
				return i.toString();
			}
			count++;
		}
		return "";
	}
}
