package student;

import student.school.School;

public class Student {
    public static void main(String[] args) {
        School school = new School(200, "Kozlova 5");
        System.out.println(school.number);
//        System.out.println(school.address); //права доступа
//        System.out.println(school.getNumber());//права доступа
        System.out.println(school.getAddress());
        school.number=12;
//        school.adress="Tolbuhina 4";//права доступа
        school.setAddress("Lenina 3");
        school.setNumber(28);
    }
}
