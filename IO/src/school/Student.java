package school;

public class Student {

    private String name;
    private String course;
    private boolean isEuropean;

    public Student(String name, String course, boolean isEuropean) {
        this.name = name;
        this.course = course;
        this.isEuropean = isEuropean;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public boolean isEuropean() {
        return isEuropean;
    }

    public void setEuropean(boolean european) {
        isEuropean = european;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", isEuropean=" + isEuropean +
                '}';
    }

    public String saveToDatabase(){
        return name + "," + course + "," + isEuropean;
    }
}
