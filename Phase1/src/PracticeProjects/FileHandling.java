package PracticeProjects;

import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class FileHandling {
public static void main(String[] args) {
	        String fileName = "sample.txt";
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
	            writer.write("Hi!");
	            writer.newLine();
	            writer.write("How are you ?");
	        } catch (IOException e) {
	            System.err.println("Error writing to the file: " + e.getMessage());
	        }
	        System.out.println("Reading file");
	        try (BufferedReader reader = new BufferedReader(new FileReader(fileName)) ) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);
	            }
	        } catch (IOException e) {
	            System.err.println("Error in reading the file: " + e.getMessage());
	        }
	        System.out.println("Appending to the file");
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true)) ) {
	            writer.write("\nWelcome to File Handling....");
	            writer.newLine();
	        } catch (IOException e) {
	            System.err.println("Error in appending to the file: " + e.getMessage());
	        }
	        System.out.println("Reading from the file after appending");
	        try (BufferedReader reader = new BufferedReader(new FileReader(fileName)) ) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);
	            }
	        } catch (IOException e) {
	            System.err.println("Error reading from the file: " + e.getMessage());
	        }
	    }
	}

