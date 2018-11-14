package university;

import student.school.School;

public class Student {
    private int age;//инициализируются значениями по умолчанию
    //числовые=0, boolean=false, char='0', объект=null
    private String name;//инициализируются значениями по умолчанию

    static int counter;

    private School school;





    {//вызывается каждый раз при создании объекта
        age=12;
        name="name";
    }

    static {//вызывается 1 раз при запуске программы
        counter++;
    }

//    public university.Student(){}

//    public university.Student(int age, String name){
//        this.age=age;
//        this.name=name;
//    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public static void printClassName(){
        System.out.println("university.Student");
    }

//    public university.Student(int age){ //если имя переменной, передаваемой конструктору равно имени переменной класса,
//                             //необходимо использовать this-указатель на текущий объект
//        this.age=age;
//    }
//
//    public university.Student(int ageOfStudent){
//        age=ageOfStudent;
//    }

    public Student(int age){
        this(age, "constructor 1");//означает вызов другого консруктора
    }

    public Student(){
        this(20,"constructor2");
        System.out.println("constructor 2 call");
        int a = 10;
    }

    public Student(int age, String name){
        this.age=age;
        this.name=name;
    }

    public Student(String name){
        this(20);
        this.name=name;
    }




//    public static void main(String[] args) {
//        university.Student st = new university.Student(15);
//        university.Student st1 = new university.Student();
//        university.Student st3 = new university.Student(12, "Ivan");
//        university.Student st4 = new university.Student("Igor");
//
//    }
}
