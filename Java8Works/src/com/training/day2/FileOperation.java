package com.training.day2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperation {
	//////////////// earlier to java 1.8 ///////////////////
	/*
	 * public static void writeToFile() { // earlier to 1.8 BufferedWriter bw =
	 * null; try { bw = new BufferedWriter(new FileWriter("sample.txt"));
	 * bw.write("Hello"); bw.newLine(); bw.write("How are you today?");
	 * bw.newLine(); bw.write("Nice Weather in Bengaluru"); bw.newLine();
	 * System.out.println("Data saved successfully"); } catch (IOException e) {
	 * e.printStackTrace(); } finally { try { bw.close(); } catch (IOException
	 * e) { e.printStackTrace(); } } }
	 */

	//////////////// since java 1.8 ///////////////////
	public static void writeToFile() throws IOException {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("NewSample.txt"))) {
			bw.write("Hello All");
			bw.newLine();
			bw.write("We are in mission road");
			bw.newLine();
			bw.write("in Bengaluru");
			bw.newLine();
		}
		System.out.println("Data saved successfully");
	}

	// To read from file earlier
	public static void readFromFile() throws FileNotFoundException, IOException {
		try (BufferedReader br = new BufferedReader(new FileReader("NewSample.txt"))) {
			String s = null;
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}
		}
	}

	// from java 1.8
	public static void readFromFile01() throws FileNotFoundException, IOException {
		try (BufferedReader br = new BufferedReader(new FileReader("Sample.txt"))) {
			br.lines().forEach(System.out::println);
		}
	}

	public static void main(String[] args) throws IOException {
		// writeToFile();
		//readFromFile();
		readFromFile01();
	}
}
