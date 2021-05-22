package aop;

public class Student {
    private String nameSurname;
    private int course;
    private Double avfGrade;

    public Student(String nameSurname, int course, Double avfGrade) {
        this.nameSurname = nameSurname;
        this.course = course;
        this.avfGrade = avfGrade;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Double getAvfGrade() {
        return avfGrade;
    }

    public void setAvfGrade(Double avfGrade) {
        this.avfGrade = avfGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameSurname='" + nameSurname + '\'' +
                ", course=" + course +
                ", avfGrade=" + avfGrade +
                '}';
    }
}
