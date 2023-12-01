package ir.frogh.uni.model;

public class Driver extends Person implements Switching {
    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public void Switching() {

    }
}
