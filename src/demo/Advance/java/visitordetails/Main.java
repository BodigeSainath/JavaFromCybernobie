package demo.Advance.java.visitordetails;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = FileManager.createFile();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            StringJoiner stringJoiner = new StringJoiner(",");
            System.out.println("Enter Name");
            String name = scanner.nextLine();

            System.out.println("Enter Phone Number");
            String phoneNumber = scanner.nextLine();

            System.out.println("Enter Email");
            String email = scanner.nextLine();

            stringJoiner.add(name)
                    .add(phoneNumber)
                    .add(email)
                    .add(";");
            String record = stringJoiner.toString();
            FileManager.writeFile(file, record);

            System.out.println("Do you want to enter another record(yes/no)");
            String input = scanner.nextLine();

            if (input.equals("yes")) {
            } else if (input.equals("no")) {
                break;
            } else {
                // Wrong input
            }
        }
        String[] records = FileManager.readFile(file);

        for (String record : records) {
            System.out.println(record);
        }
    }
}
