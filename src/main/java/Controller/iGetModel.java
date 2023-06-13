package Controller;

import Model.Student;

import java.util.Collections;
import java.util.List;

public interface iGetModel<T>{
    /**
     *
     * @return current class list of Students
     */
    public List getAllStudents();
    public int size();
}
