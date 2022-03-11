package main;




public class Main {


    public static void main(String[] args) {

        Student student = new Student("John", "Smith", "4564/22");

        Student student1 = new Student("Pera", "Peric", "48654/22");
        Student student2 = new Student("Zika", "Zikic", "32432/22");


        Student.name = "My name: " + Utils.generateRandomNumber();

        System.out.println(Student.ispis());

        System.out.println(student);
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(Utils.generateRandomNumber());

        System.out.println(Math.pow(2,2));



    }


}
