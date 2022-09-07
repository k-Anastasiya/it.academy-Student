public class Runner {

    public static void main(String[] args) {
        int numberOfStudents;
        Student student = new Student(10);
        student.generateNewStudent(10);
        student.calculatorAverageRating();

        System.out.println(student.calculatorAverageRating());


    }
}