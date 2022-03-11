package main;

public class Student {


    static String name;
    String lastName;
    String indexNum;
    public static final String UNI_NAME = "ekonomski fax";


    public Student(String name, String lastName, String indexNum) {
        this.name = name;
        this.lastName = lastName;
        this.indexNum = indexNum;
    }




    public static String ispis() {
        return "Student{" + "name= " + name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "lastName='" + lastName + '\'' +
                ", indexNum='" + indexNum + '\'' +
                '}';
    }
}
