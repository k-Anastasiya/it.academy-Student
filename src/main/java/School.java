import java.util.ArrayList;

public class School {

    ArrayList<Student> studentList = new ArrayList<Student>();


    public void addNewStudent() {
        for (int i = 0; i < 10; i++) {
            Student student = new Student();
            student.setName();
            student.setSurname();
            student.setRating();
            student.setNumberClass();
            studentList.add(student);
        }
    }


    public double calculatorAverageRating() {
        int total = 0;
        for (int i = 0; i < studentList.size(); i++) {
            total += studentList.get(i).getRating();
        }
        double averageGrade = total / studentList.size();
        return averageGrade;
    }


}


