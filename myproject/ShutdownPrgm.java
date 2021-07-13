package myproject;

import java.io.IOException;

public class ShutdownPrgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime run=Runtime.getRuntime();
		try {
			run.exec("shutdown /s /t 0");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
