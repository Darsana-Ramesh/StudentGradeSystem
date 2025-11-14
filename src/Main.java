import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Student Grade System ===");

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter mark 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter mark 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter mark 3: ");
        int m3 = sc.nextInt();

        Student s = new Student(name, m1, m2, m3);

        System.out.println("\n=== Student Report ===");
        System.out.println("Name: " + s.getName());
        System.out.println("Total Marks: " + GradeCalculator.getTotal(s));
        System.out.println("Average: " + GradeCalculator.getAverage(s));
        System.out.println("Grade: " + GradeCalculator.getGrade(s));

        sc.close();
    }
}
