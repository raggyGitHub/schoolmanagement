package school.management.system;

import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;

    private int totalMoneyEarned;
    private int totalMoneySpent;

    public School(List<Teacher> teachers, List<Student> students, int totalMoneyEarned, int totalMoneySpent) {
        this.teachers = teachers;
        this.students = students;
        this.totalMoneyEarned = totalMoneyEarned;
        this.totalMoneySpent = totalMoneySpent;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add (teacher);
    }

    public List<Student> getStudent() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public void updateMoneySpent(int MoneySpent) {
        totalMoneyEarned += MoneySpent;
    }
}
