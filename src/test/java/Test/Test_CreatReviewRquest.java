package Test;

import org.testng.annotations.Test;

public class Test_CreatReviewRquest extends BaseFile{
	
	@Test
	public void ReviewTest() throws InterruptedException
	{
		Review.reviewform();
	}

}
