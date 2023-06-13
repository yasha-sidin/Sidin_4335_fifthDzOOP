package Model;

public class Emploee extends Person{
    private String special;

    /**
     *
     * @param firstName  first name of Emploee
     * @param secondName second name of Emploee
     * @param age        age of Emploee
     * @param special    special of Emploee's work
     */
    public Emploee(String firstName, String secondName, int age, String special) {
        super(firstName, secondName, age);
        this.special = special;
    }
}