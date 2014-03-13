package fileanalyzer;

import java.nio.file.NoSuchFileException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileAnalyzerMain
{

	public FileAnalyzerMain( )
	{
	}

	/**
	 * @param args
	 */
	public static void main( String[] args )
	{
		System.out.print( "Enter a file to analyze: " );
		Scanner userInput = new Scanner( System.in );

		FileAnalyzer fileAnalyzer = new FileAnalyzer( );

		try
		{
			fileAnalyzer.AnalyzeFile( userInput.nextLine( ) );
		}
		catch( NoSuchFileException e )
		{
			e.printStackTrace( );
		}
		catch( NoSuchElementException e )
		{
			e.printStackTrace( );
		}
		catch( IllegalStateException e )
		{
			e.printStackTrace( );
		}
		finally
		{
			userInput.close( );
		}
	}

}
