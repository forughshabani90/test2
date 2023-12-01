package ir.frogh.uni.model;

public class Teacher extends Person implements PersonAction, Pay{

    private int techNo;

    public int getTechNo() {
        return techNo;
    }

    public void setTechNo(int techNo) {
        this.techNo = techNo;
    }

    @Override
    public void solid() {

    }

    @Override
    public void edi() {

    }

    @Override
    public void padash() {

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
