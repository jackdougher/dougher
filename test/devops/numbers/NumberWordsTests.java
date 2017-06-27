package devops.numbers;

import java.io.IOException;

import org.junit.*;

import devops.numbers.NumberWords;

public class NumberWordsTests {
	private NumberWords numberWords ;
	
	@Before
	public void setup() throws IOException {
		numberWords = new NumberWords() ;
	}
	
	@Test
	public void numberOneReturn() {
		Assert.assertEquals( "One", "one", numberWords.convertLessThanOneThousand( "1" ) ) ;
	}
	@Test
	public void numberFiftySevenReturn() {
		Assert.assertEquals( "Fifty Seven", "fifty seven", numberWords.convertLessThanOneThousand( "57" ) ) ;
	}
	
	@Test
	public void numberFiveHundredFiftyFiveReturn() {
		Assert.assertEquals( "Five Hundred Fifty Five", "five hundred fifty five", numberWords.convertLessThanOneThousand( "555" ) ) ;
	}
	
	@Test
	public void numberNineHundredNinetyNineReturn() {
		Assert.assertEquals( "Nine Hundred Ninety Nine", "nine hundred ninety nine", numberWords.convertLessThanOneThousand( "999" ) ) ;
	}

	@Test
	public void negativeNumberOutOfRangeReturnsError() {
		Assert.assertEquals( "Error1", "Negative number out of range", numberWords.convertLessThanOneThousand( "-1" ) ) ;
	}

	@Test
	public void numberOutOfRangeReturnsError() {
		Assert.assertEquals( "Error2", "Number out of range", numberWords.convertLessThanOneThousand( "1000" ) ) ;
	}

}
