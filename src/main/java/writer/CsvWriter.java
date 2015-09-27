package writer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import wrapper.IWrapper;

public class CsvWriter implements IWriter {
	
	public void write(List<IWrapper> wrappers, String dest) throws IOException {
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(dest);
			for (IWrapper wrapper : wrappers) {
				fileWriter.append(wrapper.toFormat() + "\n");
			}
		} catch (IOException e) {
			throw e;
		} finally {
			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				throw e;
			}
		}
	}
	
}
