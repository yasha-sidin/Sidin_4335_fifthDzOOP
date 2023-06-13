package Controller;

import Model.HashModel;
import Model.Student;

import java.util.*;

public class Controller<T> {
    private iGetView<T> view;
    private iGetModel<T> model;
    private T students;

    /**
     * @param view  view part of MVP project
     * @param model model part of MVP project
     * @return init new Controller
     */
    public Controller(iGetView<T> view, iGetModel<T> model) {
        this.view = view;
        this.model = model;
        this.students = model.getAllStudents();
    }

    /**
     *
     * Assign students from model to students in this class
     */
    public void getAllStudents() {
        students = model.getAllStudents();
    }

    /**
     *
     * @return checking is students list empty or not
     */
    public boolean testData() {
        if (model.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     *
     * Print all students or not in depending on testData
     */
    public void update() {
        //MVP
        getAllStudents();
        if (testData()) {
            view.printAllStudents((List)students);
        } else {
            System.out.println("Список студентов пуст!");
        }

        //MVC
        //view.printAllStudents(model.getAllStudents());
    }

    /**
     *
     * Start using data in file
     */
    public void run() {
        Commands com = Commands.NONE;
        boolean getNewIteration = true;
        while (getNewIteration) {
            String command = view.prompt("Введите команду:");
            com = Commands.valueOf(command.toUpperCase());
            switch (com) {
                case EXIT:
                    getNewIteration = false;
                    System.out.println("Выход из программы!");
                    break;
                case LIST:
                    getAllStudents();
                    view.printAllStudents((HashMap<Long, Student>)students);
                    break;
            }

        }
    }

}
