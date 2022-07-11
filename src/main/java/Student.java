import org.apache.commons.lang3.RandomStringUtils;

import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

public class Student extends School{

    private String name;
    private String surname;
    private int rating;
    private int numberClass;
    private static double average;



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



}



