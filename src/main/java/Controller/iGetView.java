package Controller;

import Model.Student;

import java.util.*;

public interface iGetView<T> {
    /**
     *
     * @param  students list of Students
     * @return print list of this Students
     */
    void printAllStudents(HashMap<Long, Student> students);

    void printAllStudents(List<Student> students);

    /**
     *
     * @param  message message which will accompany the text input
     * @return input construction by using Scanner
     */
    String prompt(String message);
}
