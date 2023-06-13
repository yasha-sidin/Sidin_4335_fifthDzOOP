package Model;

public class Person {
    protected String firstName;
    protected String secondName;
    protected int age;

    /**
     *
     * @param  firstName  first name of Person
     * @param  secondName second name of Person
     * @param  age        age of Person
     * @return init new Person
     */
    public Person(String firstName, String secondName, int age)
    {
        this.firstName=firstName;
        this.secondName=secondName;
        this.age=age;
    }

    /**
     *
     * @return first name of Person
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @param  firstName first name of person
     * @return change first name of Person to this first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @return second name of Person
     */
    public String getSecondName() {
        return secondName;
    }

    /**
     *
     * @param  secondName second name of person
     * @return change second name of Person to this second name
     */
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    /**
     *
     * @return age of Person
     */
    public int getAge() {
        return age;
    }

    /**
     *
     * @param  age age of Person
     * @return change age of Person to this age
     */
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                '}';
    }
}