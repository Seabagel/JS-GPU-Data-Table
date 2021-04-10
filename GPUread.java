import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class GPUread {

	public static void main(String[] args) {
		try {
			List<String> allLines = Files.readAllLines(Paths.get("GpuData.txt"));
			String data = "";
			int count = 0;
			for (String line : allLines) {
				if (count == 0) {
					data += "<tr><td>" + line + "</td>";
					count += 1;
				} else if (count < 6) {
					data += "<td>" + line + "</td>";
					count += 1;
				} else {
					data += "<td>" + line + "</td></tr>";
					count = 0;
					System.out.println(data);
					data = "";
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}