package Model;

public class Teacher extends Person{
    private String acadDegree;

    /**
     *
     * @param  firstName  first name of Teacher
     * @param  secondName second name of Teacher
     * @param  age        age of Teacher
     * @param  acadDegree academic degree of Teacher
     * @return init new Teacher
     */
    public Teacher(String firstName, String secondName, int age, String acadDegree) {
        super(firstName, secondName, age);
        this.acadDegree = acadDegree;
    }
}