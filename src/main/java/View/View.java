package View;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

public class View<T> implements iGetView<T> {
    @Override
    public void printAllStudents(HashMap<Long, Student> students) {
        System.out.println("------------Список студентов------------");
        for(Long value : students.keySet()) {
            System.out.println(value + " : " + students.get(value));
        }
        System.out.println("--------------Конец списка--------------");
    }

    @Override
    public void printAllStudents(List<Student> students) {
        System.out.println("------------List output------------");
        for(Student stud: students)
        {
            System.out.println(stud);
        }
        System.out.println("------------End of list------------");
    }

    @Override
    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}

