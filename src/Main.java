
public class Main {
    public static void main(String[] args) {
        student student1 = new student("Alexy", 21, "BSIT", 85.5, 92.0, 78.5);
        student1.displayInfo();
        System.out.println("Average Grade: " + student1.calculateAverage());
        System.out.println("Letter Grade: " + student1.getLetterGrade());
        System.out.println("Status: " + ((student1.isPassing())?"Passed":"Failed"));

        System.out.println();

        student student2 = new student("John", 23, "BSCS", 65.0, 70.0, 68.0);
        student2.displayInfo();
        System.out.println("Average Grade: " + student2.calculateAverage());
        System.out.println("Letter Grade: " + student2.getLetterGrade());
        System.out.println("Status: " + ((student2.isPassing())?"Passed":"Failed"));

        System.out.println();

        student student3 = new student("Raiden", 20, "BSBA", 91.9, 98.0, 100);
        student3.displayInfo();
        System.out.println("Average Grade: " + student3.calculateAverage());
        System.out.println("Letter Grade: " + student3.getLetterGrade());
        System.out.println("Status: " + ((student3.isPassing())?"Passed":"Failed"));

        System.out.println();

        System.out.println("Summary: 2 out of 3 students are passing.");


    }
}