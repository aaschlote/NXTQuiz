package br.com.lejos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class LejosController {

	private final String fileName = "RunTest.java";

	public void executarComando(int index) {

		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter(fileName));
			writer.write(LejosConstants.getPrograma(index - 1));
			writer.close();

			Thread.sleep(1000);
			Process process = Runtime.getRuntime().exec("compile.bat");
			process.waitFor();
			BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String line = null;

			while ((line = input.readLine()) != null)
				System.out.println(line);

			Thread.sleep(1000);
			process = Runtime.getRuntime().exec("link.bat");
			process.waitFor();
			input = new BufferedReader(new InputStreamReader(process.getInputStream()));
			line = null;

			while ((line = input.readLine()) != null)
				System.out.println(line);
			Thread.sleep(1000);

			process = Runtime.getRuntime().exec("upload.bat");
			input = new BufferedReader(new InputStreamReader(process.getInputStream()));
			line = null;

			process.waitFor();
			while ((line = input.readLine()) != null)
				System.out.println(line);
		} catch (Exception e) {
			System.err.println(e);
		} finally {
			try {
				if (writer != null)
					writer.close();
			} catch (IOException e) {

			}
		}

	}

	public static void main(String[] args) {
		LejosController lejosController = new LejosController();
		lejosController.executarComando(23);
	}

}
