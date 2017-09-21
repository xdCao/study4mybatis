package domain;

import java.math.BigDecimal;

public class Goal {

    private Long id;
    private Long studentId;
    private Course course;
    private BigDecimal scole;
    private String note;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public BigDecimal getScole() {
        return scole;
    }

    public void setScole(BigDecimal scole) {
        this.scole = scole;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
