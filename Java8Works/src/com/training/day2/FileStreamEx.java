package com.training.day2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.function.Predicate;
import java.nio.file.Path;

public class FileStreamEx {
	public static void doSomeAction(String fileName) {
		System.out.println("File: " + fileName);
	}

	public static void main(String[] args) throws IOException {
		// Files.list(Paths.get(".")).map(Path::getFileName).forEach(System.out::println);
		Files.list(Paths.get(".")).map(Path::getFileName).map(Path::toString).map(String::toUpperCase)
				.filter(name -> name.endsWith(".TXT")).sorted().skip(1).limit(5).forEach(name -> doSomeAction(name));
		////////////////////////
		Predicate<String> p = name -> name.equalsIgnoreCase("exilant");
		Files.list(Paths.get(".")).map(Path::getFileName).map(Path::toString)
				.filter(name -> name.equalsIgnoreCase("sample.txt")).anyMatch(p);

	}
}
