

public class Main {
    public static void main(String[] args) {
        System.out.println("Student Information:");

        Student student1 = new Student("Alexy", 21, "BSIT", 85.5, 92.0, 78.5);
        student1.displayInfo();
        System.out.println("Average Grade: " + student1.calculateAverage());
        System.out.println("Letter Grade: " + student1.getLetterGrade());
        System.out.println("Status: " + ((student1.isPassing())?"PASSED":"FAILING"));

        System.out.println();

        Student student2 = new Student("John", 23, "BSCS", 65.0, 70.0, 68.0);
        student2.displayInfo();
        System.out.println("Average Grade: " + student2.calculateAverage());
        System.out.println("Letter Grade: " + student2.getLetterGrade());
        System.out.println("Status: " + ((student2.isPassing())?"PASSED":"FAILING"));

        System.out.println();

        Student student3 = new Student("Raiden", 20, "BSBA", 91.9, 98.0, 100);
        student3.displayInfo();
        System.out.println("Average Grade: " + student3.calculateAverage());
        System.out.println("Letter Grade: " + student3.getLetterGrade());
        System.out.println("Status: " + ((student3.isPassing())?"PASSED":"FAILING"));
        
        System.out.println();

        System.out.println("Summary: 2 out of 3 students are passing.");


    }
}
