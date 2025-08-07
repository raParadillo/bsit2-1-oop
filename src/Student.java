public class Student {
    String name;
    int age;
    String course;
    double grade1, grade2, grade3;
    double Average;

    public Student(String name, int age, String course, double grade1, double grade2, double grade3) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }
    public void displayInfo(){
        System.out.println("Name: "+name+", "+"Age: "+age+", "+"Course: "+course);
        System.out.println("Grades: "+grade1+", "+grade2+", "+grade3);
    }
    public double calculateAverage(){
        Average = (grade1+grade2+grade3)/3.0;
        return Average;
    }
    public String getLetterGrade() {
        double average = calculateAverage();
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
    public boolean isPassing(){
        return Average >= 70;
    }


}