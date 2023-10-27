package AssistedProjects;
import java.io.*;
import java.util.Scanner;

public class FileOperations {
public static void main(String[] args) {
	        String filename = "sample1.txt";
	        createFile(filename);
	        writeToFile(filename, "Hello, World!");
	        String content = readFromFile(filename);
	        System.out.println("File content: " + content);
	        updateFile(filename, "Updated content!");
	        content = readFromFile(filename);
	        System.out.println("Updated content: " + content);
	        deleteFile(filename);
	    }
public static void createFile(String filename) {
	        try {
	            File file = new File(filename);
	            if (file.createNewFile()) {
	                System.out.println("File created: " + filename);
	            } else {
	                System.out.println("File already exists.");
	            }
	        } catch (IOException e) {
	            System.err.println("Error creating the file: " + e.getMessage());
	        }
	    }
	    public static void writeToFile(String filename, String data) {
	        try (FileWriter writer = new FileWriter(filename)) {
	            writer.write(data);
	            System.out.println("Data written to the file.");
	        } catch (IOException e) {
	            System.err.println("Error writing to the file: " + e.getMessage());
	        }
	    }
	    public static String readFromFile(String filename) {
	        StringBuilder content = new StringBuilder();
	        try (Scanner scanner = new Scanner(new File(filename))) {
	            while (scanner.hasNextLine()) {
	                content.append(scanner.nextLine());
	            }
	        } catch (IOException e) {
	            System.err.println("Error reading the file: " + e.getMessage());
	        }
	        return content.toString();
	    }
	    public static void updateFile(String filename, String newData) {
	        try (FileWriter writer = new FileWriter(filename)) {
	            writer.write(newData);
	            System.out.println("File content updated.");
	        } catch (IOException e) {
	            System.err.println("Error updating the file: " + e.getMessage());
	        }
	    }
	    public static void deleteFile(String filename) {
	        File file = new File(filename);
	        if (file.delete()) {
	            System.out.println("File deleted: " + filename);
	        } else {
	            System.err.println("Error deleting the file.");
	        }
	    }
	}



