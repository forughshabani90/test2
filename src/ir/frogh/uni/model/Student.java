package ir.frogh.uni.model;

public class Student extends Person implements PersonAction {

    private String Grade;
    private String FieldOfStudy;

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String Grade) {

        this.Grade = Grade;
    }

    public String getFieldOfStudy() {
        return FieldOfStudy;
    }

    public void setNameKh(String FieldOfStudy) {

        this.FieldOfStudy = FieldOfStudy;
    }

    @Override
    public void delete() {

    }

    @Override
    public void save() {

    }

    @Override
    public void update() {

    }

    @Override
    public void search() {

    }
}
