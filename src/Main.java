import java.util.Scanner;



public class Main {
    public static void displayname(String id, String fname, String lname, String course, String section){
        System.out.println("-----------------------------------------------------");

        System.out.println("Student Id: "+id);
        System.out.println("Student name: "+fname+" "+lname);
        System.out.println("Course: "+course);
        System.out.println("Section: "+section);

    }
    public static void displayscore(int mid, int fin,  int pro, int att, double avg){
        System.out.println("-----------------------------------------------------");

        System.out.println("Midterms exam score: "+mid);
        System.out.println("Final exam score: "+fin);
        System.out.println("Project score: "+pro);
        System.out.println("Attendance Percentage: "+att);
        System.out.println("-----------------------------------------------------");




        System.out.println("averageScore: "+avg*100);

        if(avg*100<75){
            System.out.print("REMARK: ");
            System.out.print("FAILED");
        }else{
            System.out.print("REMARK: ");
            System.out.print("PASSED");
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        String GetID = scanner.nextLine();

        System.out.print("Enter First Name: ");
        String GetFname = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String GetLname = scanner.nextLine();

        System.out.print("Enter Course: ");
        String GetCourse = scanner.nextLine();

        System.out.print("Enter Section: ");
        String GetSection = scanner.nextLine();


        displayname(GetID, GetFname, GetLname, GetCourse, GetSection);

        System.out.println("-----------------------------------------------------");

        System.out.println("Enter Exam Scores on the following ");
        System.out.print("MIDTERM Exam Score: ");
        int GetMID = scanner.nextInt();

        System.out.print("FINAL Exam score: ");
        int GetFIN = scanner.nextInt();

        System.out.print("Project score: ");
        int GetPRO = scanner.nextInt();

        System.out.print("Attendance Percentage: ");
        int GetATT = scanner.nextInt();
        double Avgpercent = (GetMID+GetFIN+GetPRO+GetATT)/400d;

        displayscore(GetMID,GetFIN,GetPRO,GetATT,Avgpercent);

        scanner.close();
    }
}