package tinyProjects.simpleSchoolManagementSystem.version_1;

public class Main {
    public static void main(String[] args) {
        School school = new School();
        Teacher teacher1 = new Teacher(1, "Temur", "Eshboyev", 2800);
        Teacher teacher2 = new Teacher(2, "Suxrob", "Ergashev", 2700);
        Teacher teacher3 = new Teacher(3, "Azizbek", "Fattoev", 6200);
        Student student1 = new Student(1, "Naseer", "Abdulraheem", 12, 10000);
        Student student2 = new Student(2, "Agostini", "Alessandro", 9, 8000);
        Student student3 = new Student(3, "Ortiq", "Otajonov", 11, 1000);
        school.addTeacher(teacher1);
        school.addTeacher(teacher2);
        school.addTeacher(teacher3);
        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);


        System.out.println("Earned money:   $" + school.getTotalMoneyEarned());
        System.out.println("Spent money:   $" + school.getTotalMoneyEarned());

        student1.pay(5000);
        System.out.println(student1.getName() + " remained fees:   $ " + student1.getRemainingFees());

        teacher1.receiveSalary(1000);

        System.out.println("Earned money:  $ " + school.getTotalMoneyEarned());
        System.out.println("Spent money:  $ " + school.getTotalMoneyEarned());
        System.out.println();

        student2.pay(6000);
        System.out.println(student2.getName() + " remained fees:$ " + student2.getRemainingFees());

        teacher2.receiveSalary(1200);

        System.out.println("Earned money:  $ " + school.getTotalMoneyEarned());
        System.out.println("Spent money:  $ " + school.getTotalMoneyEarned());
    }
}
