package Model;

public class Student extends Person implements Comparable<Student>{
    int id;

    /**
     *
     * @param  firstName  first name of Student
     * @param  secondName second name of Student
     * @param  age        age of Student
     * @param  id         id of Student
     * @return init new Student
     */
    public Student(String firstName, String secondName, int age, int id) {
        super(firstName, secondName, age);
        this.id = id;
    }

    /**
     *
     * @return id of Student
     */
    public int getId() {
        return id;
    }

    /**
     * @param  id id of Student
     * @return change id of Student to this id
     */
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + super.firstName + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", age=" + super.getAge() +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        System.out.println(super.getFirstName()+" - "+o.getFirstName());
        if(this.getAge()==o.getAge())
        {
            if(this.getId()==o.getId())
            {
                return 0;
            }
            if(this.getId()<o.getId())
            {
                return -1;
            }
            return 1;
        }
        if(this.getAge()<o.getAge())
        {
            return -1;
        }
        return 1;
    }
}