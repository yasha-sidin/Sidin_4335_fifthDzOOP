package Controller;

import Model.Student;

import java.util.*;

public interface iGetView {
    /**
     *
     * @param  students list of Students
     * @return print list of this Students
     */
    void printAllStudents(List students);

    /**
     *
     * @param  message message which will accompany the text input
     * @return input construction by using Scanner
     */
    String prompt(String message);

    void didWeDelete(boolean result);
}
