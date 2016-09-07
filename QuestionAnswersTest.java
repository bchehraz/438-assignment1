package TestingPurposes;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuestionAnswersTest {
	
	@Test
	public void testTestAnswerFunctionForQAExistence() {
		QuestionAnswers qna = new QuestionAnswers();
		String q = "What is the color of the sky?";
		String a = "Blue";
		qna.put(q,a);
		assertTrue(qna.testAnswer(q,a));
	}

}
