package liang_problem_book.problem_10_9;

public class Course {
/*10.9 (The Course class) Revise the Course class as follows:
■■ Revise the getStudents() method to return an array whose length is the
same as the number of students in the course. (Hint: create a new array and
copy students to it.)
■■ The array size is fixed in Listing 10.6. Revise the addStudent method to automat-
ically increase the array size if there is no room to add more students. This is done
by creating a new larger array and copying the contents of the current array to it.
■■ Implement the dropStudent method.
■■ Add a new method named clear() that removes all students from the course.
*/

    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents == students.length) {
            String[] temp = new String[students.length * 2];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        String[] temp = new String[numberOfStudents];
        System.arraycopy(students, 0, temp, 0, numberOfStudents);
        return temp;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        int index = -1;
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                index = i;
                break;
            }
        }
        if (index >= 0) {
            for (int i = index; i < numberOfStudents - 1; i++) {
                students[i] = students[i + 1];
            }
            students[numberOfStudents - 1] = null;
            numberOfStudents--;
        }
    }

    public void clear() {
        students = new String[100];
        numberOfStudents = 0;
    }
}
