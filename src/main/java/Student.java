import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;

import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

public class Student extends School{
    public Student() {
    }

    public Student(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    private String name;
    private String surname;
    private int rating;
    private int numberClass;
    private double average;
    private int numberOfStudents;



    public int getNumberClass() {
        return numberClass;
    }

    public int setNumberClass() {
        numberClass=(int) (Math.random()*10+1);
        return this.numberClass ;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        String random =toLowerCase( RandomStringUtils.randomAlphabetic(10));
        name = random.substring(0, 1).toUpperCase() + random.substring(1);
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname() {
        String random =toLowerCase( RandomStringUtils.randomAlphabetic(10));
        surname = random.substring(0, 1).toUpperCase() + random.substring(1);
        this.surname = surname;
    }

    public int getRating() {
        return rating;
    }

    public void setRating() {
       rating = (int) (Math.random()*10+1);
        this.rating = rating;
    }
    ArrayList<Student> studentList = new ArrayList<Student>();
    public void generateNewStudent(int numberOfStudents) {
        for (int i = 0; i < numberOfStudents; i++) {
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






