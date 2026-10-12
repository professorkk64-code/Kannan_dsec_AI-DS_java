public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
        System.out.println("Welcome to Programming.");
        System.out.println("My journey starts today.");
    }
}


question:2

public class Main {
    public static void main(String[] args) {
        System.out.println("College Name: DSEC College");
        System.out.println("Department: AI&DS");
        System.out.println("Course:java");
    }
}

question:3

public class Main {
    public static void main(String[] args) {
        System.out.print("Java is simple ");
        System.out.print("Java is powerful");
    }
}

question:4


public class Main {
    public static void main(String[] args) {
        System.out.print("Name\t: Arun\n");
        System.out.print("Course\t: Java\n");
        System.out.print("Level\t: Beginner\n");
    }
}

question:5

public class Main {
    public static void main(String[] args) {
        String name = "Arun";
        int age = 20;
        char grade = 'A';
        boolean placementStatus = true;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Placement Status: " + placementStatus);
    }
}

question:6

public class Main {
    public static void main(String[] args) {
        int population = 8000000;
        double productPrice = 1499.95;
        char bloodGroupSymbol = 'A';
        boolean accountVerified = true;
        String employeeName = "Kavin";

        System.out.println("Population: " + population);
        System.out.println("Product Price: " + productPrice);
        System.out.println("Blood Group Symbol: " + bloodGroupSymbol);
        System.out.println("Account Verified: " + accountVerified);
        System.out.println("Employee Name: " + employeeName);
    }
}

question:7

public class Main {
    public static void main(String[] args) {
        String name = "Laptop";
        int id = 101;
        double price = 49999.99;
        boolean availability = true;

        System.out.println("==============================");
        System.out.println("         PRODUCT CARD");
        System.out.println("==============================");
        System.out.println("Product Name : " + name);
        System.out.println("Product ID   : " + id);
        System.out.println("Price        : Rs. " + price);
        System.out.println("Availability : " + availability);
        System.out.println("==============================");
    }
}


question:8

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter your city: ");
        String city = sc.nextLine();

        System.out.println("Age: " + age);
        System.out.println("City: " + city);

        sc.close();
    }
}

question:9

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Full Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Percentage: ");
        double percentage = sc.nextDouble();

        System.out.println("\n==================================");
        System.out.println("       REGISTRATION RECEIPT");
        System.out.println("==================================");
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + rollNumber);
        System.out.println("Department   : " + department);
        System.out.printf("Percentage   : %.2f%%%n", percentage);
        System.out.println("==================================");

        sc.close();
    }
}

question:10

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String customerName = sc.nextLine();

        System.out.print("Enter Movie Name: ");
        String movieName = sc.nextLine();

        System.out.print("Enter Ticket Count: ");
        int ticketCount = sc.nextInt();

        System.out.print("Enter Ticket Price: ");
        double ticketPrice = sc.nextDouble();

        System.out.println("\n==================================");
        System.out.println("         BOOKING SUMMARY");
        System.out.println("==================================");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Movie Name    : " + movieName);
        System.out.println("Ticket Count  : " + ticketCount);
        System.out.println("Ticket Price  : Rs. " + ticketPrice);
        System.out.println("==================================");

        sc.close();
    }
}