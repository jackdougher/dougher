package devops.numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class NumberWordsApplication {
	private final NumberWords numberWords ;
	private final BufferedReader reader ;
	
	public NumberWordsApplication() throws IOException {
		numberWords = new NumberWords() ;
		reader = new BufferedReader( new InputStreamReader( System.in ) ) ;
	}
	
	public void execute() throws IOException {
		String strNumber = "";
		String rawData = "";
		
		while( true ) {
			try {
				// output "Enter number" message and read the value entered
				System.out.print( "Enter number (0 to exit): " ) ;
				rawData = reader.readLine() ;
				strNumber = numberWords.convertLessThanOneThousand( rawData );

				if ( strNumber == "0" ) return ;
				
				System.out.println( strNumber ) ;
				
			} catch ( NumberFormatException | IOException e ) {
				System.out.println( "Invalid number" ) ;
			} catch ( NullPointerException e ) {
				System.out.println( "Invalid number" ) ;
			} 
		}
	}

	public static void main(String[] args) throws IOException {
		new NumberWordsApplication().execute() ;
	}

}
