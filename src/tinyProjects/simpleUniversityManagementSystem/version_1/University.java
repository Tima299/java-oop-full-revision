package tinyProjects.simpleUniversityManagementSystem.version_1;

public class University {
    private String name;
    private String rectorFirstName;
    private String rectorLastName;
    private Students[] students;
    private Courses[] courses;
    private int idCounter = 10000;
    private int courseCounter = 10;


    /**
     * Constructor
     *
     * @param name name of the university
     */
    public University(String name) {
        this.name = name;
        students = new Students[1000];
        courses = new Courses[50];
    }

    /**
     * Getter for the name of the university
     *
     * @return name of university
     */
    public String getName() {
        return name;
    }

    /**
     * Defines the rector for the university
     *
     * @param first
     * @param last
     */
    public void setRector(String first, String last) {
        rectorFirstName = first;
        rectorLastName = last;
    }


    /**
     * Retrieves the rector of the university
     *
     * @return
     */
    public String getRector() {
        return rectorFirstName + " " + rectorLastName;
    }

    /**
     * Enroll a student in the university
     *
     * @param first first name of the student
     * @param last  last name of the student
     * @return
     */
    public int enroll(String first, String last) {
        Students student = new Students(idCounter, first, last);
        students[idCounter - 10000] = student;
        idCounter++;
        return student.getId();
    }

    /**
     * Retrieves the information for a given student
     *
     * @param id the id of the student
     * @return information about the student
     */
    public String student(int id) {
        Students student = students[id - 10000];
        System.out.println(student);
        return student.toString();
    }

    /**
     * Activates a new courses with the given teacher
     *
     * @param title   title of the courses
     * @param teacher name of the teacher
     * @return the unique code assigned to the courses
     */
    public int activate(String title, String teacher) {
        Courses courses = new Courses(courseCounter, title, teacher);
        this.courses[courseCounter - 10] = courses;
        courseCounter++;
        return courses.getCode();
    }

    /**
     * Retrieve the information for a given courses
     *
     * @param code unique code of the courses
     * @return information about the courses
     */
    public String course(int code) {
        Courses course = courses[code - 10];
        return course.toString();
    }

    /**
     * Register a student to attend a courses
     *
     * @param studentID  id of the student
     * @param courseCode id of the courses
     */
    public void register(int studentID, int courseCode) {
        Students student = students[studentID - 10000];
        Courses course = courses[courseCode - 10];
        course.register(student);

    }

    /**
     * Retrieve a list of attendees
     *
     * @param courseCode unique id of the courses
     * @return list of attendees separated by "\n"
     */
    public String listAttendees(int courseCode) {
        Courses course = courses[courseCode - 10];
        return course.listAttendees();

    }

    /**
     * Retrieves the study plan for a student
     *
     * @param studentID id of the student
     * @return list of courses the student is registered for
     */
    public String studyPlan(int studentID) {
        Students student = students[studentID - 10000];
        return student.studyPlan();
    }
}

