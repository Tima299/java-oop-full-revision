package sg.edu.ntu.chapterFour.fourTwo;

public class TestMain {
    public static void main(String[] args) {
        Student student = new Student("John", "Singapore", "Computer Science", 2020, 1000);
        Staff staff = new Staff("Jane", "Singapore", "NTU", 2000);
        System.out.println(student);
        System.out.println(staff);

        student.setFee(2000);
        staff.setPay(3000);
        System.out.println(student);
        System.out.println(staff);

        student.setProgram("Information Systems");
        staff.setSchool("NUS");
        System.out.println(student);

        System.out.println(staff);

        student.setYear(2021);
        staff.setAddress("Malaysia");
        System.out.println(student);
        System.out.println(staff);

    }
}
