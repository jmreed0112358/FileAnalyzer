package fileanalyzer;

import java.io.File;
import java.nio.file.NoSuchFileException;

public class FileAnalyzer
{
	File	testFile	= null;

	public FileAnalyzer( )
	{

	}

	public void AnalyzeFile( String path ) throws NoSuchFileException,
			NullPointerException, SecurityException
	{
		try
		{
			testFile = new File( path );

			if ( testFile.exists( ) )
			{
				System.out.println( "Name: " + testFile.getName( ) );

				if ( testFile.isFile( ) )
				{
					System.out.println( testFile.getName( ) + " is a file." );
				}
				else
				{
					System.out
							.println( testFile.getName( ) + " is not a file." );
				}

				if ( testFile.isDirectory( ) )
				{
					System.out.println( testFile.getName( )
							+ " is a directory." );
				}
				else
				{
					System.out.println( testFile.getName( )
							+ " is not a directory." );
				}

				if ( testFile.isAbsolute( ) )
				{
					System.out.println( testFile.getName( )
							+ " is an absolute path." );
				}
				else
				{
					System.out.println( testFile.getName( )
							+ " is not an absolute path." );
				}

				System.out.println( "Last Modification time: "
						+ testFile.lastModified( ) );
				System.out.println( "Absolute Path:          "
						+ testFile.getAbsolutePath( ) );

				if ( testFile.isDirectory( ) )
				{
					String[] directoryListing = testFile.list( );

					System.out.println( "Directory Contents" );

					for( int i = 0 ; i < directoryListing.length ; ++i )
					{
						System.out.println( directoryListing[i] );
					}
				}
			}
			else
			{
				System.out.println( path + " does not exist." );

				throw new NoSuchFileException( path );
			}
		}
		catch( SecurityException e )
		{
			throw e;
		}
		catch( NullPointerException e )
		{
			throw e;
		}
		finally
		{

		}
	}
}
