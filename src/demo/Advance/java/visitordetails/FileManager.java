package demo.Advance.java.visitordetails;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileManager {
    static public File createFile() {
        File myObj = new File("filename.txt");
        try {
            boolean isFile = myObj.createNewFile();
            System.out.println("yes");
            return myObj;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void writeFile(File file, String record) {
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write(record);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String[] readFile(File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String records = bufferedReader.readLine();
            return records.split(";");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
