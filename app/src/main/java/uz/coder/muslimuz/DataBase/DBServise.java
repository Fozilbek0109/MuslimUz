package uz.coder.muslimuz.DataBase;

import java.util.List;

import uz.coder.muslimuz.model.DuolarModel;

public interface  DBServise {
    void add(DuolarModel duolarModel);
    void deleteStudent(DuolarModel model);
    List<DuolarModel> getAllStudent();
    int getStudentCount();
    void editStudent();
    DuolarModel getStudentById(int id);
}
