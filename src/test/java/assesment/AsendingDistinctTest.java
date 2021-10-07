package assesment;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.Test;

public class AsendingDistinctTest {
	@Test
	public void givenSmallFile_whenUsingFilesAPI_thenExtractedLineIsCorrect() throws IOException {
	    String extractedLine = Files.readAllLines(Paths.get("D:newfileread.txt")).get(2);

	    assertEquals("32", extractedLine);
	}
}
	