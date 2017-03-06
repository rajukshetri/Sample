package Hi;

import java.io.IOException;
import java.io.OutputStream;



class Cmdtest
{
	String new_dir = "TestCmd";
	void cmdopen()
	{
		try {
		    // Execute command
		    String command = "cmd /c start cmd.exe java -version";
		    Process child = Runtime.getRuntime().exec(command);

		    // Get output stream to write from it
		    OutputStream out = (OutputStream) child.getOutputStream();

		    out.write("cd C:/ /r/n".getBytes());
		    out.flush();
		    out.write("dir /r/n".getBytes());
		    out.write("Hello".getBytes());
		    out.close();
		} catch (IOException e) {
		}
	}
	public static void main(String[] args) {
		Cmdtest st = new Cmdtest();
		st.cmdopen();
		
	}
}