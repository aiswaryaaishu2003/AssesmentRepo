package assesment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AsendingDistinct {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Path path = Paths.get(System.getProperty("user.dir")).resolve("D:newfileread.txt");
		BufferedReader reader = new BufferedReader(new FileReader(path.toFile()));
		List<String> NumberStore = new ArrayList<>();
		String line = reader.readLine();

		while (line != null) {
			NumberStore.add(line);
			line = reader.readLine();
		}
		
		List<List<String>> CombinedList = Arrays.asList(NumberStore);
		List<String> ExtractedList = CombinedList.stream().flatMap(i -> i.stream()).collect(Collectors.toList());
		List<String> SortedList = ExtractedList.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		
		SortedList.stream().distinct().forEach(System.out::println);
		
 
	}
}