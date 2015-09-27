package writer;

import java.io.IOException;
import java.util.List;

import wrapper.IWrapper;

public abstract interface IWriter {
	public abstract void write(List<IWrapper> paramList, String paramString) throws IOException;
}