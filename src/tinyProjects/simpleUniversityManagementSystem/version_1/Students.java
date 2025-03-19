package tinyProjects.simpleUniversityManagementSystem.version_1;

public class Students {
    private int id;
    private String firstName;
    private String lastName;
    private Courses[] course;
    private int courseCounter = 0;

    public Students(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        course = new Courses[25];
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id + " " + firstName + " " + lastName;

    }

    public void addCourse(Courses courses) {
        course[courseCounter++] = courses;
    }
    public String studyPlan(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < courseCounter; i++) {
            sb.append(course[i].toString()).append("\n");
        }
        return sb.toString();
    }
}
