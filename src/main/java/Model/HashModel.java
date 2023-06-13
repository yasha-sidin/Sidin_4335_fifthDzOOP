package Model;

import Controller.iGetModel;

import java.util.HashMap;

public class HashModel implements iGetModel<HashMap> {
    private HashMap<Long, Student> students;
    public HashModel(HashMap<Long, Student> students) {
        this.students = students;
    }
    public List getAllStudents() {
        return (List)students.entrySet();
    }

    @Override
    public int size() {
        return students.size();
    }

    @Override
    public boolean delete(int studentNum) {
        List studList = getAllStudents();
        for(var item : studList) {
            if (item[1].getId == studentNum) {
                studList.remove(item[1]);
                return true;
            }
        }
        return false;
    }
}
