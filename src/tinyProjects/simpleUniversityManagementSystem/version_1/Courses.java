package tinyProjects.simpleUniversityManagementSystem.version_1;

public class Courses {
    private int code;
    private String title;
    private String teacherName;
    private Students[] attendees;

    private int studentCounter = 0;
    public Courses(int code, String title, String teacherName) {
        this.code = code;
        this.title = title;
        this.teacherName = teacherName;
        attendees = new Students[100];
    }

    public int getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public String getTeacherName() {
        return teacherName;
    }
    public void register(Students students){
        attendees[studentCounter++] = students;
        students.addCourse(this);
    }
    public String toString(){
        return code + "," + title + "," + teacherName;
    }

    public String listAttendees() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < studentCounter; i++) {
            sb.append(attendees[i].toString()).append("\n");
        }
        return sb.toString();
    }
}
