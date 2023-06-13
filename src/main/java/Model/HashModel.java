package Model;

import Controller.iGetModel;

import java.util.HashMap;

public class HashModel implements iGetModel<HashMap> {
    private HashMap<Long, Student> students;
    public HashModel(HashMap<Long, Student> students) {
        this.students = students;
    }
    public HashMap<Long, Student> getAllStudents() {
        return students;
    }

    @Override
    public int size() {
        return students.size();
    }


}
