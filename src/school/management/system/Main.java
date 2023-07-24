package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher ronald = new Teacher(1,"Ronald",5000);
        Teacher melissa = new Teacher(2,"Melissa",3500);
        Teacher pedro = new Teacher(3,"Pedro",3800);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(ronald);
        teacherList.add(melissa);
        teacherList.add(pedro);

        Student carito = new Student(1,"Carola",4);
        Student carla = new Student(2,"Carla",9);
        Student felipe = new Student(3,"Felipe",5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(carito);
        studentList.add(carla);
        studentList.add(felipe);

        School ghs = new School(teacherList,studentList);


        carito.payFees(5000);
        System.out.println("GHS School has earned $ "+ ghs.getTotalMoneyEarned());

        melissa.recieveSalary(melissa.getSalary());
        System.out.println("Now school has :"+ ghs.getTotalMoneyEarned());
    }
}
