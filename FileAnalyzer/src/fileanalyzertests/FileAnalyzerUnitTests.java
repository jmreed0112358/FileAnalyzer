package fileanalyzertests;

import static org.junit.Assert.*;

import java.nio.file.NoSuchFileException;

import org.junit.Assert;
import org.junit.Test;

import fileanalyzer.FileAnalyzer;

public class FileAnalyzerUnitTests
{

	@Test
	public void TestAnalyzeFile( )
	{
		try
		{
			FileAnalyzer test = new FileAnalyzer( );

			test.AnalyzeFile( "data/test1HasPermissions.txt" );
			
			System.out.println( "Success." );
			
			// Bullshit code.
			boolean result = true;
			Assert.assertEquals( result, true );
		}
		catch( NoSuchFileException e )
		{
			System.out.println( "Caught NoSuchFileException." );

			e.printStackTrace( );
			
			fail( "Shouldn't have caught this exception." );
		}
	}

	@Test
	public void TestAnalyzeFileNoSuchFile( )
	{
		try
		{
			FileAnalyzer test = new FileAnalyzer( );

			test.AnalyzeFile( "FooBarNothing.txt" );
			
			fail( "Didn't catch the correct exception." );
		}
		catch( NoSuchFileException e )
		{
			System.out.println( "Caught NoSuchFileException." );

			e.printStackTrace( );
			
			// Bullshit code.
			boolean result = true;
			Assert.assertEquals( result, true );
		}
	}

	@Test
	public void TestAnalyzeFileNullPath( )
	{
		try
		{
			FileAnalyzer test = new FileAnalyzer( );

			String path = null;

			test.AnalyzeFile( path );
			
			fail( "Didn't catch the expected exception" );
		}
		catch( NullPointerException e )
		{
			System.out.println( "Caught NullPointerException" );
			e.printStackTrace( );
			
			// Bullshit code.
			boolean result = true;
			Assert.assertEquals( true, result );
		}
		catch( NoSuchFileException e )
		{
			System.out.println( "Caught NoSuchFileException" );
			e.printStackTrace( );
			
			fail( "Didn't catch the correct exception." );
		}
	}
}
